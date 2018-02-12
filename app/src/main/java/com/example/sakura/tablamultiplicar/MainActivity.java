package com.example.sakura.tablamultiplicar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        ((TextView)findViewById(R.id.TablaMulti)).setText(
                         i+"X 1 =" + i*1+"\n"+
                          i+"X 2 =" + i*2+"\n"+
                        i+"X 3 =" + i*3+"\n"+
                        i+"X 4 =" + i*4+"\n"+
                        i+"X 5 =" + i*5+"\n"+
                        i+"X 6 =" + i*6+"\n"+
                        i+"X 7 =" + i*7+"\n"+
                        i+"X 8 =" + i*8+"\n"+
                        i+"X 9 =" + i*9+"\n"+
                        i+"X 10 =" + i*10+"\n"+
                        i+"X 11 =" + i*11+"\n"+
                        i+"X 12 =" + i*12+"\n"+
                        i+"X 13  =" + i*13+"\n"+
                        i+"X 14 =" + i*14+"\n"+
                        i+"X 15 =" + i*15+"\n"+
                        i+"X 16 =" + i*16+"\n"+
                        i+"X 17 =" + i*17+"\n"+
                        i+"X 18 =" + i*18+"\n"+
                        i+"X 19 =" + i*19+"\n"+
                        i+"X 20 =" + i*20+"\n"+
                        i+"X 21 =" + i*21+"\n"+
                        i+"X 22 =" + i*22+"\n"+
                        i+"X 23 =" + i*23+"\n"+
                        i+"X 24 =" + i*24+"\n"+
                        i+"X 25 =" + i*25+"\n"+
                        i+"X 26 =" + i*26+"\n"+
                        i+"X 27 =" + i*27+"\n"+
                        i+"X 28 =" + i*28+"\n"+
                        i+"X 29 =" + i*29+"\n"+
                        i+"X 30 =" + i*30+"\n"+
                        "");


    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((SeekBar)findViewById(R.id.barra)).setOnSeekBarChangeListener(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
