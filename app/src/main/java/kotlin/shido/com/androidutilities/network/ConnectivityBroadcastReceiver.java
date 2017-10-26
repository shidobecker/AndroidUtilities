package kotlin.shido.com.androidutilities.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.zendesk.sdk.util.NetworkUtils;
import edu.mira.aula.shared.AppCoordinator;


public class ConnectivityBroadcastReceiver extends BroadcastReceiver {

    public ConnectivityBroadcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
     /*   if(NetworkUtils.isConnected(context)){
            AppCoordinator.getBusInstance().post(new ConnectivityEvent(ConnectivityEvent.DEVICE_ONLINE));
            AppCoordinator.isAppOnline = true;
        }else{
            AppCoordinator.getBusInstance().post(new ConnectivityEvent(ConnectivityEvent.DEVICE_OFFLINE));
            AppCoordinator.isAppOnline = false;
        }*/
    }
}
