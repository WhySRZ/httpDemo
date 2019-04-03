package test.srz.com.httpdemo.modle;


import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;
import rx.Observable;
import test.srz.com.httpdemo.bean.BaseBean;
import test.srz.com.httpdemo.bean.TestBean;
import test.srz.com.httpdemo.bean.getLocationBean;
import test.srz.com.httpdemo.bean.upDataUserInfoBean;
import test.srz.com.httpdemo.param.getLocationParam;
import test.srz.com.httpdemo.param.upDateUserInfoParam;

/**
 *  项目描述:我的接口请求
 *  作者: yanshu
 *  创建时间  :2018.2.26  11:08
 */

public interface HttpMyModel {

    /**
     * 我的
     * http://ngk.ys100.com:5080/api/login
     * */
    /*@POST("api/login")
    Observable<LoginBean> login(@Body LoginParam param);*/


    //获取用户详情
    @GET("random/data/Android/20")
    Observable<TestBean> getTestHttp();

    //更新用户详情
    @POST("api/mobile/execute")
    Observable<upDataUserInfoBean> upDataUserInfo(@Body upDateUserInfoParam param);

    //根据code获取下级列表

    @POST("api/mobile/execute")
    Observable<getLocationBean> getLocationList(@Body getLocationParam param);


    //上传文件的写法第一种
    @Multipart
    @POST("teacher/classzone/upload_file")
    Call<BaseBean> upLoad1(@Query("grade_id") String gradeId,
                               @Query("join_id") String joinId,
                               @Query("resource_type") String resourceType,
                               @Query("class_id") String classId,
                               @Query("account") String account,
                               @Query("token") String token,
                               @Part List<MultipartBody.Part> parts);


    //上传文件的写法第二种
    @Multipart
    @POST("file/upLoad.do")
    Call<BaseBean> upLoad2(@PartMap Map<String, RequestBody> params);
}
