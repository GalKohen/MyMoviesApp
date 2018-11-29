package com.app.gal.mymoviesapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.gal.mymoviesapp.R;
import com.app.gal.mymoviesapp.model.Model;
import com.squareup.picasso.Picasso;

/**
 * Created by Gal Kohen on 29/11/2018.
 */
public class MovieDetailsFragment extends Fragment {

    private static final String TAG = "MovieDetailsFragment";
    int position = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_details, container, false);
        Log.d(TAG, "onCreateView: starts");
        position = getArguments().getInt("MOVIE_POSITION");

        View layout = view.findViewById(R.id.activity_details);

        Log.d(TAG, "onCreateView: starts to init page");
        TextView textView = layout.findViewById(R.id.textView8);
        textView.setMovementMethod(new ScrollingMovementMethod());
        TextView detailsTitle = layout.findViewById(R.id.details_title);
        detailsTitle.setText((Model.getInstance().getMovies().get(position)).getName());
        ImageView imageView = layout.findViewById(R.id.details_small_pic);
        Picasso.get().load((Model.getInstance().getMovies().get(position)).getMovieImageLink()).into(imageView);

        Button button = layout.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=6ZfuNTqbHE8"));
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


        Log.d(TAG, "onCreateView: ends");
        return view;
    }
}
