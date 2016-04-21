package com.istarindia.visd.cardauto.Pojos.Game;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Vishal Daga on 18/4/16.
 */

@Root(name="game")
public class Game {
    @Attribute(name="id")
    private int id;

    @Attribute(name="name")
    private String name;

    @ElementList(inline=true)
    private List<Stages> stages;

    @Element (name="assets")
    private Assets assets;


    public Game() {
        super();
    }

//    public Game(int id, String name, Stages[] stages){
//        this.id = id;
//        this.name = name;
//        this.stages = stages;
//    }

    public int getId(){
        return id;
    }

    public Assets getAssets() {
        return assets;
    }

    public String getName(){
        return name;
    }

    public List<Stages> getStages(){
        return stages;
    }


    public static class Assets {
        @Attribute(name="id")
        private int id;

        @Attribute(name="data_type")
        private String data_type;

        @Attribute(name="name")
        private String name;

        public Assets() {
            super();
        }

        public Assets(int id, String data_type, String name) {
            this.id = id;
            this.data_type = data_type;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getData_type() {
            return data_type;
        }

        public String getName() {
            return name;
        }
    }

    public static class Options {
        @Attribute(name="id")
        private int id;

        @Attribute(name="jump_to")
        private String jump_to;

        @Attribute(name="correct")
        private  boolean correct;

        @Attribute(name="marking_scheme")
        private String marking_scheme;

        @Attribute(name="xpos")
        private  String xpos;

        @Attribute(name="ypos")
        private String ypos;

        @Attribute(name="image_url", required=false)
        private  String image_url;

        @Attribute(name="image_x", required=false)
        private String image_x;

        @Attribute(name="image_y", required=false)
        private String image_y;

        @Element(name="option_text", required = false)
        private String option_text;


        public Options() {
            super();
        }

        public Options(int id, String jump_to, boolean correct, String marking_scheme, String xpos, String ypos, String image_url, String image_x, String image_y, String option_text) {
            this.id = id;
            this.jump_to = jump_to;
            this.correct = correct;
            this.marking_scheme = marking_scheme;
            this.xpos = xpos;
            this.ypos = ypos;
            this.image_url = image_url;
            this.image_x = image_x;
            this.image_y = image_y;
            this.option_text = option_text;
        }

        public int getId() {
            return id;
        }

        public String getJump_to() {
            return jump_to;
        }

        public boolean isCorrect() {
            return correct;
        }

        public String getMarking_scheme() {
            return marking_scheme;
        }

        public String getXpos() {
            return xpos;
        }

        public String getYpos() {
            return ypos;
        }

        public String getImage_url() {
            return image_url;
        }

        public String getImage_x() {
            return image_x;
        }

        public String getImage_y() {
            return image_y;
        }

        public String getOption_text() {
            return option_text;
        }
    }

    public static class Stages {
        @Attribute(name="id")
        private int id;

        @Attribute(name="next_stage")
        private int next_stage;

        @Attribute(name="background", required = false)
        private String background;

        @Attribute(name="stage_type")
        private String stage_type;

        @Element(name="question_text")
        private String questionText;

        @ElementList(name="options", required=false, inline=true)
        private List<Options> options;

        public Stages() {
            super();
        }

//    public Stages(String questionText, int id, int next_stage, String background, String stage_type, Option[] options ) {
//        this.questionText = questionText;
//        this.id = id;
//        this.next_stage = next_stage;
//        this.background = background;
//        this.stage_type = stage_type;
//        this.options = options;
//    }

        public int getId() {
            return id;
        }

        public int getNext_stage() {
            return next_stage;
        }

        public String getBackground() {
            return background;
        }

        public String getStage_type() {
            return stage_type;
        }

        public String getQuestionText() {
            return questionText;
        }

        public List<Options> getOptions() {
            return options;
        }
    }

}



























































































































