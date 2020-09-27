package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView titleTextView;
    Spinner spinner;
    View layout;

    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        layout = findViewById(R.id.layout_id);


        items = new ArrayList<>();

        items.add("Selecte Color");
        items.add("RED");
        items.add("YELLOW");
        items.add("GREEN");
        items.add("LIGHTGREY");
        items.add("BLUE");
        items.add("GRAY");
        items.add("BLACK");
        items.add("CYAN");
        items.add("DRAKGREY");
        items.add("MAGENTA");



        final BaseAdapter adapter = new ColorAdapter(this, items);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.WHITE);
                if (spinner.getSelectedItem().toString().equals("RED")) { // where chosenColor is a string
                    layout.setBackgroundColor(Color.RED);
                } else if (spinner.getSelectedItem().toString().equals("YELLOW")) { // where chosenColor is a string
                    layout.setBackgroundColor(Color.YELLOW);
                } else if (spinner.getSelectedItem().toString().equals("GREEN")) { // where chosenColor is a string
                    layout.setBackgroundColor(Color.GREEN);
                } else if (spinner.getSelectedItem().toString().equals("LIGHTGREY")) { // where chosenColor is a string
                    layout.setBackgroundColor(Color.LTGRAY);
                } else if (spinner.getSelectedItem().toString().equals("BLUE")) { // where chosenColor is a string
                    layout.setBackgroundColor(Color.BLUE);
                }else if (spinner.getSelectedItem().toString().equals("GRAY")) { // where chosenColor is a string
                    layout.setBackgroundColor(Color.GRAY);
                }else if (spinner.getSelectedItem().toString().equals("BLACK")) { // where chosenColor is a string
                    layout.setBackgroundColor(Color.BLACK);
                }else if (spinner.getSelectedItem().toString().equals("CYAN")) { // where chosenColor is a string
                    layout.setBackgroundColor(Color.CYAN);
                }else if (spinner.getSelectedItem().toString().equals("DRAKGREY")) { // where chosenColor is a string
                    layout.setBackgroundColor(Color.DKGRAY);
                }else if (spinner.getSelectedItem().toString().equals("MAGENTA")) { // where chosenColor is a string
                    layout.setBackgroundColor(Color.MAGENTA);
                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}