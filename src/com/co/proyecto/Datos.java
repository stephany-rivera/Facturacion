package com.co.proyecto;

import java.util.Scanner;

public class Datos {
    public Datos() {

    }


   public String solicitarNombre(){
        Scanner in = new Scanner(System.in);
        String nombre="";
        System.out.println("Digite el nombre:");
        nombre = in.next();
        return nombre;
   }

    public Character solicitarConsumo(){
        Scanner in = new Scanner(System.in);
        String consumo;
        System.out.println("Digite el tipo de consumo:");
        while (!in.hasNext("[ABC]")) {
            System.out.println("Solo se reciben como respuesta A ó B ó C ");
            in.next();
        }
        consumo = in.next();
        return consumo.charAt(0);
    }

    public String solicitarProcedencia(){
        Scanner in = new Scanner(System.in);
        String procedencia="";
        System.out.println("Digite la procedencia:");
        procedencia = in.next();
        return procedencia;
    }

    public Integer solicitarCapacidad(){
        Scanner in = new Scanner(System.in);
        Integer capacidad=0;
        System.out.println("Digite la capacidad de la nevera:");
        while(!in.hasNextInt()) in.next();
        capacidad= in.nextInt();
        return capacidad;
    }

    public Integer solicitarPulgadas(){
        Scanner in = new Scanner(System.in);
        Integer pulgadas=0;
        System.out.println("Digite las pulgadas del televisor:");
        while(!in.hasNextInt()) in.next();
        pulgadas= in.nextInt();
        return pulgadas;
    }

    public Boolean solicitarTDT(){
        Scanner in = new Scanner(System.in);
        Boolean TDT;
        System.out.println("Digite Y: si el televisor tiene TDT ó N: Si el televisor no tiene TDT");
        while (!in.hasNext("[YN]")) {
            System.out.println("Solo se reciben como respuesta Y Ó N");
            in.next();
        }
        if(in.next().equalsIgnoreCase("Y")){
            TDT=Boolean.TRUE;
        }
        else{
            TDT=Boolean.FALSE;
        }

        return TDT;
    }












}
