package com.youra.ads;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
    public static void simpleToasty(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
