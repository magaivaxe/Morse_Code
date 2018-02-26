package com.helas.marcos.morse_code;

import android.app.Activity;
import android.view.View;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

/**
 * Class to manager the keyboard show and hide
 * Created by sire_marcos on 18-02-26.
 */

public class Keyboard
{
    /**
     * Class constructor
     */
    public Keyboard() {}

    /**
     * Function to hide the keyboard on activities
     * @param activity Activity that use the keyboard
     */
    public static void hideKeyboard(Activity activity)
    {
        //view is equal to main activity
        View view = activity.findViewById(android.R.id.content);
        if (view != null)
        {
            InputMethodManager imm;
            imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /**
     * Function to show the keyboard on activities
     * @param activity Activity that use the keyboard
     */
    public static void showKeyboard(Activity activity)
    {
        InputMethodManager imm;
        imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }
}
