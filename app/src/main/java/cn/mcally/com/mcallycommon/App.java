package cn.mcally.com.mcallycommon;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import cn.mcally.com.common.crash.NeverCrash;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        NeverCrash.init(new NeverCrash.CrashHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                Log.d("Jenly", Log.getStackTraceString(e));
//                e.printStackTrace();
                showToast("很抱歉程序异常,正在收集异常");


            }
        });
    }

    private void showToast(final String text){

        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
