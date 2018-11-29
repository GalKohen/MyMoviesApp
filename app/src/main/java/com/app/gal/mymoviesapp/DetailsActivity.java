package com.app.gal.mymoviesapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.Toast;

import com.app.gal.mymoviesapp.fragments.MovieDetailsFragment;
import com.app.gal.mymoviesapp.model.Model;

public class DetailsActivity extends BaseActivity {
    private static final String FRAGMENT_TAG = "DetailsActivity_FRAGMENT_TAG";
    private static final String TAG = "DetailsActivity";

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: starts");
        setContentView(R.layout.activity_detail_for_fragment);
/*
        MovieDetailsFragment movieDetailsFragment = new MovieDetailsFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.activity_detail_main_frame,movieDetailsFragment,FRAGMENT_TAG).commit();
  */
        // Instantiate a ViewPager and a PagerAdapter.
        mPager = findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        int position = getIntent().getIntExtra(MoviePosition, 0);

        mPager.setCurrentItem(position, false);



/*

        TextView textView =findViewById(R.id.textView8);
        textView.setMovementMethod(new ScrollingMovementMethod());
        int position = 0 ;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                position= 0;
            } else {
                position= extras.getInt(MoviePosition);
            }
        }


        TextView detailsTitle =findViewById(R.id.details_title);
        detailsTitle.setText((Model.getInstance().getMovies().get(position)).getName());
        ImageView imageView  =findViewById(R.id.details_small_pic);
        Picasso.get().load((Model.getInstance().getMovies().get(position)).getMovieImageLink()).into(imageView);




        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=6ZfuNTqbHE8"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

*/
        Log.d(TAG, "onCreate: finish");
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Bundle bundl = new Bundle();
            bundl.putInt("MOVIE_POSITION",position);

            MovieDetailsFragment movieDetailsFragment = new MovieDetailsFragment();
            movieDetailsFragment.setArguments(bundl);
            Log.d(TAG, "***getItem: in position =" + position);
            return  movieDetailsFragment;
        }

        @Override
        public int getCount() {
            return Model.getInstance().getMovies().size();
        }
    }
}
