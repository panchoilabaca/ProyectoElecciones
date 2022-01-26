package fuentes;

public class Estudiante {// Clase
	private String nombre; // atributo
	private String apellido_paterno;
	private String apellido_materno;// atributo
	private int edad; //atributo en int pq es un numero

	// Constructor, es un metodo que inicializa la clase
	Estudiante() {
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	
	
	
	private String getApellido_paterno() {
		return apellido_paterno;
	}

	private void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	private String getApellido_materno() {
		return apellido_materno;
	}

	void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	private int getEdad() {
		return edad;
	}

	void setEdad(int edad) {
		this.edad = edad;
	}

	String getNombre() {
		return nombre;
	}

	public String getNombreCompleto() {
		String apellido_materno = "";
		 this.apellido_materno = this.apellido_materno;
		
	
	return this.nombre + " " + this.apellido_paterno + apellido_materno;
}
	
}
	


