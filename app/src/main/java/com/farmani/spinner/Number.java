package com.farmani.spinner;

import androidx.annotation.NonNull;

public class Number {
    public int value;
    public String title;

    public Number(int value, String title) {
        this.value = value;
        this.title = title;
    }

    @NonNull
    public String toString() {
        return title;
    }
}
