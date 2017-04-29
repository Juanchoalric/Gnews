package com.example.juancho.gnews;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import static java.security.AccessController.getContext;

/**
 * Created by juancho on 29/04/17.
 */

public class NoticiasAdapter extends BaseAdapter{
    List<Noticia> listaDeNoticias;
    Context unContexto;
    @Override
    public int getCount() {
        return listaDeNoticias.size();
    }

    @Override
    public Noticia getItem(int position) {
        return listaDeNoticias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Noticia unaNoticia = getItem(position);

        LayoutInflater inflater = LayoutInflater.from(unContexto);
        convertView = inflater.inflate(R.layout.card_view_element, parent, false);


        TextView textViewTitulo = (TextView) convertView.findViewById(R.id.title_view);
        textViewTitulo.setText(unaNoticia.getTitle());

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_view);
        Glide.with(unContexto).load(unaNoticia.getUrlToImage()).into(imageView);

        TextView textViewDescripcion = (TextView) convertView.findViewById(R.id.description_view);
        textViewDescripcion.setText(unaNoticia.getDescription());


        return convertView;
    }
}
