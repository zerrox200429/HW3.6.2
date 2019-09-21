package com.example.myapplication;

import java.io.Serializable;

public class Task implements Serializable {
    public  int id;
    public String title;
    public String descreption;
    public String adress;
    public String hobbi;
    public String nomer;
    public boolean isDone;

    public Task(String title, String descreption, boolean isDone) {
        this.title = title;
        this.descreption = descreption;
        this.isDone = isDone;

    }

    public Task(int id,String title, String descreption,String adress,String hobbi, String nomer) {
        this.title = title;
        this.descreption = descreption;
        this.id=id;
        this.adress=adress;
        this.hobbi=hobbi;
        this.nomer=nomer;
    }

}
