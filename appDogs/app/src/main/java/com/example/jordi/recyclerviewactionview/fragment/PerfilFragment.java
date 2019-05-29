package com.example.jordi.recyclerviewactionview.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jordi.recyclerviewactionview.Animal;
import com.example.jordi.recyclerviewactionview.MascotaAdaptador;
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
        View v = inflater.inflate(R.layout.fragment_perfil,container,false);

        listAnimals = (RecyclerView) v.findViewById(R.id.mascotasCircular);
        generarGridLayoutVertical();
        inicializarListaMascotas();
        inicializarAdaptador();

        // Inflate the layout for this fragment
        return v;
    }

    public void generarGridLayoutVertical() {
        GridLayoutManager llm = new GridLayoutManager(getContext(),2);
        llm.setOrientation(GridLayoutManager.HORIZONTAL);
        listAnimals.setLayoutManager(llm);
    }
    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(animal,getActivity());
        listAnimals.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        animal = new ArrayList<Animal>();

        animal.add(new Animal(R.drawable.perroicono2,"Perry","2"));
        animal.add(new Animal(R.drawable.perroicono2,"Perry","2"));
        animal.add(new Animal(R.drawable.perroicono2,"Perry","2"));
        animal.add(new Animal(R.drawable.perroicono2,"Perry","2"));
    }

}
