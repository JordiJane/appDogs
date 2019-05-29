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

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {
    ArrayList <Animal> animalsArrayList;
    Activity activity;

    public MascotaAdaptador(ArrayList<Animal> animalsArrayList, Activity activity) {
        this.animalsArrayList = animalsArrayList;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder holder, int position) {
        final Animal mascota = animalsArrayList.get(position);
        holder.photo.setImageResource(mascota.getPhoto());
        holder.name.setText(mascota.getName());
        holder.ranking.setText(mascota.getRanking());

        holder.bone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity,"Diste like a " + mascota.getName(),Toast.LENGTH_LONG).show();
            }
        });


    }


    @Override
    public int getItemCount() {

        return animalsArrayList.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView photo;
        private TextView name;
        private TextView ranking;
        private ImageView bone;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.imgFoto);
            name = (TextView) itemView.findViewById(R.id.nombreCV);
            ranking = (TextView) itemView.findViewById(R.id.ranking);
            bone = (ImageView) itemView.findViewById(R.id.huesoBlanco);

        }
    }
}
