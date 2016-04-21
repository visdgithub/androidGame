package com.istarindia.visd.cardauto.cards.MultipleOptionDragDropCard;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.istarindia.visd.cardauto.Pojos.Game.Game;
import com.istarindia.visd.cardauto.R;
import com.istarindia.visd.cardauto.cards.IstarGameCard;
import com.istarindia.visd.cardauto.customViews.OnSwipeTouchListener;

/**
 * Created by Vishal Daga on 19/4/16.
 */
public class MultipleOptionDragDropCardIstar extends CardView implements IstarGameCard {
    private cardNextClickListener nextClickListener;
    private CardData cardData;
    private View theView;

    @Override
    public void setNextClickListener(cardNextClickListener nextClickListener) {
        this.nextClickListener = nextClickListener;
    }

    @Override
    public void setData(CardData cardData) {
        this.cardData = cardData;
        Game.Stages gameData = cardData.getData();
        TextView tv = (TextView) this.theView.findViewById(R.id.questtext);
        tv.setText(Html.fromHtml(gameData.getQuestionText()));
    }

    public MultipleOptionDragDropCardIstar(Context context) {
        super(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.theView = inflater.inflate(R.layout.multiple_option_drap_drop_card, null);


        this.addView(this.theView);

        Button b = (Button) this.theView.findViewById(R.id.nextStageButton);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (nextClickListener != null){
                    nextClickListener.onNextClick();
                }
            }
        });

        this.theView.setOnTouchListener(new OnSwipeTouchListener(context) {
            public void onSwipeTop() {

            }
            public void onSwipeRight() {
                if (nextClickListener != null){
                    nextClickListener.onPrevClick();
                }
            }
            public void onSwipeLeft() {
                if (nextClickListener != null){
                    nextClickListener.onNextClick();
                }
            }
            public void onSwipeBottom() {

            }

        });


    }
}
