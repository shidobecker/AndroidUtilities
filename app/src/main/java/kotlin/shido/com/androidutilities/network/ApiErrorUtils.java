/*
package kotlin.shido.com.androidutilities.network;

import com.zendesk.service.HttpConstants;
import java.io.IOException;
import java.lang.annotation.Annotation;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;

*/
/**
 * This class will handle errors for web APIs
 * Created by Julio on 26/04/2017.
 *//*

public class ApiErrorUtils {


    */
/**
     * This will convert the response body into a ApiError class with no annotation
     * @param response
     * @return ApiError class with it's code and message.
     *//*

    public static APIError parseError(Response<?> response){
        Converter<ResponseBody, APIError> converter =
                ServiceGenerator.retrofit().responseBodyConverter(APIError.class, new Annotation[0]);
        APIError apiError;
            try {
                apiError = converter.convert(response.errorBody());
                if(apiError.getMessage() == null){ //If converter can't parse the errorBody, just set a default message
                    apiError.setStatusCode(response.code());
                    apiError.setMessage(returnErrorMessages(response.code()));
                }
            } catch (IOException e) {
                return new APIError();
            }

        return apiError;
    }

    */
/**
     * Return a message more clear for the user to know what kind of error happened.
     * @param errorCode StatusCode of the response
     * @return Message accordingly to the error received.
     *
     *//*

    public static String returnErrorMessages(int errorCode){
        String message = "";
        switch (errorCode){
            case HttpConstants.HTTP_BAD_REQUEST:
               message = "BAD REQUEST";
                break;
            case HttpConstants.HTTP_UNAUTHORIZED:
                message = "UNAUTHORIZED";
                break;
            case HttpConstants.HTTP_FORBIDDEN:
                break;
            case HttpConstants.HTTP_NOT_FOUND:
                break;
            case HttpConstants.HTTP_BAD_METHOD:
                break;
            case HttpConstants.HTTP_NOT_ACCEPTABLE:
                break;
            case HttpConstants.HTTP_CLIENT_TIMEOUT:
                break;
            case HttpConstants.HTTP_CONFLICT:
                break;
            case HttpConstants.HTTP_GONE:
                break;
            case HttpConstants.HTTP_INTERNAL_ERROR:
                message = "INTERNAL SERVER ERROR";
                break;
            case HttpConstants.HTTP_NOT_IMPLEMENTED:
                break;
            case HttpConstants.HTTP_BAD_GATEWAY:
                break;
            case HttpConstants.HTTP_UNAVAILABLE:
                break;
            case HttpConstants.HTTP_GATEWAY_TIMEOUT:
                break;
            default:
                break;
        }
        return message;
    }


}
*/
