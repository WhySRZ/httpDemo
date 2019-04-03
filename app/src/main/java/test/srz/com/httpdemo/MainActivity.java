package test.srz.com.httpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import test.srz.com.httpdemo.bean.TestBean;
import test.srz.com.httpdemo.http.OnRequestListener;
import test.srz.com.httpdemo.presenter.MyPresenter;

public class MainActivity
        extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        upLoad1();
        upLoad2();
        Button button = (Button) findViewById(R.id.bt_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                MyPresenter.getTestHttp(new OnRequestListener<TestBean>() {
                    @Override
                    public void onShowLoading() {

                    }

                    @Override
                    public void onHideLoading() {

                    }

                    @Override
                    public void onSuccessAndUpdateUI(int code, TestBean bean) {
                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onNoNetwork() {

                    }

                    @Override
                    public void onError(String message) {

                    }
                });
                /*MyPresenter.getLocationList("100000", new OnRequestListener<getLocationBean>() {
                    @Override
                    public void onShowLoading() {

                    }

                    @Override
                    public void onHideLoading() {

                    }

                    @Override
                    public void onSuccessAndUpdateUI(int code, getLocationBean bean) {

                        if ("SUCCESS".equals(bean.getRetCode())){
                            Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onNoNetwork() {

                    }

                    @Override
                    public void onError(String message) {

                    }
                });*/






            }
        });

    }

    private void upLoad2() {

              /*  ApiManager apiManager = ApiManager.getInstance();
                apiManager.clear();
                for (int i = 0; i < items.size(); i++) {
                    if (StringUtils.isNotEmpty((String) items.get(i)))
                        if ("add".equals(items.get(i))){
                            continue;
                        }
                    File file = new File(items.get(i).toString());
                    apiManager = apiManager.addParameter(("pic"+i),file);
                }
                Map<String, RequestBody> params = apiManager
                        .addParameter("status", "4")
                        .addParameter("pickupId", tv_orderquality_pid.getText().toString())
                        .addParameter("cause", reason)
                        .addParameter("connectname", et_orderquality_lxrname.getText().toString())
                        .addParameter("connectphone", et_orderquality_lxrphone.getText().toString())
                        .addParameter("details", et_orderquality_xqms.getText().toString())
                        .bulider();

                MyPresenter.test2(ApiManager.getsRetrofit().create(HttpMyModel.class).upLoad2(params),this);*/
    }

    private void upLoad1() {
        //上传图片

                  /*ApiManager apiManager = ApiManager.getInstance();
        apiManager.clear();

        for (int i = 0; i < items.size(); i++) {
            if (StringUtils.isNotEmpty((String) items.get(i)))
                if ("add".equals(items.get(i))){
                    continue;
                }
            File file = new File(items.get(i).toString());
            apiManager = apiManager.addParameter(file);
        }
   MyPresenter.test(ApiManager.getsRetrofit().create(HttpMyModel.class).upLoad1(StuInfoDao.getStuInfo()
                                                                                        .getGrade_id(),
                                                                  mJoin_id,
                                                                  Contants.IMAGE_TYPE,
                                                                  StuInfoDao.getStuInfo()
                                                                            .getClass_id(),
                                                                  SharedPreferenceUtils.getAccount(),
                                                                  SharedPreferenceUtils.getToken(),
                                                                  apiManager.bulider()),
                          this);
*/
    }
}
