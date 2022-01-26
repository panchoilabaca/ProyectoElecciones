package fuentes;

public class Principal {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante(); //Instanciando la clase
		Estudiante estudiante2 = new Estudiante(); //Instanciando la clase
		Estudiante estudiante3 = new Estudiante(); //Instanciando la clase
		
		estudiante.setNombre("Victor");
		estudiante.setApellido_materno("Contreras");
		estudiante.setEdad(25);
		
		estudiante2.setNombre("Eleine");
		estudiante3.setNombre("Jocelyn");
		
		/*estudiante.nombre="Victor";
		estudiante2.nombre="Eleine";
		estudiante3.nombre="Jocelyn";
		
		estudiante.edad=30;*/
		
		
		System.out.println(estudiante.getNombre()  + ", " + estudiante2.getNombre()  + " y " + estudiante3.getNombre() +  " Pertenecen al curso de Java");
		
		
		
		// Elementos de programacion
		// 1 variables
		
		/*
		int i, variable;
		String variablestring;
		
		i=1;
		variable = 90;
		variablestring = null;*/
		
		
		
		/*
		System.out.println("Hola Mundo");
		System.out.println(i / variable);
		System.out.println(variable);
		System.out.println(variable + variablestring + i);
		
		
		
		//2 Estructuras de control
		// 2.1 Control de flujo
		
		/*
		
		if (i == 1) {
			System.out.println("Catolica");
		} else if (i == 3) {
			System.out.println("Cobreloa");
		} else if (i == 4) {	
		     System.out.println("Cobreloa");
		} else {
			System.out.println("Colo Colo");
		};	
		*/
		
		
		/*	
		i = 4; // este numero puede variar para elegir algun equipo de abajo
		switch(i) {
		case 1:
			System.out.println("Catolica");
			break;
		case 2:
			System.out.println("Magallanes");
			break;
		case 3:
			System.out.println("Cobreloa)");
			break;
		case 4:
			System.out.println("Colo");
			break;
			default:
				System.out.println("La chile");
				
		};
		*/
		
			
	
		 /*   
		// 2.2 Control repetitivas
		//2.2.1 FOR
		for (int j=0; j<19; j++) {
		for (i=0; i<6; i=i+1) {
			System.out.println(" La nota " + (i + 1) + " del estudiante " + (j + 1));
			
				
		    };
		
		
		
        
		};*/
		
	
		
		
		
	

		
	}
	
}

	
