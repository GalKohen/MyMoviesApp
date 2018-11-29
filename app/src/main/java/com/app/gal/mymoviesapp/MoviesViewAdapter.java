package com.app.gal.mymoviesapp;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.gal.mymoviesapp.model.Movie;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gal Kohen on 26/11/2018.
 */
public class MoviesViewAdapter extends RecyclerView.Adapter<MoviesViewAdapter.ViewHolder> {

    private static final String TAG = "MoviesViewAdapter";
    List<Movie> movies;
    private Context mContext;
    OnRecyclerClickListener mOnRecyclerClickListener;

    public MoviesViewAdapter(Context context, List<Movie> movies, OnRecyclerClickListener onRecyclerClickListener) {
        mContext = context;
        this.movies = new ArrayList<>();
        this.movies = movies;
        mOnRecyclerClickListener = onRecyclerClickListener;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: position is: "+position);
        holder.onBindViewHolder(movies.get(position));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView ivImage;
        public final TextView tvTitle;
        public final TextView tvOverview;

        public ViewHolder(final View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.movie_row_image);
            tvTitle = itemView.findViewById(R.id.movie_row_title);
            tvOverview = itemView.findViewById(R.id.movie_row_content);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnRecyclerClickListener.onItemClick(itemView, getAdapterPosition());
                }
            });
        }

        public void onBindViewHolder(Movie movie) {
            tvTitle.setText(movie.getName());
            tvOverview.setText(R.string.sampleContent);
            Picasso.get().load(movie.getMovieImageLink()).into(ivImage);
            Log.d(TAG, "onBindViewHolder: get movie link");
        }


    }


}
