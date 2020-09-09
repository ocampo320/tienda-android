package com.example.intents;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tienda_mascotas.DetalleContacto;
import com.example.tienda_mascotas.Mascota;
import com.example.tienda_mascotas.R;

import java.util.ArrayList;

public class ContactoAdaptor extends RecyclerView.Adapter<ContactoAdaptor.ContactoVieHolder> {


    ArrayList<Mascota> contactos;
    Activity activity;

    public ContactoAdaptor(ArrayList<Mascota> contactos, Activity activity) {
        this.contactos = contactos;
        this.activity = activity;
    }

    @NonNull
    @Override
    //darle vida al layaut card view
    public ContactoVieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_mascotas, parent, false);
        return new ContactoVieHolder(v);
    }

    //osocia cada elemento a la lista
    @Override
    public void onBindViewHolder(@NonNull ContactoVieHolder holder, int position) {
        final Mascota contacto = contactos.get(position);
        holder.imgFoto.setImageResource(contacto.getFoto());
        holder.tvNombre.setText(contacto.getNombre());
        holder.tvRaza.setText(contacto.getEdad());


        holder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, contacto.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, DetalleContacto.class);
                intent.putExtra("nombre",contacto.getNombre());
                intent.putExtra("raza",contacto.getRaza());
                intent.putExtra("edad",contacto.getEdad());
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {//La cantidad de elemtos que contiene mi lista
        return contactos.size();
    }

    public static class ContactoVieHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvNombre;
        private TextView tvRaza;

        public ContactoVieHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombreCard);
            tvRaza = (TextView) itemView.findViewById(R.id.tvTelefonoCard);
        }
    }
}
