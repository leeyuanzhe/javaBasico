
package Projeto.animais;

import Projeto.Mamifero;


public class Cachorro extends Lobo{
    
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("AU AU AU");
    }
    
    public void reagir(String frase){
    if(frase.equals("toma comida") || frase.equals("ola")){
         System.out.println("Abanar ou latir");
    }else{
         System.out.println("Rosnar");
        }
    }
    
    public void reagir (int hora,int min){
        if(hora <12){
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar ou latir");
        }    
    }
    public void reagir (boolean dono){
        if(dono = true){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir (int idade, float peso){
        if(idade < 5){
            if(peso<10){
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }
        }else{
            if(peso<10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }           
        }
            
    }
    
}
