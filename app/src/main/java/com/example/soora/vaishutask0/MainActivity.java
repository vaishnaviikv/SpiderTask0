package com.example.soora.vaishutask0;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bg = (ConstraintLayout) findViewById(R.id.bg);
    }
int sum,n;
    
    public void generate(View view) {
        sum=0;
        Random rand = new Random();
        n = rand.nextInt(100) + 1;
        bg.setBackgroundColor(Color.WHITE);
        TextView myText = (TextView) findViewById(R.id.textView);
        String myString = String.valueOf(n);
        myText.setText(myString);
        TextView myText1 = (TextView) findViewById(R.id.textView2);
        String myString1 = String.valueOf(sum);
        myText1.setText(myString1);

    }

    public void add1(View view)
    { sum= sum+1;

       changebg(sum);
       }
    public void add2(View view)
    { sum= sum+2;
       changebg(sum);

       }
       public void add5(View view)
    { sum= sum+5;
       changebg(sum);


    }
    public void add10(View view)
     {
     sum= sum+10;
     changebg(sum);



    }
    public void reset(View view)
    { sum= 0;
        TextView myText = (TextView) findViewById(R.id.textView2);
        String myString = String.valueOf(sum);
        myText.setText(myString);

    }
    public void dec(View view)
    {
        sum=sum-1;
        TextView myText = (TextView) findViewById(R.id.textView2);
        String myString = String.valueOf(sum);
        myText.setText(myString);
    }

    private void changebg(int num)
    {
        if(num==n) {


            bg.setBackgroundColor(Color.argb(255,255,69,0));

        }

        TextView myText = (TextView) findViewById(R.id.textView2);
        String myString = String.valueOf(sum);
        myText.setText(myString);

    }

}
