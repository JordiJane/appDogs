package com.example.jordi.recyclerviewactionview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Jordi on 24/07/2017.
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    ArrayList <Animal> animalsArrayList;
    Activity activity;

    public AnimalAdapter(ArrayList<Animal> animalsArrayList, Activity activity) {
        this.animalsArrayList = animalsArrayList;
        this.activity = activity;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.CardviewAnimal,parent,false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        final Animal animal = animalsArrayList.get(position);
        holder.photo.setImageResource(animal.getPhoto());
        holder.name.setText(animal.getName());
        holder.ranking.setText(animal.getRanking());

        holder.bone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity,"Diste like a " + animal.getName(),Toast.LENGTH_LONG).show();
            }
        });


    }


    @Override
    public int getItemCount() {

        return animalsArrayList.size();
    }

    public static class AnimalViewHolder extends RecyclerView.ViewHolder{
        private ImageView photo;
        private TextView name;
        private TextView ranking;
        private ImageView bone;

        public AnimalViewHolder(View itemView) {
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.imgFoto);
            name = (TextView) itemView.findViewById(R.id.nombreCV);
            ranking = (TextView) itemView.findViewById(R.id.ranking);
            bone = (ImageView) itemView.findViewById(R.id.huesoBlanco);

        }
    }
}
