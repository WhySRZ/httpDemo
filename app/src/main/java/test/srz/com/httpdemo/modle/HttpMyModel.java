package test.srz.com.httpdemo.modle;


import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;
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


}
