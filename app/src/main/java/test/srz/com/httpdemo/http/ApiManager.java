package test.srz.com.httpdemo.http;

import android.util.Log;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.platform.Platform;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import test.srz.com.httpdemo.constant.HttpConstant;
import test.srz.com.httpdemo.util.LogUtil;

/**
 * description: 网络请求类
 * Date: 2016/9/9 17:49
 * User: shaobing
 */
public class ApiManager {
    private static final String TAG = "SingleTask";
    /**
     * 实例化Retrofit
     */
    private static Retrofit                 sRetrofit;
    private static List<MultipartBody.Part> params;
    private static ApiManager               mApiManager;
    private static Map<String, RequestBody> params2;

    /**
     * 初始化OkHttp3的客户端
     */

    public static ApiManager getInstance() {
        if (mApiManager == null) {
            mApiManager = new ApiManager();
            params = new ArrayList<>();
            params2 = new HashMap<>();
        }
        return mApiManager;
    }
    private static OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(new LoggingInterceptor.Builder()
                    .loggable(LogUtil.sIsDebug)
                    .setLevel(Level.BODY)
                    .log(Platform.INFO)
                    .request("测试 Request")
                    .response("我的测试 Response")
                    .build())
            .cache(new Cache(new File("C://okhttp"), 10 * 1024 * 102))//缓存
            .retryOnConnectionFailure(true)
            .connectTimeout(HttpConstant.MAX_TIME_OUT, TimeUnit.SECONDS)//设置超时时间
            .readTimeout(HttpConstant.MAX_TIME_OUT, TimeUnit.SECONDS)
            .writeTimeout(HttpConstant.MAX_TIME_OUT, TimeUnit.SECONDS)
            .addNetworkInterceptor(new StethoInterceptor())//添加Stetho的拦截器
            .build();

    /**
     * OkHttp3 的监听
     */
    private static class LogInterceptor implements Interceptor {
        @Override
        public okhttp3.Response intercept(Chain chain) throws IOException {
            Request request = chain.request();

            Log.e(TAG, "-------------------------request---------------------------");
            Log.e(TAG, "request:" + request.toString());
            long t1 = System.nanoTime();
            okhttp3.Response response = chain.proceed(chain.request());
            long t2 = System.nanoTime();
            Log.e(TAG, String.format(Locale.getDefault(), "Received response for %s in %.1fms%n%s",
                    response.request().url(), (t2 - t1) / 1e6d, response.headers()));
            Log.e(TAG,new Gson().toJson(request.headers()));
            okhttp3.MediaType mediaType = response.body().contentType();
            String content = response.body().string();
            Log.e(TAG, "-------------------------response---------------------------");
            Log.e(TAG, "response body:" + content);
            Log.e(TAG, "-------------------------end---------------------------");
            //输出请求参数
            return response.newBuilder()
                    .body(okhttp3.ResponseBody.create(mediaType, content))
                    .build();
        }
    }

    /**
     * 初始化Retrofit
     */
    public static Retrofit getsRetrofit(){
        if(sRetrofit==null){
            sRetrofit = new Retrofit.Builder()
                    .client(client)
                    .baseUrl(HttpConstant.GET_URL)
                    .addConverterFactory(GsonConverterFactory.create())//加入json解析
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) // 使用RxJava作为回调适配器
                    .build();
        }
        return sRetrofit;
    }


    public ApiManager addParameter( Object o) {
        MultipartBody.Part part;
        RequestBody        body = RequestBody.create(MediaType.parse("multipart/form-data;charset=UTF-8"), (File) o);
        part = MultipartBody.Part.createFormData("upload_file", "student.jpg", body);
        params.add(part);
        return this;
    }

    /**
     * 构建RequestBody
     */
    public List<MultipartBody.Part> bulider() {

        return params;
    }
    public void clear(){
        params.clear();
    }


    //第二种
    /**
     * 添加参数
     * 根据传进来的Object对象来判断是String还是File类型的参数
     */
    public ApiManager addParameter(String key, Object o) {

        if (o instanceof String) {
            RequestBody body = RequestBody.create(MediaType.parse("text/plain;charset=UTF-8"), (String) o);
            params2.put(key, body);
        } else if (o instanceof File) {
            RequestBody body = RequestBody.create(MediaType.parse("multipart/form-data;charset=UTF-8"), (File) o);
            params2.put(key + "\"; filename=\"" + ((File) o).getName() + "", body);
        }
        return this;
    }

    /**
     * 构建RequestBody
     */
    public Map<String, RequestBody> bulider2() {

        return params2;
    }

    public void clear2(){
        params.clear();
    }

}
