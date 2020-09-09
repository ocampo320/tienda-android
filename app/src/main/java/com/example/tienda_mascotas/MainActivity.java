package com.example.tienda_mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> listMAscotas;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listMAscotas = new ArrayList<Mascota>();
        listMAscotas.add(new Mascota("Yanco","coqui","20",R.drawable.mascota1));
        listMAscotas.add(new Mascota("Brenda","coqui","20",R.drawable.mascota2));
        listMAscotas.add(new Mascota("Ramon","coqui","20",R.drawable.mascota3));
        listMAscotas.add(new Mascota("Pepe","coqui","20",R.drawable.mascota4));
        listMAscotas.add(new Mascota("Pricipe","coqui","20",R.drawable.mascota5));
        listMAscotas.add(new Mascota("Maria","coqui","20",R.drawable.mascota6));
        listMAscotas.add(new Mascota("Pedro","coqui","20",R.drawable.mascota7));
        listMAscotas.add(new Mascota("Fabian","coqui","20",R.drawable.mascota8));
        listMAscotas.add(new Mascota("Bebe","coqui","20",R.drawable.mascota9));
        listMAscotas.add(new Mascota("Niño","coqui","20",R.drawable.mascota10));
        recyclerView=(RecyclerView) findViewById(R.id.rvContactos);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        inicializarListaContactos();
        inizializarAdaptador();

    }
    public void inicializarListaContactos(){
        listMAscotas = new ArrayList<Mascota>();
        listMAscotas.add(new Mascota("Yanco","coqui","20",R.drawable.mascota1));
        listMAscotas.add(new Mascota("Brenda","coqui","20",R.drawable.mascota2));
        listMAscotas.add(new Mascota("Ramon","coqui","20",R.drawable.mascota3));
        listMAscotas.add(new Mascota("Pepe","coqui","20",R.drawable.mascota4));
        listMAscotas.add(new Mascota("Pricipe","coqui","20",R.drawable.mascota5));
        listMAscotas.add(new Mascota("Maria","coqui","20",R.drawable.mascota6));
        listMAscotas.add(new Mascota("Pedro","coqui","20",R.drawable.mascota7));
        listMAscotas.add(new Mascota("Fabian","coqui","20",R.drawable.mascota8));
        listMAscotas.add(new Mascota("Bebe","coqui","20",R.drawable.mascota9));
        listMAscotas.add(new Mascota("Niño","coqui","20",R.drawable.mascota10));
    }
    public com.example.intents.ContactoAdaptor adaptor;
    public void inizializarAdaptador(){

        adaptor = new com.example.intents.ContactoAdaptor(listMAscotas,this    );
        recyclerView.setAdapter(adaptor);
    }

    public void irPaginaDos(View view){
        Intent intent=new Intent(this,top_mascotas.class);
        startActivity(intent);

    }
    public void irPagiUno(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
