package com.helas.marcos.morse_code;

//---------- Libraries ----------
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.content.Context;
//-------------------------------

public class MainMorse extends AppCompatActivity
{
    //------------ Views ------------
    EditText field_alpha = findViewById(R.id.alpha);
    EditText field_morse = findViewById(R.id.morse);
    Button button_dot = findViewById(R.id.dot);
    Button button_hyphen = findViewById(R.id.hyphen);
    Button button_eraser = findViewById(R.id.eraser);
    Button button_slash = findViewById(R.id.slash);
    Button button_play = findViewById(R.id.play);
    ListView list_alphaMorse = findViewById(R.id.alpha_morse);
    //-------------------------------
    //----------- Objects -----------
    Keyboard keyboard;
    //-------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_morse);
        /**
         * insert here the methods from design class
         */
    }
    //=========================== Methods ===========================

    /**
     * Function to resolve buttons alpha Onclick.
     * @param button_view buttons to write on morse field
     */
    public void writeAlpha(View button_view)
    {
        switch (button_view.getId())
        {
            case R.id.dot:
                break;
            case R.id.hyphen:
                break;
            case R.id.slash:
                break;
            case R.id.eraser:
                break;
            case R.id.eraser_all:
                break;
            case R.id.play:
                break;
        }

    }

    //===============================================================
}
