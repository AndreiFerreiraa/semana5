package opp;

import java.util.ArrayList;

public class Opp {

    public static void main(String[] args) {
        
        ArrayList<Cachorro> listaDogs = new ArrayList<>();
       
        
        Dono donoUm = new Dono ("Maçaneiro", "9999-9999", "rua tal, Nº 10");
        
        
        
        listaDogs.add(new Cachorro("Bob","Pincher",3 , "Pequeno", donoUm));
        
        Cachorro dogDois = new Cachorro("Alfredo","Vira-Lata",3 , "Pequeno", donoUm);
        listaDogs.add(dogDois);
        
        for(Cachorro dog : listaDogs){// ou usar o FOR tradicional
            System.out.println(dog.getNome() +" - "+ dog.getDono().getNome());
        }
              
    }
    
}
