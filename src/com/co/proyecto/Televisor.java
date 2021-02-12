package com.co.proyecto;

public class Televisor extends Electrodomesticos{
    private Integer pulgadas;
    private Boolean TDT;

    public Televisor(String nombre, Character consumo, String procedencia, Integer pulgadas, Boolean TDT) {
        super(nombre, consumo, procedencia);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
        precioAdicional();
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    public void precioAdicional(){
        Double precioTotal=getPrecio();
        if(this.TDT){
            precioTotal+=250000;
        }

        if(pulgadas>40){
            precioTotal+=getPrecio()*0.3;
        }

        setPrecio(precioTotal);

    }
}
