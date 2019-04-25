package ejercicios;


import java.util.Scanner;
import paquetedos.Operacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanPablo
 */
public class SelecionDoble {
    public static void main(String[] args) {
        
        //declarando las variables
        int calificacion;
        int calificacionDos;
        
        //creando el objeto para pedir por teclado
        Scanner entrada = new Scanner(System.in);
        
        //pidiendo la calificacion
        System.out.println("Ingrese la primera calificacion");
        calificacion = entrada.nextInt();
        
        //validando e imprimiendo el resultado
        if(calificacion >= 85){
            System.out.printf("%s %d\n", Operacion.mensaje, calificacion);
        }else{
            System.out.printf("%s %d\n", Operacion.mensajeDos, calificacion);
        } 
        
        System.out.println("Ingrese la segunda calificacion calificacion");
        calificacionDos = entrada.nextInt();
        
        if(calificacionDos >= 85){
            System.out.printf("%s, %d\n",Operacion.mensaje, calificacionDos);
        }else{
            System.out.printf("%s %d\n", Operacion.mensajeDos, calificacionDos);
        }
        
        
    }
}
