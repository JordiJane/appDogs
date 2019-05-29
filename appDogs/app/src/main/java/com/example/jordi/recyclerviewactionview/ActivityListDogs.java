package com.example.jordi.recyclerviewactionview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class ActivityListDogs extends AppCompatActivity {
    ArrayList<Animal> animals;
    private RecyclerView animalsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.MainActivity);

        animalsList = (RecyclerView) findViewById(R.id.RVmascotas);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        animalsList.setLayoutManager(linearLayoutManager);
        initializeListAnimals();
        initializeAdapter();

    }

    private ArrayList<Fragment> addFragment(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        return fragments;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.star:
                Intent intent = new Intent(ActivityListDogs.this, ActivityDogs.class);
                startActivity(intent);
                break;
            case R.id.contacto:
                Intent i = new Intent(ActivityListDogs.this, Contact.class);
                startActivity(i);
                break;
            case R.id.acercaDe:
                Intent j = new Intent(ActivityListDogs.this, InformationDeveloper.class);
                startActivity(j);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void initializeAdapter(){
        AnimalAdapter adapter = new AnimalAdapter(animals,this);
        animalsList.setAdapter(adapter);
    }

    public void initializeListAnimals(){
        animals = new ArrayList<Animal>();

        animals.add(new Animal(R.drawable.perroicono,"Perry","2"));
        animals.add(new Animal(R.drawable.dog_icon,"Toby","1"));
        animals.add(new Animal(R.drawable.dog_icon2,"Boby","3"));
        animals.add(new Animal(R.drawable.dog_icon3,"Doki","4"));
        animals.add(new Animal(R.drawable.dog_icon5,"Buggie","5"));

    }


}
