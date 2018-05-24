package drd.frozenhell.drdcharacterlog.viewCustoms;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import drd.frozenhell.drdcharacterlog.R;

public class xpBar extends ConstraintLayout{
    public xpBar(Context context) {
        super(context);
        initView();
    }

    public xpBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public xpBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView(){
        inflate(getContext(), R.layout.xp_bar,this);

    }
}
