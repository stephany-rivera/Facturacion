package com.co.proyecto;

public abstract class Electrodomesticos {
    private String nombre;
    private Character consumo;
    private String procedencia;
    private Double precio;

    public Electrodomesticos(String nombre, Character consumo, String procedencia) {
        this.nombre = nombre;
        this.consumo = consumo;
        this.procedencia = procedencia;
        precioBase();
    }

    public void precioBase(){
        precio=0.0;
        switch (consumo){
            case 'A':precio+=450000;break;
            case 'B': precio+=350000;break;
            case 'C': precio+=250000;break;
            default: System.out.println("Error el consumo no es valido");
        }

        if (procedencia.equalsIgnoreCase("Nacional")){
            precio+=250000;
        }
        else if(procedencia.equalsIgnoreCase("Importado")){
            precio+=350000;
        }
        else{
            System.out.println("Error en digitar procedencia");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    public void precioAdicional(){


    }
}
