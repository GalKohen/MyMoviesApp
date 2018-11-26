package com.app.gal.mymoviesapp;

import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.app.gal.mymoviesapp.model.Model;

public class MoviesActivity extends AppCompatActivity implements OnRecyclerClickListener  {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        initRecyclerView();

    }
    private void initRecyclerView(){
        mRecyclerView = (RecyclerView) findViewById(R.id.movies_recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MoviesViewAdapter(this, Model.getInstance().getMovies(),this);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(MoviesActivity.this, "normal tap at position: " + position, Toast.LENGTH_SHORT).show();
    }

}
