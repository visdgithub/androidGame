package com.istarindia.visd.cardauto;

//import android.content.res.Resources;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.ContextThemeWrapper;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.istarindia.visd.cardauto.Pojos.Game.Game;
import com.istarindia.visd.cardauto.cards.IstarGameCard;
import com.istarindia.visd.cardauto.cards.GameOverCard.IstarGameOverCard;
import com.istarindia.visd.cardauto.cards.InformationOnlyCard.InformationOnlyCardIstar;
import com.istarindia.visd.cardauto.cards.MultipleOptionDragDropCard.MultipleOptionDragDropCardIstar;
import com.istarindia.visd.cardauto.cards.MultipleOptionSingleChoiceCard.MultipleOptionSingleChoiceCardIstar;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.InputStream;

//
//import com.fasterxml.aalto.stax.InputFactoryImpl;
//import com.fasterxml.aalto.stax.OutputFactoryImpl;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.PropertyNamingStrategy;
//import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
//import com.fasterxml.jackson.dataformat.xml.XmlFactory;
//import com.fasterxml.jackson.dataformat.xml.XmlMapper;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import android.widget.Toast;

//import edu.usf.cutr.javax.xml.stream.XMLOutputFactory;
//import edu.usf.cutr.javax.xml.stream.XMLStreamReader;

public class MainActivity extends Activity {
    private String file = "mydata";
    public int currentStage = 0;
    public LinearLayout activityLayout;
    public Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        InputStream is=null;
        is=getApplicationContext().getResources().openRawResource(R.raw.game);

        Serializer serializer = new Persister();
        try {
            game = serializer.read(Game.class, is);
        } catch (Exception e) {
            e.printStackTrace();
        }


        IstarGameCard.cardNextClickListener listener = new IstarGameCard.cardNextClickListener() {
            @Override
            public void onNextClick() {
                MainActivity.this.currentStage++;
                String nextStageType = game.getStages().get(MainActivity.this.currentStage).getStage_type();
                Game.Stages stageData = game.getStages().get(MainActivity.this.currentStage);
                ContextThemeWrapper cardContext = new ContextThemeWrapper(MainActivity.this, R.style.CardViewStyle);
                activityLayout.removeAllViews();
                IstarGameCard card = null;
                switch (nextStageType){
                    case "INFORMATION_ONLY": {
                        card = new InformationOnlyCardIstar(cardContext);
                        break;
                    }

                    case "MULTIPLE_OPTION_DRAG_DROP": {
                        card = new MultipleOptionDragDropCardIstar(cardContext);
                        break;
                    }

                    case "MULTIPLE_OPTION_SINGLE_CHOICE": {
                        card = new MultipleOptionSingleChoiceCardIstar(cardContext);
                        break;
                    }

                    case "GAME_OVER": {
                        card = new IstarGameOverCard(cardContext);
                        break;
                    }
                }
                activityLayout.addView((CardView) card);
                card.setNextClickListener(this);
                IstarGameCard.CardData cardData = new IstarGameCard.CardData(stageData);
                card.setData(cardData);
            }

            @Override
            public void onPrevClick() {
                MainActivity.this.currentStage--;
                String nextStageType = game.getStages().get(MainActivity.this.currentStage).getStage_type();
                Game.Stages stageData = game.getStages().get(MainActivity.this.currentStage);
                ContextThemeWrapper cardContext = new ContextThemeWrapper(MainActivity.this, R.style.CardViewStyle);
                activityLayout.removeAllViews();
                IstarGameCard card = null;
                switch (nextStageType){
                    case "INFORMATION_ONLY": {
                        card = new InformationOnlyCardIstar(cardContext);
                        break;
                    }

                    case "MULTIPLE_OPTION_DRAG_DROP": {
                        card = new MultipleOptionDragDropCardIstar(cardContext);
                        break;
                    }

                    case "MULTIPLE_OPTION_SINGLE_CHOICE": {
                        card = new MultipleOptionSingleChoiceCardIstar(cardContext);
                        break;
                    }

                    case "GAME_OVER": {
                        card = new IstarGameOverCard(cardContext);
                        break;
                    }
                }
                activityLayout.addView((CardView) card);
                card.setNextClickListener(this);
                IstarGameCard.CardData cardData = new IstarGameCard.CardData(stageData);
                card.setData(cardData);
            }
        };

        ContextThemeWrapper cardContext = new ContextThemeWrapper(MainActivity.this, R.style.CardViewStyle);
        IstarGameCard card = new IstarGameOverCard(cardContext);
        activityLayout = new LinearLayout(new ContextThemeWrapper(MainActivity.this, R.style.Widget_CardContent));
        activityLayout.addView((CardView) card);
        card.setNextClickListener(listener);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(activityLayout);



    }

    public void cardNextClickListener(){
//        ContextThemeWrapper cardContext = new ContextThemeWrapper(MainActivity.this, R.style.CardViewStyle);
//        IstarGameCard card = new IstarGameOverCard(cardContext);
//        this.activityLayout.removeAllViews();
//        this.activityLayout.addView(card);
//        card.setNextClickListener(this);
        Toast.makeText(MainActivity.this.getApplicationContext(), "ab", Toast.LENGTH_LONG);
    }


}






//        XmlFactory f = new XmlFactory(new InputFactoryImpl(), new OutputFactoryImpl());

//File file = new File("question.xml");
//  this.getResources().getIdentifier("question");


// is = getApplicationContext().getResources().openRawResource(R.raw.question);
//        try{
//            FileInputStream fin = openFileInput(file);
//            int c;
//            String temp="";
//
//            while( (c = fin.read()) != -1){
//                temp = temp + Character.toString((char)c);
//            }
//            Toast.makeText(getBaseContext(),"file read",Toast.LENGTH_SHORT).show();
//        }
//        catch(Exception e){
//        }

//        JacksonXmlModule module = new JacksonXmlModule();
//        module.setDefaultUseWrapper(false);
//
//        XmlMapper xmlMapper = new XmlMapper(f, module);
//        xmlMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
//        xmlMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,true);
//        xmlMapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
//        xmlMapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING,true);
//
//        xmlMapper.setPropertyNamingStrategy(new PropertyNamingStrategy.PascalCaseStrategy());
//        Question q = null;
//
//        try {
//          q = xmlMapper.readValue(is,  Question.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



//        final CardOnlyTitle card = new CardOnlyTitle(cardContext, ""+game.getStages().get(currentStage).getBackground());
//
//        activityLayout = new LinearLayout(new ContextThemeWrapper(MainActivity.this, R.style.Widget_CardContent));
//
//        activityLayout.addView(card);
//
//        setContentView(activityLayout);
//
//        Button b = (Button) card.findViewById(R.id.nextStageButton);
//
//        b.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                MainActivity.this.currentStage++;
//                card.modify(""+game.getStages().get(MainActivity.this.currentStage).getBackground());
//            }
//        });