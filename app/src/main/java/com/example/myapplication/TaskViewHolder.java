package com.example.myapplication;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TaskViewHolder extends RecyclerView.ViewHolder {
    Task task;
    TextView title;
    CheckBox isDone;
    ITaskAdapterListener listener;
    public TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.task_title1);
        isDone=itemView.findViewById(R.id.task_isDone);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.openDetails(task);
            }
        });
    }
    public  void onBind(Task task){
        title.setText(task.title);
        isDone.setChecked(task.isDone);
        this.task=task;


    }
}
