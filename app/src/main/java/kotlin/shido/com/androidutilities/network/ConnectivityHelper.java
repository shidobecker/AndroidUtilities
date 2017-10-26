package kotlin.shido.com.androidutilities.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import edu.mira.aula.statement.enums.NetworkStatus;

public class ConnectivityHelper {

    public static boolean isOnline(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }


    public static int getNetworkStatus(Context context) {
        int networkStatus = 0;
        try {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo info = cm.getActiveNetworkInfo();
            if (info == null || !info.isAvailable() || !info.isConnected()) {
                //networkStatus = NetworkStatus.SD_OFFLINE.getCode();
            }
            int netType = info.getType();
            if (netType == ConnectivityManager.TYPE_WIFI) {
               // networkStatus = NetworkStatus.SD_WIFI.getCode();
            } else if (netType == ConnectivityManager.TYPE_MOBILE) {
                //networkStatus = NetworkStatus.SD_AVAILABLE.getCode();
            }
        }catch (Exception e){

        }
        return networkStatus;
    }


}
