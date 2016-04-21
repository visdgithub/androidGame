package com.istarindia.visd.cardauto.cards;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

import com.istarindia.visd.cardauto.Pojos.Game.Game;

/**
 * Created by Vishal Daga on 19/4/16.
 */
public interface IstarGameCard {

    public interface cardNextClickListener {
        public void onNextClick();
        public void onPrevClick();
    };

    public class CardData {
        Game.Stages data;

        public CardData(Game.Stages data){
            this.data = data;
        }

        public Game.Stages getData() {
            return this.data;
        }
    }

    public void setNextClickListener(cardNextClickListener nextClickListener);

    public void setData(CardData cardData);


}
