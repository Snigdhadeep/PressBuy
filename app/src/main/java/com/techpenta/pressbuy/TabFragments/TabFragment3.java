package com.techpenta.pressbuy.TabFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import com.techpenta.pressbuy.R;

import java.util.ArrayList;

/**
 * Created by apple on 18/03/16.
 */
public class TabFragment3 extends Fragment {




    private View view;
    CarouselView carouselView;

    LinearLayout linearLayout;


    int[] sampleImages = {
            R.drawable.icon1, R.drawable.icon2, R.drawable.icon3};
   
  /*  private String[] TITLeGgrid = {"Min 70% off", "Min 50% off", "Min 45% off",  "Min 60% off", "Min 70% off", "Min 50% off"};
    private String[] DIscriptiongrid = {"Wrist Watch", "Wrist Watch", "Wrist Watch","Wrist Watch", "Wrist Watch", "Wrist Watch"};
    private String[] Dategrid = {"Explore Now!","Grab Now!","Discover now!", "Great Savings!", "Explore Now!","Grab Now!"};*/




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.carousel_frag3, container, false);
        //frameLayout=(FrameLayout)view.findViewById(R.id.colorfrag1);
        //for carousel
        carouselView=(CarouselView) view.findViewById(R.id.carouselView1);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(sampleImages[position]);
            }
        });




        return view;

    }




}