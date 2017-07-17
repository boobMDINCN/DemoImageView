package pl09kk.com.optionalimageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Created by xiaqibo on 2017/7/17.
 */

public class PorterDuffImageView extends AppCompatImageView {
    private int height = 0 ;
    private Bitmap mBitmap  , backgroundBitmap;




    public PorterDuffImageView(Context context) {
        super(context);

    }

    public PorterDuffImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PorterDuffImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        mBitmap = bm ;
        setBitmaps() ;
    }

    @Override
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        mBitmap = getBitmapFromDrawable(drawable) ;
        setBitmaps();
    }

    @Override
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        mBitmap = getBitmapFromDrawable(getDrawable());
        setBitmaps();
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        mBitmap = getBitmapFromDrawable(getDrawable());
        setBitmaps();
    }

    private void setBitmaps(){
        if(getBackground() == null ){
            throw new IllegalArgumentException("background is null") ;
        }else{
            backgroundBitmap = getBitmapFromDrawable(getBackground()) ;
            invalidate();
        }
    }


    private Bitmap getBitmapFromDrawable(@Nullable Drawable drawable){
        if(drawable == null)
            return null ;
        return null ;
    }
}
