package com.fluffyjellybaby.motivationalmornings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> motivationalQuotes = new ArrayList<>();

    @Override
    protected void onStart() {
        super.onStart();
        motivationalQuotes.add("“The Way Get Started Is To Quit Talking And Begin Doing.” – Walt Disney");
        motivationalQuotes.add("“The Pessimist Sees Difficulty In Every Opportunity. The Optimist Sees Opportunity In Every Difficulty.” – Winston Churchill");
        motivationalQuotes.add("“You Learn More From Failure Than From Success. Don’t Let It Stop You. Failure Builds Character.” – Unknown");
        motivationalQuotes.add("“It’s Not Whether You Get Knocked Down, It’s Whether You Get Up.” – Inspirational Quote By Vince Lombardi");
        motivationalQuotes.add("“If You Are Working On Something That You Really Care About, You Don’t Have To Be Pushed. The Vision Pulls You.” – Steve Jobs");
        motivationalQuotes.add("“Entrepreneurs Are Great At Dealing With Uncertainty And Also Very Good At Minimizing Risk. That’s The Classic Entrepreneur.” – Mohnish Pabrai");
        motivationalQuotes.add("“Knowing Is Not Enough; We Must Apply. Wishing Is Not Enough; We Must Do.” – Johann Wolfgang Von Goethe");
        motivationalQuotes.add("“Whether You Think You Can Or Think You Can’t, You’re Right.” – Quote By Henry Ford");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //check if button is pressed
        Button button = findViewById(R.id.my_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //show me a random quote.
                int randomNum = ThreadLocalRandom.current().nextInt(0, motivationalQuotes.size());
                String quote = motivationalQuotes.get(randomNum);

                ((TextView) findViewById(R.id.textView)).setText(quote);
                view.setVisibility(View.GONE);
            }
        });


    }


}