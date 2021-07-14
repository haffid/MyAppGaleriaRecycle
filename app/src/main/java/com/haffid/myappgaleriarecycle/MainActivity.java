package com.haffid.myappgaleriarecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView titulo;
    ArrayList<Integer> lista = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Galeria");

        recyclerView = findViewById(R.id.recyclerId);
        titulo = findViewById(R.id.txtTitulo);


        lista.add(R.drawable.ic_abs1);
        lista.add(R.drawable.ic_abs2);
        lista.add(R.drawable.ic_abs3);
        lista.add(R.drawable.ic_abs4);
        lista.add(R.drawable.ic_abs5);
        lista.add(R.drawable.ic_abs6);
        lista.add(R.drawable.ic_abs7);
        lista.add(R.drawable.ic_abs8);
        lista.add(R.drawable.ic_abs9);
        lista.add(R.drawable.ic_abs10);

        AdaptadorRecycler adaptadorRecycler = new AdaptadorRecycler(lista);
        recyclerView.setAdapter(adaptadorRecycler);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.item1:
                recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
                titulo.setText("Lista");
                break;
            case R.id.item2:
                recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL));
                titulo.setText("Mosaico");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}