package com.jv.theque.RAWGImplementation;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RAWGStoresList implements Serializable {

    @SerializedName("store")
    @Expose
    public com.jv.theque.RAWGImplementation.RAWGStore RAWGStore;



    @NonNull
    @Override
    public String toString() {
        return RAWGStore.toString();
    }
}
