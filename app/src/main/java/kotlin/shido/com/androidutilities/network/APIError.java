package kotlin.shido.com.androidutilities.network;

/**
 * Model for the API Error messages class
 * Created by Julio on 26/04/2017.
 */
public class APIError {

    private int statusCode;

    private String message;

    public APIError() {}

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
