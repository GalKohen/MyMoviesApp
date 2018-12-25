package com.app.gal.mymoviesapp;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.app.gal.mymoviesapp.model.Model;

public class MoviesActivity extends BaseActivity implements OnRecyclerClickListener  {
    private static final String TAG = "MoviesActivity";
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: starts");
        setContentView(R.layout.activity_movies);
        initRecyclerView();
        Log.d(TAG, "onCreate: ends");
    }
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init start");
        mRecyclerView = findViewById(R.id.movies_recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MoviesViewAdapter(this, Model.getInstance().getMovies(),this);
        mRecyclerView.setAdapter(mAdapter);
        Log.d(TAG, "initRecyclerView: ends");
    }

    @Override
    public void onItemClick(View view, int position) {
        Log.d(TAG, "onItemClick: position"+position);
        Toast.makeText(MoviesActivity.this, "normal tap at position: " + position, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MoviesActivity.this, DetailsActivity.class);
        i.putExtra(MoviePosition, position);
        startActivity(i);

    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: start");
        super.onDestroy();
    }
}
