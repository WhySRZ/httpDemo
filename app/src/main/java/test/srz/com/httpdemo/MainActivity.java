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
}
