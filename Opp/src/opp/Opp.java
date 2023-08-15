package opp;

import pet.Dono;
import pet.Cachorro;
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
//        ArrayList<Conta> banco = new ArrayList<>();
//        
//        Pessoa pUm = new Pessoa("Gustavo", "999.999.999-99");
//        Pessoa pDois = new Pessoa("Maçaneiro", "888.888.888.88");
//        Pessoa pTres = new Pessoa ("Filipe", "777.777.777-77");
//        
//        banco.add(new Conta (pUm));
//        banco.add(new Conta (pDois));
//        banco.add(new Conta (pTres));
//        
//        banco.get(0).depositar(1000.0);       
    
//        for (Conta conta:banco){
//          
//         System.out.println(conta.getNumero()+ " - "+ conta.getTitular().getNome());
//            conta.depositar(100.0);
//           System.out.println("");
        //}
//      banco.get(0).sacar(500.0);
//      banco.get(2).sacar(80.0);    
    
    
    
    
    
    
    
    
}

