package com.istarindia.visd.cardauto;

/**
 * Created by Vishal Daga on 15/4/16.
 */
public class Answer {
    private int id;
    private String answername;
    private String postedby;
    public Answer() {}
    public Answer(int id, String answername, String postedby) {
        super();
        this.id = id;
        this.answername = answername;
        this.postedby = postedby;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAnswername() {
        return answername;
    }
    public void setAnswername(String answername) {
        this.answername = answername;
    }
    public String getPostedby() {
        return postedby;
    }
    public void setPostedby(String postedby) {
        this.postedby = postedby;
    }

}
