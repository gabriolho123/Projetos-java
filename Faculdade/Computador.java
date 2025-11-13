package Entidades;

public class Computador {

	private String numeroSerie;
    private String modelo;
    private int memoriaRAM;
    private boolean statusLigado;
    
    
    public Computador(String numeroSerie, String modelo, int memoriaRam ){
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.memoriaRAM = memoriaRam;
		this.statusLigado = false;
	}
    
    public void ligar() {
    	if (this.statusLigado == false) {
            this.statusLigado = true;
            System.out.println("O computador " + this.modelo + " foi ligado");

        } else {
            System.out.println("O computador " + this.modelo + " ja esta ligado");
        }
    }
    
    
    public void desligar() {
    	if (this.statusLigado = true) {
    		this.statusLigado = false;
    		System.out.println(" O computador " + this.modelo + " foi desligado ");
    	}
    	else {
    		System.out.println(" O comptaudor " + this.modelo + " ja estava desligado ");
    	}
    }
    
    public boolean isligar() {
    	return this.statusLigado;
    }
    
    public boolean isDesligar() {
    	return this.statusLigado;
    }
    
    public String toString() {
    	return 
    	" Modelo: " +  this.modelo + 
    	" Numero de serie: " +  this.numeroSerie + 	
    	" Memoria ram " + this.memoriaRAM + 
    	" Status: " + (this.statusLigado ? "LIGADOR " :"DESLIGADO");
    	
    }
    

    
}

	
	

