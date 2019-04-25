package ejercicios;


import paquetedos.Operacion;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JuanPablo
 */
public class SeleccionSimple {
    public static void main(String[] args) {
        //declaramos las variables para 
        int calificacion;
        int calificacion_dos;
        
        //Creamos un objeto para inresar por teclado
        Scanner entrada = new Scanner(System.in);
        
        //pedirmos informacion del teclado
        System.out.println("Ingrese la primera calificacion");
        calificacion = entrada.nextInt();
        
        if(calificacion >= 85){
            System.out.printf("%s %d", Operacion.mensaje, calificacion);
        } 
        
        //pedimos infroamcion del teclado
        System.out.println("Ingrese la segunda calificacion calificacion");
        calificacion_dos = entrada.nextInt();
        
        if(calificacion_dos >= 85){
            System.out.printf("%s, %d",Operacion.mensaje, calificacion_dos);
        } 
        
        
        
    }
}
