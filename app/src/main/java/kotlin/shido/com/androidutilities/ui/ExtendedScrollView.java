package kotlin.shido.com.androidutilities.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by Julio on 14/03/2017.
 * A ScrollView extension that allows actions onScrollChanged method
 */

public class ExtendedScrollView  extends ScrollView {

    public ExtendedScrollView(Context context) {
        super(context);
    }

    public ExtendedScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExtendedScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        if (mOnScrollViewListener != null) {
            mOnScrollViewListener.onScrollChanged(this, l, t, oldl, oldt);
        }
        super.onScrollChanged( l, t, oldl, oldt );
    }



    public interface OnScrollViewListener {
        void onScrollChanged(ExtendedScrollView v, int l, int t, int oldl, int oldt);
    }

    private OnScrollViewListener mOnScrollViewListener;

    public void setOnScrollViewListener(OnScrollViewListener listener) {
        this.mOnScrollViewListener = listener;
    }




}
