package com.co.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Integer opcion;
    Boolean stop=Boolean.TRUE;
    ArrayList<Electrodomesticos> electrodomesticos = new ArrayList<Electrodomesticos>();


    public void cicloMenu(){
        do{
            mostrarMenu();
        }
        while(stop);
    }

    public void mostrarMenu(){
        System.out.println("Facturación venta de electrodomesticos");
        System.out.println("Elige una opción");
        System.out.println("1. Registrar televisor");
        System.out.println("2. registrar nevera");
        System.out.println("3. registrar otros electrodomesticos");
        System.out.println("4. Mostrar ventas");
        System.out.println("5. Salir");
        Scanner in = new Scanner(System.in);
        while(!in.hasNextInt()) in.next();
        opcion = in.nextInt();

        switch(opcion){
            case 1: registrarTelevisor();break;
            case 2: registrarNevera();break;
            case 3: registrarOtros();break;
            case 4: mostrarVentas();break;
            case 5: stop=Boolean.FALSE;break;
            default: System.out.println("Elija una opción correcta");
        }

    }

    public void registrarTelevisor(){
        Datos datos= new Datos();
        System.out.println("Registro venta de Televisor");
        String nombre= datos.solicitarNombre();
        Character consumo=datos.solicitarConsumo();
        String procedencia=datos.solicitarProcedencia();
        Integer pulgadas=datos.solicitarPulgadas();
        Boolean TDT= datos.solicitarTDT();
        Electrodomesticos televisor= new Televisor(nombre,consumo, procedencia,pulgadas,TDT);
        electrodomesticos.add(televisor);
        System.out.println("Registro Venta Televisor exitoso");
    }

    public void registrarNevera(){
        Datos datos= new Datos();
        System.out.println("Registro venta de nevera");
        String nombre= datos.solicitarNombre();
        Character consumo=datos.solicitarConsumo();
        String procedencia=datos.solicitarProcedencia();
        Integer capacidad= datos.solicitarCapacidad();
        Electrodomesticos nevera= new Nevera(nombre,consumo, procedencia,capacidad);
        electrodomesticos.add(nevera);
        System.out.println("Registro Venta nevera exitoso");
    }

    public void registrarOtros(){
        Datos datos= new Datos();
        String nombre= datos.solicitarNombre();
        Character consumo=datos.solicitarConsumo();
        String procedencia=datos.solicitarProcedencia();
        //Electrodomesticos otros= new Electrodomesticos(nombre, consumo, procedencia);
        //electrodomesticos.add(televisor);
    }

    public void mostrarVentas(){
        Double totalVentasNevera=0.0;
        Double totalVentasTelevisores=0.0;
        System.out.println("Ventas:");
        for (Electrodomesticos producto : electrodomesticos ) {
            if (producto instanceof Nevera) {
                totalVentasNevera+=((Nevera) producto).getPrecio();
            }

            if (producto instanceof Televisor) {
                totalVentasTelevisores+=((Televisor) producto).getPrecio();
            }
        }

        System.out.println("Total ventas de neveras: "+totalVentasNevera);
        System.out.println("Total ventas de Televisores: "+ totalVentasTelevisores);

    }






}
