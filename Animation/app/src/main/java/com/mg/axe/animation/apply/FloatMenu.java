package com.mg.axe.animation.apply;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Axe on 2017/7/2.
 * floatMenu
 */

public class FloatMenu extends FrameLayout {

    public FloatMenu(@NonNull Context context) {
        super(context);
    }

    public FloatMenu(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FloatMenu(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
