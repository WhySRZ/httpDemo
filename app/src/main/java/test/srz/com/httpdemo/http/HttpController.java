package test.srz.com.httpdemo.http;


import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import test.srz.com.httpdemo.AppContext;
import test.srz.com.httpdemo.util.LogUtil;
import test.srz.com.httpdemo.util.NetworkUtils;

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
}











