package polinema.ac.id.recycleviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import polinema.ac.id.recycleviewsangatsederhana.adapters.SuperHeroAdapter;
import polinema.ac.id.recycleviewsangatsederhana.models.SuperHero;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSuperHero;

    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSuperHero = findViewById(R.id.rvSuperHero);

        SuperHero hero = new SuperHero("Petruk2");
        listSuperHero.add(hero);
        hero = new SuperHero("Gareng");
        listSuperHero.add(hero);
        hero = new SuperHero("Semar");
        listSuperHero.add(hero);
        hero = new SuperHero("Gareng2");
        listSuperHero.add(hero);
        hero = new SuperHero("Gareng3");
        listSuperHero.add(hero);
        hero = new SuperHero("Gareng4");
        listSuperHero.add(hero);
        hero = new SuperHero("Gareng5");
        listSuperHero.add(hero);

        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));

    }
}
