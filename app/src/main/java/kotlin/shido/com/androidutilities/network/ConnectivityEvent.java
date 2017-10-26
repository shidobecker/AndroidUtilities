package kotlin.shido.com.androidutilities.network;

/**
 * Created by mira on 06/04/2017.
 */

/**
 * Class to be used with Square's Otto to send bus messages across the whole app
 * Between Fragments, Activities, Broadcasts, Services and so on
 */
public class ConnectivityEvent {


    public static final String DEVICE_OFFLINE = "Device Offline";
    public static final String DEVICE_ONLINE = "Device Online";
    public static final String DEVICE_ON_WIFI = "Device On Wifi";
    public static final String DEVICE_ON_3G = "Device On 3G";

    private String eventMessage;

    public ConnectivityEvent(String eventMessage) {
        this.eventMessage = eventMessage;
    }

    public String getEventMessage() {
        return eventMessage;
    }

    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }
}
