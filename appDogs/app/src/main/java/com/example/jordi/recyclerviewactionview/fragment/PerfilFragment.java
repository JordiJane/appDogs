package com.example.jordi.recyclerviewactionview.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jordi.recyclerviewactionview.Animal;
import com.example.jordi.recyclerviewactionview.AnimalAdapter;
import com.example.jordi.recyclerviewactionview.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {
    ArrayList<Animal> animal;
    private RecyclerView listAnimals;

    public PerfilFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.FragmentProfile,container,false);

        listAnimals = (RecyclerView) view.findViewById(R.id.mascotasCircular);
        generateGridLayoutVertical();
        initializeListAnimals();
        initializeAdapter();

        // Inflate the layout for this fragment
        return view;
    }

    public void generateGridLayoutVertical() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        gridLayoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
        listAnimals.setLayoutManager(gridLayoutManager);
    }
    public void initializeAdapter(){
        AnimalAdapter adapter = new AnimalAdapter(animal,getActivity());
        listAnimals.setAdapter(adapter);
    }

    public void initializeListAnimals(){
        animal = new ArrayList<Animal>();

        animal.add(new Animal(R.drawable.perroicono2,"Perry","2"));
        animal.add(new Animal(R.drawable.perroicono2,"Perry","2"));
        animal.add(new Animal(R.drawable.perroicono2,"Perry","2"));
        animal.add(new Animal(R.drawable.perroicono2,"Perry","2"));
    }

}
