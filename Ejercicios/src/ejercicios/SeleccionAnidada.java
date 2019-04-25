/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
import paquetedos.OperacionDos;
/**
 *
 * @author JuanPablo
 */
public class SeleccionAnidada {
    public static void main(String[] args) {
        //declaramos las variables
        int calificacion;
        
        //creamos el objeto para ingresar por tecaldo
        Scanner entrada = new Scanner(System.in);
        
        //pedimos la calificaion por tecalod
        System.out.println("Ingrese la calificacion");
        calificacion = entrada.nextInt();
        
        //validamos la nota y mostramos resultados
        if(calificacion >= 90){
            System.out.printf("%s (%s) con %d", OperacionDos.mensaje, 
                    OperacionDos.excelente, calificacion);
        }else{
            if(calificacion < 90 && calificacion >= 80){
                System.out.printf("%s (%s) con %d", OperacionDos.mensaje, 
                        OperacionDos.muyBuena, calificacion);
            }else{
                if(calificacion < 80 && calificacion >= 50){
                   System.out.printf("%s (%s) con %d", OperacionDos.mensaje, 
                           OperacionDos.regular, calificacion); 
                }else{
                    System.out.printf("%s con%d", OperacionDos.mensajeDos, 
                            calificacion);
                }
            }
        }
    }
}
