package trabajoPOO;

public class Voto {
	String nombre;
	int votos;
	
	public Voto(String nombre,int votos) {
		this.nombre = nombre;
		this.votos = votos;
		}
	
	public void mostrarDatos() {
		System.out.println("El nombre del candidato es: "+nombre);
		System.out.println("Los votos del candidato fueron: "+votos);
		
		
	}
}
	