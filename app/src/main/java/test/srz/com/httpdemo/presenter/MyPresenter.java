package test.srz.com.httpdemo.presenter;


import retrofit2.Call;
import retrofit2.Response;
import test.srz.com.httpdemo.bean.BaseBean;
import test.srz.com.httpdemo.bean.TestBean;
import test.srz.com.httpdemo.bean.getLocationBean;
import test.srz.com.httpdemo.bean.getUserInfoDetailBean;
import test.srz.com.httpdemo.bean.upDataUserInfoBean;
import test.srz.com.httpdemo.http.ApiManager;
import test.srz.com.httpdemo.http.HttpController;
import test.srz.com.httpdemo.http.OnRequestListener;
import test.srz.com.httpdemo.http.RetrofitCallBack;
import test.srz.com.httpdemo.modle.HttpMyModel;
import test.srz.com.httpdemo.param.getLocationParam;
import test.srz.com.httpdemo.param.getUserInfoDetailParam;
import test.srz.com.httpdemo.param.upDateUserInfoParam;

/**
 *  项目描述:我的
 *  作者: shenrunzhou
 *  创建时间  :2017/11/24  13:52
 */

public class MyPresenter {


   /* public static void login(String userId, String password, final OnRequestListener<LoginBean> listener) {

        LoginParam loginParam = new LoginParam();
        loginParam.setUser_id(userId);
        loginParam.setPassword(password);

        LogUtil.d("daying" + loginParam.toString());


        HttpController.getIntance().httpT(ApiManager.getsRetrofit().create(HttpLoginModel.class).login(loginParam), 1, listener);
    }*/

   //获取用户详情
      public static void getUserInfoDetail(String userId, String token, final OnRequestListener<getUserInfoDetailBean> listener) {

          getUserInfoDetailParam param = new getUserInfoDetailParam();
          param.setAccountCode(userId);
          param.setAccessToken(token);
          param.setCallName("SEL_INFOBYACCOUNTCODE");

       // HttpController.getIntance().httpT(ApiManager.getsRetrofit().create(HttpMyModel.class).getUserInfoDetail(param), 1, listener);
    }

    //更新用户信息
    public static void upDataUserInfo(upDateUserInfoParam param, final OnRequestListener<upDataUserInfoBean> listener) {

        HttpController.getIntance().httpT(ApiManager.getsRetrofit().create(HttpMyModel.class).upDataUserInfo(param), 1, listener);
    }

    //根据code获取下级列表
    public static void getLocationList(String code, final OnRequestListener<getLocationBean> listener) {

        getLocationParam param = new getLocationParam();
        param.setAccountCode("97507873705203257");
        param.setAccessToken("1e8065cd955807704d0b01fc4229b708e468551c");
        getLocationParam.RegionBean bean = new getLocationParam.RegionBean();
        bean.setCode(code);
        param.setRegion(bean);

        HttpController.getIntance().httpT(ApiManager.getsRetrofit().create(HttpMyModel.class).getLocationList(param), 1, listener);
    }

    //testhttp
    public static void getTestHttp(final OnRequestListener<TestBean> listener){

          HttpController.getIntance().httpT(ApiManager.getsRetrofit().create(HttpMyModel.class).getTestHttp(),1,listener);
    }
    //测试上传
    public static void test(Call call, final RetrofitCallBack<Response<BaseBean>> listener) {

        //HttpController.getIntance().httpT(ApiManager.getsRetrofit().create(UploadModel2.class).insertInfo(param), 2, listener);
        //HttpController.getIntance().loadFile(call,2,listener);
        HttpController.getIntance().addToEnqueue(call,listener,1);
    }

    public static void test2(Call call, final RetrofitCallBack<Response<BaseBean>> listener) {

        //HttpController.getIntance().httpT(ApiManager.getsRetrofit().create(UploadModel2.class).insertInfo(param), 2, listener);
        //HttpController.getIntance().loadFile(call,2,listener);
        HttpController.getIntance().addToEnqueue(call,listener,1);
    }
}



