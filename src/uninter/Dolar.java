package uninter;

public class Dolar extends Moeda{
    
    public Dolar(double valor){
        this.valor = valor; 

    }

    @Override
    public void info() {
        System.out.println("Dolar - " + valor);
    }

    @Override
    public double converter() {
        return this.valor * 4.80;
        
        
        
    }




}


