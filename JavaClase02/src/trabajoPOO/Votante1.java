package trabajoPOO;

public class Votante1 extends Votante{

	private int numeroVotante;
    
    public Votante1(){
    }
    
    public Votante1(String nombre, int edad, char sexo, int numeroVotante){
        super(nombre, edad, sexo);
        this.numeroVotante = numeroVotante;
    }
    
    public int getNumeroVotante() {
        return numeroVotante;
    }
    
    public void setNumeroVotante(int numeroVotante) {
        this.numeroVotante = numeroVotante;

    }
}