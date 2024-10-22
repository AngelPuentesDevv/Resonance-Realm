package com.angelpuentesdevv.resonancerealm.modelos;

public class Podcast extends Audio {

    private String presentador;

    private String descripcion;

    @Override
    public int getClasificacion() {
        if (getTotalDeMeGusta() > 5000){
            return 20;
        } else {
            return 10;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
