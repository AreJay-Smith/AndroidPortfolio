package com.arejaysmith.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class PortfolioActivity extends AppCompatActivity {

    private Button mPopularMoviesBtn;
    private Button mStockHawkBtn;
    private Button mBuildItBiggerBtn;
    private Button mMakeYourAppMaterialBtn;
    private Button mGoUbiquitousBtn;
    private Button mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mPopularMoviesBtn = (Button) findViewById(R.id.popular_movies);
        mPopularMoviesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "This button will launch my " + mPopularMoviesBtn.getText().toString() +
                        " project!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mStockHawkBtn = (Button) findViewById(R.id.stock_hawk);
        mStockHawkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "This button will launch my " + mStockHawkBtn.getText().toString() +
                        " project!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mBuildItBiggerBtn = (Button) findViewById(R.id.build_it_bigger);
        mBuildItBiggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "This button will launch my " + mBuildItBiggerBtn.getText().toString() +
                        " project!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mMakeYourAppMaterialBtn = (Button) findViewById(R.id.material);
        mMakeYourAppMaterialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "This button will launch my " + mMakeYourAppMaterialBtn.getText().toString() +
                        " project!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mGoUbiquitousBtn = (Button) findViewById(R.id.go_ubiquitous);
        mGoUbiquitousBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "This button will launch my " + mGoUbiquitousBtn.getText().toString() +
                        " project!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mCapstone = (Button) findViewById(R.id.capstone);
        mCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "This button will launch my " + mCapstone.getText().toString() +
                        " project!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
