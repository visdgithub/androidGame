package com.istarindia.visd.cardauto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;


import com.fasterxml.aalto.stax.InputFactoryImpl;
import com.fasterxml.aalto.stax.OutputFactoryImpl;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import edu.usf.cutr.javax.xml.stream.XMLOutputFactory;
import edu.usf.cutr.javax.xml.stream.XMLStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        XmlFactory f = new XmlFactory(new InputFactoryImpl(), new OutputFactoryImpl());
//
//        File file = new File("question.xml");
//        InputStream is=null;
//        is=this.getClass().getResourceAsStream("question.xml");
//
//
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

        ContextThemeWrapper cardContext = new ContextThemeWrapper(MainActivity.this, R.style.CardViewStyle);
        CardOnlyTitle card = new CardOnlyTitle(cardContext, "Istar");

        LinearLayout activityLayout = new LinearLayout(new ContextThemeWrapper(MainActivity.this, R.style.Widget_CardContent));

        activityLayout.addView(card);

        setContentView(activityLayout);


    }
}
