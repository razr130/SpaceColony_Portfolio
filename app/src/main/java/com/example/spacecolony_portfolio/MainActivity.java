package com.example.spacecolony_portfolio;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {
    /*ViewFlipper v_flipper;*/
    /*int images[] = {R.drawable.slider1, R.drawable.slider2, R.drawable.slider3, R.drawable.slider4};*/
    private int[] arrayimages = new int[]{
            R.drawable.slider1, R.drawable.slider2, R.drawable.slider3, R.drawable.slider4
    };

    private String[] descimages = new String[]{
      "one","two","three","four"
    };

    private BottomNavigationView nav_bar;
    private FrameLayout theframe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav_bar = (BottomNavigationView) findViewById(R.id.nav_bar);
        theframe = (FrameLayout) findViewById(R.id.the_frame);

    nav_bar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            return false;
        }
    });


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        ImageView avatar = findViewById(R.id.SC_foto);
        TextView TxtNama = findViewById(R.id.TxtNama);
        TextView TxtBio = findViewById(R.id.TxtAbout);

        StringBuilder stringbuilder = new StringBuilder();

        String message = " blalbalbalblablala ";

        for(int i = 0; i<50;i++){

            stringbuilder.append(message);

        }

            TxtBio.setText(stringbuilder.toString());

       /* CarouselView carouselView = findViewById(R.id.SC_carousel);
        carouselView.setPageCount(arrayimages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(arrayimages[position]);
            }
        });
        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText( MainActivity.this, descimages[position], Toast.LENGTH_SHORT).show();
            }
        });*/


       /* int images[] = {R.drawable.slider1, R.drawable.slider2, R.drawable.slider3, R.drawable.slider4};
        v_flipper = findViewById(R.id.v_flipper);

        for (int i = 0;i<images.length; i++){
            flipperimages(images[i]);
        }*/
    }

    /*public void flipperimages(int images){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);


    }*/



}
