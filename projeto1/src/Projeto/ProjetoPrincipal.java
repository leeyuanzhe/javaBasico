
package Projeto;

import Projeto.animais.Cachorro;
import Projeto.animais.Canguru;
import Projeto.animais.Lobo;

public class ProjetoPrincipal {

   
   public static void main(String[] args) {
   
    Mamifero m = new Mamifero();
    Cachorro c = new Cachorro();
   
    
   
    
    c.reagir("ola");
    c.reagir("vai apanhar");
    c.reagir(11, 20);
    c.reagir(21, 0);
    c.reagir(false);
    c.reagir(4, 10);
    
    
 
   }
}
