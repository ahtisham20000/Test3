package com.tostertos.toster;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void To(Context context, String s)
    {
        Toast.makeText(context, ""+s, Toast.LENGTH_SHORT).show();
    }
}
