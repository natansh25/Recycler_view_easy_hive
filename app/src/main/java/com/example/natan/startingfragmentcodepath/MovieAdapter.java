package com.example.natan.startingfragmentcodepath;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by natan on 11/15/2017.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {


    private List<Movie> mMovieList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //refers to the custom layout (onCreate view holder)



        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movielayout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        //set text

        Movie movie = mMovieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        // return the item count
        return mMovieList.size();
    }

    public MovieAdapter(List<Movie> moviesList) {
        this.mMovieList = moviesList;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);

            //matches with the id
            title = (TextView) view.findViewById(R.id.Movietitle);
            genre = (TextView) view.findViewById(R.id.Genre);
            year = (TextView) view.findViewById(R.id.Year);


        }




    }






}
