package com.evancc.notes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditNoteActivity extends AppCompatActivity {

    Intent intent = new Intent();
    SharedPreferences sharedPreferences = getSharedPreferences(com.evancc.notes);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);

        String note = getIntent().getStringExtra("note");

        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText(note);

    }

    @Override
    protected void onPause() {
        super.onPause();


    }
}
