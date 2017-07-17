package pl09kk.com.optionalimageview;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Created by xiaqibo on 2017/7/17.
 */

public class PorterDuffImageView extends AppCompatImageView {
    private int height = 0 ;
    public PorterDuffImageView(Context context) {
        super(context);

    }

    public PorterDuffImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PorterDuffImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
