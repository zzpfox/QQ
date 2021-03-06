package com.kunyang.android.qq.widget;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;

import com.kunyang.android.qq.R;

/**
 * Created by 坤阳 on 2017/12/30.
 */

public class MySwipeRefreshLayout extends SwipeRefreshLayout {
    public MySwipeRefreshLayout(Context context) {
        super(context);
        setProgressBarColor();
    }



    public MySwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        setProgressBarColor();
    }



    private void setProgressBarColor(){
        setColorSchemeResources(R.color.holo_blue_bright, R.color.holo_green_light,
                R.color.holo_orange_light, R.color.holo_red_light);
    }
}
