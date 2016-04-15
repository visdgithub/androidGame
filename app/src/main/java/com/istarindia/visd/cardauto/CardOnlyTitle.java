package com.istarindia.visd.cardauto;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vishal Daga on 14/4/16.
 */
public class CardOnlyTitle extends CardView{
    String title;

    public CardOnlyTitle(Context context, String title){
        super(context);
        this.title = title;
        TextView tv_title = new TextView(context);
        tv_title.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        tv_title.setTextAppearance(context, R.style.TextAppearance_AppCompat_Title);
        tv_title.setText(this.title);
        this.addView(tv_title);

    }
}
