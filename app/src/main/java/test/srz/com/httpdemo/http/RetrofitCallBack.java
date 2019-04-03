package test.srz.com.httpdemo.http;

/**
 *  项目描述:
 *  作者: shenrunzhou 
 *  创建时间  :2019-04-03  10:47
 */
public interface RetrofitCallBack<T> {

    void onResponse(T response, int method);
    void onFailure(T response, int method);
}
