/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam1fran;

import java.util.Scanner;


/**
 *
 * @author Fran
 */
public class DAM1Fran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tipo;
        int region;
        System.out.println("Hola nuevo entrenador, da la bienvenida al mundo de los pokemon.");
        System.out.println("Soy el Profesor Fran, bienvenido a mi laboratorio");
        do{
        System.out.println("Estoy seguro de que estas deseando inciar tu aventura, pero primero, dime algo sobre ti ¿De donde eres?");
        System.out.println("Kanto->1, Johto->2, Hoenn->3, Sinoh->4, Teselia->5, Kalos->6.");
        Scanner b=new Scanner(System.in);
        region=b.nextInt();
        if((region>6)||(region<1)){
        System.out.println("Que estes en tu mundo no sigmifica que vengas de él. Responde adecuadamente.");
        }
        }while((region>6)||(region<1));
        System.out.println("He dedicado toda mi vida a capturar y entrenar pokemon de todas las generaciones, "
                + "pero por alguna razon solo me quedan estos tres.");    
        System.out.println("Así que elige.");
        do{
        System.out.println("¿De que tipo quieres que sea?");
        System.out.println("Planta->1   Agua->2   Fuego->3.");
        Scanner a=new Scanner(System.in);
        tipo=a.nextInt();
        if((tipo>3)||(tipo<1)){
            System.out.println("Si, Claro. Porque no un Mega Rayquaza para empezar.");
            System.out.println("No te flipes y hazlo bien.");
        }
        }while((tipo!=1)&&(tipo!=2)&&(tipo!=3));
        switch(region){
            case 1:  
                switch(tipo){
                   case 1:
                       System.out.println("Disfruta de Bulbasaur.");
                       break;
                   case 2:
                       System.out.println("Disfruta de Squirtle.");
                       break;
                   case 3:
                       System.out.println("Por Fin, aguien listo que se coge al dragon de fuego.");
                       break;
               }       
            break;
            case 2: 
               switch(tipo){
                   case 1:
                       System.out.println("Disfruta de Chikorita.");
                       break;
                   case 2:
                       System.out.println("Disfruta de tu mierda de Totodile.");
                       break;
                   case 3:
                       System.out.println("Disfruta de Cyndaquil.");
                       break;
               }
            break;
            case 3:
                switch(tipo){
                   case 1:
                       System.out.println("Disfruta de Treeko.");
                       break;
                   case 2:
                       System.out.println("Disfruta de Mudkip.");
                       break;
                   case 3:
                       System.out.println("Disfruta de Torchic.");
                       break;
               }
                
            break;
            case 4:
                switch(tipo){
                   case 1:
                       System.out.println("Disfruta de Turtwig.");
                       break;
                   case 2:
                       System.out.println("Disfruta de Piplup.");
                       break;
                   case 3:
                       System.out.println("Disfruta deCchimchar.");
                       break;
               }
                
            break;
            case 5: 
                switch(tipo){
                   case 1:
                       System.out.println("Disfruta de Snivy.");
                       break;
                   case 2:
                       System.out.println("Disfruta de Oshawott.");
                       break;
                   case 3:
                       System.out.println("Disfruta de Tepig.");
                       break;
               }
            break;
            case 6:
                switch(tipo){
                   case 1:
                       System.out.println("Disfruta de Chespin.");
                       break;
                   case 2:
                       System.out.println("Disfruta de Froakie.");
                       break;
                   case 3:
                       System.out.println("Disfruta de Fenekin.");
                       break;
               }
            break;
        }
    }
    
}
