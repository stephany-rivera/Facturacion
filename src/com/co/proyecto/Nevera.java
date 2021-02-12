package com.co.proyecto;

public class Nevera extends Electrodomesticos{
    private Integer capacidad;

    public Nevera(String nombre, Character consumo, String procedencia, Integer capacidad) {
        super(nombre, consumo, procedencia);
        this.capacidad = capacidad;
        precioAdicional();
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public void precioAdicional(){
        Integer litros;
        Integer cantidadAumento;

        if(capacidad>120){
            litros=capacidad-120;
            cantidadAumento=litros/10;
            Double precioTotal=getPrecio()+cantidadAumento*0.05*getPrecio();
            setPrecio(precioTotal);

        }
        
    }

}
