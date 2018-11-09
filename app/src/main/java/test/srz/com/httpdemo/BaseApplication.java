package test.srz.com.httpdemo;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatDelegate;

/**
 * description:基本 application类文件
 * Date: 2016/9/8 18:04
 * User: shaobing
 */
public class BaseApplication
        extends Application
{

    private static Context mContext;
    private static String  sCacheDir;

    static {
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_NO);
    }

    /**
     * 获取系统Context
     * @return 返回值
     */
   public static Context getAppContext(){
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        AppContext.init(getApplicationContext());




        /**
         * 如果存在SD卡则将缓存写入SD卡,否则写入手机内存
         */
        if (getApplicationContext().getExternalCacheDir() != null && ExistSDCard()) {
            sCacheDir = getApplicationContext().getExternalCacheDir().toString();
        } else {
            sCacheDir = getApplicationContext().getCacheDir().toString();
        }
    }
    private boolean ExistSDCard() {
        return android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED);
    }



    public static String getAppCacheDir() {
        return sCacheDir;
    }

}
