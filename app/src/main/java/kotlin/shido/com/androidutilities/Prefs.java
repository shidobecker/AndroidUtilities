package kotlin.shido.com.androidutilities;

import android.content.Context;
import android.content.SharedPreferences;
import edu.mira.aula.authentication.model.Auth;
import edu.mira.aula.authentication.model.Authentication;
import edu.mira.aula.discipline.ui.SelectClassActivity;
import edu.mira.aula.shared.network.ConnectivityEvent;
import edu.mira.aula.shared.ui.NoConnectionFragment;
import edu.mira.aula.shared.utils.GlobalConverter;
import edu.mira.aula.statement.model.Statement;
import java.util.Calendar;
import org.threeten.bp.Instant;


public class Prefs {

    /*--------- For Authentication -----------*/
    private static final String PREFS_KEY = "UTILS_PREFS";
    private static final String AUTHORIZATION_KEY = "AUTHORIZATION_KEY";
    private static final String AUTHENTICATION_KEY = "AUTHENTICATION_KEY";

    private static SharedPreferences sharedPrefs;

    public static SharedPreferences getPrefs(Context context) {

        if (sharedPrefs == null) {
            sharedPrefs = context.getSharedPreferences(PREFS_KEY, Context.MODE_PRIVATE);
        }
        return sharedPrefs;
    }





}
