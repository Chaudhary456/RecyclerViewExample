package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrayContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_contact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayContacts.add(new ContactModel(R.drawable.a,"A","1111111111"));
        arrayContacts.add(new ContactModel(R.drawable.b,"B","2222222222"));
        arrayContacts.add(new ContactModel(R.drawable.c,"C","3333333333"));
        arrayContacts.add(new ContactModel(R.drawable.d,"D","4444444444"));
        arrayContacts.add(new ContactModel(R.drawable.e,"E","5555555555"));
        arrayContacts.add(new ContactModel(R.drawable.f,"F","6666666666"));
        arrayContacts.add(new ContactModel(R.drawable.g,"G","7777777777"));
        arrayContacts.add(new ContactModel(R.drawable.h,"H","8888888888"));
        arrayContacts.add(new ContactModel(R.drawable.i,"I","88881111888"));
        arrayContacts.add(new ContactModel(R.drawable.j,"J","8885558888"));
        arrayContacts.add(new ContactModel(R.drawable.k,"K","9999988888"));
        arrayContacts.add(new ContactModel(R.drawable.l,"L","8800008888"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrayContacts);
        recyclerView.setAdapter(adapter);
    }
}