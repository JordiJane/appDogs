package com.example.jordi.recyclerviewactionview.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jordi.recyclerviewactionview.Animal;
import com.example.jordi.recyclerviewactionview.AnimalAdapter;
import com.example.jordi.recyclerviewactionview.R;

import java.util.ArrayList;


public class DogsListFragment extends Fragment {
    ArrayList<Animal> animal;
    private RecyclerView listAnimals;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.FragmentDogsList,container,false);

        listAnimals = (RecyclerView) view.findViewById(R.id.RVmascotas);
        generateLinearLayoutVertical();
        initializeListAnimals();
        initializeAdapter();

        // Inflate the layout for this fragment
        return view;
    }

    public void generateLinearLayoutVertical() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listAnimals.setLayoutManager(linearLayoutManager);
    }
    public void initializeAdapter(){
        AnimalAdapter adapter = new AnimalAdapter(animal,getActivity());
        listAnimals.setAdapter(adapter);
    }

    public void initializeListAnimals(){
        animal = new ArrayList<Animal>();

        animal.add(new Animal(R.drawable.perroicono,"Perry","2"));
        animal.add(new Animal(R.drawable.dog_icon,"Toby","1"));
        animal.add(new Animal(R.drawable.dog_icon2,"Boby","3"));
        animal.add(new Animal(R.drawable.dog_icon3,"Doki","4"));
        animal.add(new Animal(R.drawable.dog_icon5,"Buggie","5"));

    }




}
