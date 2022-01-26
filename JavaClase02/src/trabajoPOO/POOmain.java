package trabajoPOO;

public class POOmain {

	public static void main(String[] args) {
		Candidato candidato1 = new Candidato();
		
		candidato1.nombre = "Gabriel";
		candidato1.apellido1 ="Boric";
		candidato1.apellido2 ="Font";
		candidato1.edad = 38;
		candidato1.lugarNacimiento = "Punta Arenas";
		candidato1.partido = "Revolución Democrática";
		candidato1.profesion = "Abogado";
		 
		System.out.println("El nombre del candidato es: "+candidato1.nombre);
		System.out.println("El primer apellido del candidato es: "+ candidato1.apellido1);
		System.out.println("El segundo apellido del candidato es: "+candidato1.apellido2);
		System.out.println("La edad del candidato es: "+candidato1.edad);
		System.out.println("El Lugar de Nacimiento del candidato es: "+candidato1.lugarNacimiento);
		System.out.println("El partido político del candidato es: " +candidato1.partido);
		System.out.println("La profesión del candidato es: "+candidato1.profesion);
		
		Candidato candidato2 = new Candidato();
		
		candidato2.nombre = "Jose Antonio";
		candidato2.apellido1 = "Kast";
		candidato2.apellido2 = "Rist";
		candidato2.edad = 50;
		candidato2.lugarNacimiento = "Santiago";
		candidato2.partido = "Partido Republicano";
		candidato2.profesion = "Abogado";
		
		
		System.out.println("\n---------------------------------------------------------------------");
		
		System.out.println("\nEl nombre del candidato es: "+candidato2.nombre);
		System.out.println("El primer apellido del candidato es: "+ candidato2.apellido1);
		System.out.println("El segundo apellido del candidato es: "+candidato2.apellido2);
		System.out.println("La edad del candidato es: "+candidato2.edad);
		System.out.println("El Lugar de Nacimiento del candidato es: "+candidato2.lugarNacimiento);
		System.out.println("El partido político del candidato es: " +candidato2.partido);
		System.out.println("La profesión del candidato es: "+candidato2.profesion);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
		
	
		
		//Acá Instanciamos los votos totales
				Voto v1 = new Voto("Gabriel Boric", 2000000);
				
				v1.mostrarDatos();
				
				System.out.println("---------------------------------------------------------------------");
				System.out.println("---------------------------------------------------------------------");
				
				
				
				Voto v2 = new Voto("Jose A. Kast", 1000000);
				
				v2.mostrarDatos();
				
				Edadvop1 edad1 = new Edadvop1();
				edad1.SetEdad(35);
				
				System.out.println("----------------------------------------------------------------------");
				System.out.println("----------------------------------------------------------------------");
				
				System.out.println("La edad promedio de los votantes de Boric es: " +edad1.GetEdad());
				
				Edadvop2 edad2 = new Edadvop2();
				edad2.SetEdad(55);
				
				System.out.println("----------------------------------------------------------------------");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("La edad promedio de los votantes de Kast es: " +edad2.GetEdad());
				
				Votante1 francisco = new Votante1();
				
				francisco.getNombre();
				francisco.getEdad();
				francisco.getSexo();
				
				
				francisco.setNumeroVotante(1520);
				
				System.out.println("Nombre del votante: " +francisco.getEdad());
				System.out.println("Sexo del votante: "+francisco.getSexo());
				System.out.println("Numero del votante: "+francisco.getNumeroVotante());
				
			
				
				
				
					
				
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		 
		
		
		
		
	}
	    
	   
		
		
		
	}


