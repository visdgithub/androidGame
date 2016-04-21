package com.istarindia.visd.cardauto;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vishal Daga on 14/4/16.
 */
public class CardOnlyTitle extends CardView{
    String title;

    public CardOnlyTitle(final Context context, String title){
        super(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View custom = inflater.inflate(R.layout.card1template, null);
        TextView tv = (TextView) custom.findViewById(R.id.stageValue);



        tv.setText(title);


        this.addView(custom);

    }
    public void modify(String title){
        TextView tv = (TextView) this.findViewById(R.id.stageValue);
        tv.setText(title);
    }
}

//
//    TextView tv_title = new TextView(context);
//tv_title.setLayoutParams(new LinearLayout.LayoutParams(
//        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT
//        ));
//        tv_title.setTextAppearance(context, R.style.TextAppearance_AppCompat_Title);
//        tv_title.setText(this.title);