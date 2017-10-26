package kotlin.shido.com.androidutilities.ui;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

/**
 * Created by Julio on 27/03/2017.
 */

public class AnimationHelper {


    public static void fadeOutAnimation(final View v, long duration){
        Animation fadeOut = new AlphaAnimation(1, 0);
        v.setVisibility(View.VISIBLE);

        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setDuration(duration);
        fadeOut.setFillAfter(true);
        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                v.setVisibility(View.GONE);
            }

            public void onAnimationRepeat(Animation animation) {

            }
            public void onAnimationStart(Animation animation) {

            }
        });

        v.startAnimation(fadeOut);
    }




    public static void fadeInAnimation(final View v, long duration){
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setInterpolator(new AccelerateInterpolator());
        fadeIn.setDuration(duration);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                v.setVisibility(View.VISIBLE);
                v.setAlpha(1);
            }

            public void onAnimationRepeat(Animation animation) {

            }
            public void onAnimationStart(Animation animation) {

            }
        });

        v.startAnimation(fadeIn);
        v.setVisibility(View.VISIBLE);

    }


    public static void animateMaxLines(TextView textView) {
        ObjectAnimator animation = ObjectAnimator.ofInt(textView, "maxLines", Integer.MAX_VALUE);
        animation.setDuration(500);
        animation.start();

    }





}
