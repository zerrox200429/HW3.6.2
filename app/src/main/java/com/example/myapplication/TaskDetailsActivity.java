package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;


public class TaskDetailsActivity extends AppCompatActivity {
    static  final String DETAILS_KEY="details_key";
    EditText title,description,adress,hobbi,nomer;
    CheckBox isDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);
        setupView();

    }
    private void setupView(){
        title=findViewById(R.id.details_title);
        description=findViewById(R.id.details_description);
        adress=findViewById(R.id.details_adress);
        hobbi=findViewById(R.id.details_hobbi);
        nomer=findViewById(R.id.details_nomer);
        isDone=findViewById(R.id.details_isDone);


    }

    public void onClickSave(View view) {

        Intent intent = new Intent();
        String title1=title.getText().toString();
        String description1=description.getText().toString();
        String adress1=adress.getText().toString();
        String hobbi1=hobbi.getText().toString();
        String nomer1=nomer.getText().toString();
        Task task = new Task(0,title1,description1,adress1,hobbi1,nomer1 );
        intent.putExtra( "key", task);
        setResult(RESULT_OK, intent);
        finish();

    }
}
