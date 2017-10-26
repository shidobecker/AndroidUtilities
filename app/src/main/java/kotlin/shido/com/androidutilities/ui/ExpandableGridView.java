package kotlin.shido.com.androidutilities.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by Julio on 17/03/2017.
 * GridView that expands accordingly with the amount of contents
 */

public class ExpandableGridView extends GridView {

    boolean expanded = false;

    public ExpandableGridView(Context context)
    {
        super(context);
    }

    public ExpandableGridView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public ExpandableGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public boolean isExpanded()
    {
        return expanded;
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

            if (isExpanded()) {

                // Calculate entire height by providing a very large height hint.
                // View.MEASURED_SIZE_MASK represents the largest height possible.
                int expandSpec = MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK, MeasureSpec.AT_MOST);

                super.onMeasure(widthMeasureSpec, expandSpec);
                ViewGroup.LayoutParams params = getLayoutParams();
                params.height = getMeasuredHeight();

            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
    }

    public void setExpanded(boolean expanded)
    {
        this.expanded = expanded;
    }

}
