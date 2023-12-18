package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;

    ArrayList<ContactModel> arrContacts;
    public RecyclerContactAdapter(Context context, ArrayList<ContactModel>arrContacts){
        this.context =  context;
        this.arrContacts = arrContacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder  ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.contactRowImage.setImageResource(arrContacts.get(position).img);
        holder.contactRowName.setText(arrContacts.get(position).name);
        holder.contactRowNumber.setText(arrContacts.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView contactRowImage;
        TextView contactRowName;
        TextView contactRowNumber;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contactRowImage = itemView.findViewById(R.id.contact_row_image);
            contactRowName = itemView.findViewById(R.id.contact_row_name);
            contactRowNumber = itemView.findViewById(R.id.contact_row_number);


        }
    }

}
