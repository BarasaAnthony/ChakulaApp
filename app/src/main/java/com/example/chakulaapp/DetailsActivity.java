package com.example.chakulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.chakulaapp.Domain.FoodDomain;

public class DetailsActivity extends AppCompatActivity {
    private TextView addCartBtn;
    private TextView title,feeTxt,orderNumberTxt,descriptionTxt;
    private ImageView plus,minus,picFood;
    private FoodDomain object;
    int numberOder = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        inItemView();
        getBundle();
    }

    private void getBundle() {
        object= (FoodDomain)getIntent().getSerializableExtra("object");

        int drawableResourceId = this.getResources().getIdentifier(object.getPic(),"drawable",this.getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(picFood);
        title.setText(object.getTitle());
        feeTxt.setText("$"+object.getFees());
        descriptionTxt.setText(object.getDescription());
       orderNumberTxt.setText(String.valueOf(numberOder));

       plus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               numberOder=numberOder =1;
               orderNumberTxt.setText(numberOder);
           }
       });

       minus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(numberOder>1){
                   numberOder=numberOder-1;
               }

               orderNumberTxt.setText(numberOder);
           }
       });

    }

    private void inItemView() {
        addCartBtn=findViewById(R.id.addToCart);
        title=findViewById(R.id.title_txt);
        feeTxt=findViewById(R.id.priceTxt);
        orderNumberTxt=findViewById(R.id.numberOrderTxt);
        descriptionTxt=findViewById(R.id.descriptionTxt);
        plus=findViewById(R.id.plusBtn);
        minus=findViewById(R.id.minusBtn);
        picFood=findViewById(R.id.pic_food);
    }
}