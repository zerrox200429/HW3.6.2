package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> implements ITaskViewholderListener{
    ArrayList<Task> tasks;
    ITaskAdapterListener listener;

    public TaskAdapter(){
        tasks=new ArrayList<>();

    }

    public void addTask(Task task){
        tasks.add(task);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.view_holder_task,parent, false);
       TaskViewHolder vh = new TaskViewHolder(view);
       vh.listener =listener;
        return  vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        holder.onBind(tasks.get(position));

    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
    @Override
    public void find(int id){
        for (int i = 0; i < tasks.size(); i++) {
            if(id==tasks.get(i).id){
                listener.openDetails(tasks.get(id));


            }

        }
    }
}
