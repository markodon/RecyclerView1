package com.example.markodonovski.recyclerview1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        CustomImageAdapter adapter = new CustomImageAdapter(this);

        adapter.setItems(generateList());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }

    ArrayList<ImageData> generateList(){
        ArrayList<ImageData> dataArrayList = new ArrayList<>();

        dataArrayList.add(new ImageData("http://pluspng.com/img-png/tank-png-image-armored-tank-436.png"));
        dataArrayList.add(new ImageData("http://www.worldanimalfoundation.net/i/tiger.jpg"));
        dataArrayList.add(new ImageData("http://pluspng.com/img-png/bart-simpson-png-1000.png"));
        dataArrayList.add(new ImageData("http://imagenpng.com/wp-content/uploads/2015/03/cigarette-150153_640.png"));



        return dataArrayList;
    }




}
