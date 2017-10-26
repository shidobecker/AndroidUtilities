package kotlin.shido.com.androidutilities.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by saraceni on 13/12/16.
 */

public class SquareGridViewItem extends LinearLayout {

    public SquareGridViewItem(Context context) {
        super(context);
    }

    public SquareGridViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareGridViewItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec , widthMeasureSpec  ); // This is the keyinput that will make the height equivalent to its width

    }


}
