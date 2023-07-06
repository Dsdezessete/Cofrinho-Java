package uninter;

import java.util.ArrayList;

public class Cofrinho {

    private ArrayList <Moeda> listaMoedas;

    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }

    public void listaMoedas() {
        for (Moeda moeda : this.listaMoedas) {
            moeda.info();

        }
    }
    public void Adiconar(Moeda moeda){
        this.listaMoedas.add(moeda);
            
        }

    }



    

