package com.example.android.recyclerviewsimpleapp2.model;

import java.util.ArrayList;

public class Contact {
    private String mName;
    private boolean mOnline;

    public Contact(String name, boolean online){
        this.mName = name;
        this.mOnline = online;
    }

    public String getName(){
        return mName;
    }

    public boolean isOnline(){
        return mOnline;
    }

    private static int lastContactId = 0;

    public static ArrayList<Contact> createContactsList(int numContacts){
        ArrayList<Contact> contacts = new ArrayList<>();
        for(int i=0; i<numContacts; i++){
            contacts.add(new Contact("Person"+ ++lastContactId, i<=numContacts/2));
        }
        return contacts;
    }
}
