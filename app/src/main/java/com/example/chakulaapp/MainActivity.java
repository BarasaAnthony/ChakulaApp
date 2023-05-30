package com.example.chakulaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.chakulaapp.Adaptors.CategoryAdaptor;
import com.example.chakulaapp.Adaptors.PopularAdaptor;
import com.example.chakulaapp.Domain.CategoryDomain;
import com.example.chakulaapp.Domain.FoodDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();

    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recylerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("Pizza","cat_1"));
        category.add(new CategoryDomain("Burger","cat_2"));
        category.add(new CategoryDomain("Hotdog","cat_3"));
        category.add(new CategoryDomain("Drink","cat_4"));
        category.add(new CategoryDomain("Donut","cat_5"));

        adapter=new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);

    }


    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopular=findViewById(R.id.recyclerPopular);
        recyclerViewPopular.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain(
                "Pepperoni pizza","pizza1",
                9.76,"\"slices pepperoni,mozzerella cheese, fresh oregon, ground black papper,pizza sauce\""));
        foodList.add(new FoodDomain("Cheese Burger","burger",
                8.78,"beef,Gouda cheese, Special Sauce, Lettuce, tomato"));
        foodList.add(new FoodDomain("Vegetable Pizza", "pizza2",
                7.67, "olive oil, vegetable oil, pitted kalamata, cherry tomatoes, fresh oregano, basil"));

        adapter2=new PopularAdaptor(foodList);
        recyclerViewPopular.setAdapter(adapter2);
        recyclerViewPopular.setLayoutManager(linearLayoutManager);
    }
}