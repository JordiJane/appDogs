package com.example.jordi.recyclerviewactionview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ActivityDogs extends AppCompatActivity {
    ArrayList<Animal> animals;
    private RecyclerView animalsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ActivityDogs);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        animalsList = (RecyclerView) findViewById(R.id.RVmascotas2);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        animalsList.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }
    public void inicializarAdaptador(){
        AnimalAdapter adapter = new AnimalAdapter(animals,this);
        animalsList.setAdapter(adapter);
    }

    public void inicializarListaMascotas(){
        animals = new ArrayList<Animal>();

        animals.add(new Animal(R.drawable.dog_icon2,"Boby","3"));
        animals.add(new Animal(R.drawable.perroicono,"Perry","2"));
        animals.add(new Animal(R.drawable.dog_icon,"Toby","1"));
        animals.add(new Animal(R.drawable.dog_icon5,"Buggie","5"));
        animals.add(new Animal(R.drawable.dog_icon3,"Doki","4"));


    }

}
