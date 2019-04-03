package test.srz.com.httpdemo.http;


import android.content.Context;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import test.srz.com.httpdemo.AppContext;
import test.srz.com.httpdemo.util.LogUtil;
import test.srz.com.httpdemo.util.NetworkUtils;
import test.srz.com.httpdemo.util.ToastUtil;

/**
 * Created by shaobing on 2017/3/31.
 */

public class HttpController<T> {

    private static HttpController mHttpController;

    public static HttpController getIntance(){
        if(mHttpController==null){
            mHttpController = new HttpController();
        }
        return mHttpController;
    }

    /**
     * 基本模板
     * @param observable 观察者
     * @param index      当前返回值ID
     * @param listener   回调监听
     */
    public static void http(Observable<String> observable, final int index, final OnRequestListener<String> listener){
        if (!NetworkUtils.isNetworkConnected(AppContext.getmAppContext())) {
            if (listener != null) {
                listener.onHideLoading();
                listener.onNoNetwork();
            }
            return;
        }
        if (listener != null) {
            listener.onShowLoading();
        }
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (listener != null) {
                            listener.onHideLoading();
                            listener.onError(e.getMessage()==null?"on error":e.getMessage());
                        }
                    }

                    @Override
                    public void onNext(String message) {
                        if (listener != null) {
                            listener.onHideLoading();
                            listener.onSuccessAndUpdateUI(index,message);
                        }
                    }
                });
    }




    /**
     * 基本模板
     * @param observable 观察者
     * @param index      当前返回值ID
     * @param listener   回调监听
     */
    public void httpT(Observable<T> observable, final int index, final OnRequestListener<T> listener){
        if (!NetworkUtils.isNetworkConnected(AppContext.getmAppContext())) {
            if (listener != null) {
                listener.onNoNetwork();
            }
            return;
        }
        if (listener != null) {
            listener.onShowLoading();

        }
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<T>() {
                    @Override
                    public void onCompleted() {


                    }

                    @Override
                    public void onError(Throwable e) {
                        LogUtil.e("onError  ", e);
                        if (listener != null) {
                            listener.onHideLoading();
                            listener.onError(e.getMessage()==null?"on error":e.getMessage());
                        }
                    }

                    @Override
                    public void onNext(T message) {

                        if (listener != null) {
                            listener.onHideLoading();
                            listener.onSuccessAndUpdateUI(index,message);
                        }
                    }
                });
    }

    /**
     * 将call加入队列并实现回调
     *
     * @param call             调入的call
     * @param retrofitCallBack 回调
     * @param method           调用方法标志，回调用
     * @param <T>              泛型参数
     */
    public <T> void addToEnqueue(Call<T> call, final RetrofitCallBack<Response<T>> retrofitCallBack, final int method) {
        final Context context = AppContext.getmAppContext();
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                LogUtil.d("retrofit back code ====" + response.code());
                if (null != response.body()) {
                    if (response.code() == 200) {
                        LogUtil.d("retrofit back body ====" + new Gson().toJson(response.body()));
                        retrofitCallBack.onResponse(response, method);
                    } else {
                        LogUtil.d("toEnqueue, onResponse Fail:" + response.code());
                        ToastUtil.showShortToast(context, "网络连接错误" + response.code());
                        retrofitCallBack.onFailure(response, method);
                    }
                } else {
                    LogUtil.d("toEnqueue, onResponse Fail m:" + response.message());
                    ToastUtil.showShortToast(context, "网络连接错误" + response.message());
                    retrofitCallBack.onFailure(response, method);
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                LogUtil.d("toEnqueue, onResponse Fail unKnown:" + t.getMessage());
                t.printStackTrace();
                ToastUtil.showShortToast(context, "网络连接错误" + t.getMessage());
                retrofitCallBack.onFailure(null, method);
            }
        });
    }
}











