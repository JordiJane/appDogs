package com.example.jordi.recyclerviewactionview;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jordi.recyclerviewactionview.fragment.DogsListFragment;
import com.example.jordi.recyclerviewactionview.fragment.PerfilFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ViewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();


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
                Intent intent = new Intent(MainActivity.this, ActivityDogs.class);
                startActivity(intent);
                break;
            case R.id.contacto:
                Intent i = new Intent(MainActivity.this, Contact.class);
                startActivity(i);
                break;
            case R.id.acercaDe:
                Intent j = new Intent(MainActivity.this, InformationDeveloper.class);
                startActivity(j);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new DogsListFragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }
    private void setUpViewPager(){

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.icons8_home_50);
        tabLayout.getTabAt(1).setIcon(R.drawable.icons8_dog_48);

    }



}
