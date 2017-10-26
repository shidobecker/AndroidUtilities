package kotlin.shido.com.androidutilities.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.shido.com.androidutilities.Prefs;

public class OnClearFromRecentService extends Service {



    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {


        stopSelf();
    }

    private Integer getTeacherIdFromSignup() {

        Integer teacherIdFromSignup = 2;

        if (teacherIdFromSignup == -1)
            return null;


         return teacherIdFromSignup;
    }
}
