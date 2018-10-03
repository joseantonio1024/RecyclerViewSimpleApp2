package com.example.android.recyclerviewsimpleapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.recyclerviewsimpleapp2.model.Contact;

import java.util.ArrayList;

public class UserListActivity extends AppCompatActivity {

    ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        //Lookup the recyclerView in activity layout.
        RecyclerView rvContacts = (RecyclerView)findViewById(R.id.rvContacts);

        // Initialize contacts.
        contacts = Contact.createContactsList(20);
        // Create adapter passing in the sample user data.
        ContactsAdapter adapter = new ContactsAdapter(contacts);
        // Attach the adapter to the recyclerview to populate items.
        rvContacts.setAdapter(adapter);
        // Set the layout manager to position the items.
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
        // That's all!
    }
}
