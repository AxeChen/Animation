package com.mg.axe.animation.basis;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.mg.axe.animation.R;

/**
 * Created by Axe on 2017/7/2.
 */
public class BasisUseView extends RelativeLayout {

    public BasisUseView(Context context) {
        this(context, null);
    }

    public BasisUseView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BasisUseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_basis, this);
    }


}
