package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.myapplication.TaskDetailsActivity.DETAILS_KEY;

public class NewActivity extends AppCompatActivity {
    TextView headline,description,adress,hobbi,nomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        headline=findViewById(R.id.new_headline);
        description=findViewById(R.id.new_description);
        adress=findViewById(R.id.new_adress);
        hobbi=findViewById(R.id.new_hobbi);
        nomer=findViewById(R.id.new_nomer);
        showTask(getTask());
    }
    private Task getTask(){
        Intent intent=getIntent();
        Task task =(Task)intent.getSerializableExtra(DETAILS_KEY);
        return task;
    }
    private void showTask(Task task){
        headline.setText(task.title);
        description.setText(task.descreption);
        adress.setText(task.adress);
        hobbi.setText(task.hobbi);
        nomer.setText(task.nomer);
    }
}
