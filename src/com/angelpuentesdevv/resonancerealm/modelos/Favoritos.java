package com.angelpuentesdevv.resonancerealm.modelos;

public class Favoritos {

    public void incluye(Audio audio){
        if (audio.getClasificacion() >= 10){
            System.out.println(audio.getTitulo() + " Es uno de tus favoritos!");
        } else {
            System.out.println(audio.getTitulo() + " Es uno de tus favoritos igual!");
        }
    }
}
