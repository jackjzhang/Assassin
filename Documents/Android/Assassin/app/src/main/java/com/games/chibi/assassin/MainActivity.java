package com.games.chibi.assassin;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    DatabaseReference rootRef;
    DatabaseReference childRef;
    SharedPreferences localData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootRef = FirebaseDatabase.getInstance().getReference();
        localData = this.getSharedPreferences("com.games.chibi.assassin", Context.MODE_PRIVATE);
    }
}
