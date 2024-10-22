package com.angelpuentesdevv.resonancerealm.principal;

import com.angelpuentesdevv.resonancerealm.modelos.Cancion;
import com.angelpuentesdevv.resonancerealm.modelos.Podcast;


public class Principal {

    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("What Now Remains");
        miCancion.setAlbum("Islands of the Lost and Forgotten");
        miCancion.setCantante("HOYO-MIX");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Angel Puentes");
        miPodcast.setTitulo("Dualismo");
        miPodcast.setDescripcion("...");

        for (int i = 0; i < 1500; i++) {
            miCancion.meGusta();
            miCancion.reproduce();
        }

        for (int i = 0; i < 1000; i++) {
            miPodcast.meGusta();
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de likes: " + miCancion.getTotalDeMeGusta());

        System.out.println("Total de reproducciones: " + miPodcast.getTotalDeReproducciones());
        System.out.println("Total de likes: " + miPodcast.getTotalDeMeGusta());

    }
}
