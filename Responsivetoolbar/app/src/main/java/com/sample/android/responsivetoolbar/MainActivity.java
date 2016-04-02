package com.sample.android.responsivetoolbar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_toolbar);

        final Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar_1);
        toolbar1.inflateMenu(R.menu.test_overflow_menu);
        toolbar1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbar_2);
        toolbar2.inflateMenu(R.menu.test_menu);
        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Toolbar toolbar3 = (Toolbar) findViewById(R.id.toolbar_3);
        toolbar3.inflateMenu(R.menu.test_menu);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.test_overflow_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
