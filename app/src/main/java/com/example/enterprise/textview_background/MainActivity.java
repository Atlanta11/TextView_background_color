package com.example.enterprise.textview_background;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.graphics.Color;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void perform_action(View v)
    {
        TextView tv1 = (TextView) findViewById(R.id.text_view1);
        tv1.setBackgroundColor(0xFF12FF45);
        tv1.setText("Background color from int color (0xFF12FF45)");

        TextView tv2 = (TextView) findViewById(R.id.text_view2);
        tv2.setBackgroundColor(0x55FF0000);
        tv2.setText("Background color from int color with alpha (0x55FF0000)");

        TextView tv3 = (TextView) findViewById(R.id.text_view3);
        tv3.setBackgroundColor(Color.parseColor("#FF5555"));
        tv3.setText("Background color from Color.parseColor() method (#FF5555)");

        TextView tv4 = (TextView) findViewById(R.id.text_view4);
        tv4.setBackgroundColor(Color.parseColor("#33FF5555"));
        tv4.setText("Background color from Color.parseColor() method with alpha (#33FF5555)");

        TextView tv5 = (TextView) findViewById(R.id.text_view5);
        tv5.setHighlightColor(Color.CYAN);
        tv5.setBackgroundColor(tv5.getHighlightColor());
        tv5.setText("Background color from getHighlightColor() method");

        TextView tv6 = (TextView) findViewById(R.id.text_view6);
        tv6.setBackgroundColor(getResources().getColor(R.color.Cornsilk));
        tv6.setText("Background color from xml resource file (Cornsilk)");
    }


}
