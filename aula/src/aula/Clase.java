package aula;


	import java.util.Arrays;
	import java.util.Scanner;

	public class Clase {

		private String alumnos[];
		private String alumnosNuevos[];
		private Scanner teclado;
		private int capacidadAula;
		private int llenarAula;
		
		
		//cree el constructor clase parametrizado solamente con el valor de su capacidad 
		public Clase(int capacidadAula) {
			
			this.capacidadAula= capacidadAula;
			
			
			
			
		}
		
		
		/*cree la operacion rellenar alumnos, basicamente la operacion esta definida por un valor del tipo String
		para asi poder almacenar los nombres de los alumnos en el array, a su vez como el valor del bucle va ligado
		al del teclado cada vez que se de un enter queda guardado en el array el valor
		
		*/
		public void rellenarAlumnos() {
			
			teclado= new Scanner(System.in);
			alumnos= new String [4];
			for(int i=0;i<alumnos.length;i++) {
				 System.out.print("Ingrese el nombre del alumno con código "+i+"");
				 alumnos[i]=teclado.next();
				
			}
			
		}
		
		
		/*se me ocurrio hacer un switch para llenar el aula si utilizas un 1 en el start te hara la operacion 
		  para la cual lo que implemente fue un nuevo array con una lista de valores de los estudiantes nuevos
		  a los que basicamente iguale como capacidad maxima la propia capacidad del aula ya que es una operacion
		  cuyo unico significado es llenar la aula y para el bucle simplemente iguale el valor de i al tamaño del array
		  del primer array de los alumnos asi simplemente empezara desde donde termino el otro array, al imposibilitarme 
		  el realizar la operacion con un solo array ya que una vez creado no se le puede modificar el tamaño maximo 
		  opte por simplemente crear otro,
		
		*/
		public void llenarAula(int llenarAula) {
			
			
			
			
			switch(llenarAula) {
			
			
			
			case 1:
				alumnosNuevos= new String [capacidadAula];
				
				if (alumnos.length<capacidadAula) {
					
					for(int i=alumnos.length;i<capacidadAula;i++ ) {
						System.out.print("Ingrese el nombre del alumno con código "+i+"");
						alumnosNuevos[i]=teclado.next();
						
					}
					
				}
				
				
				else {
					System.out.println("no hay capacidad para mas alumnos");
				}
				System.out.println("la clase esta llena");
				break;
				
			case 2:
				
			  System.out.println("existen "+(capacidadAula-alumnos.length)+" plazas libres si quiere "
			  		+ "rellenarlas porfavor cambie el valor a 1" );
			  
			  break;
				
			
			
			
			}
			
			
		}


		@Override
		public String toString() {
			return "Clase [alumnos=" + Arrays.toString(alumnos) + ", alumnosNuevos=" + Arrays.toString(alumnosNuevos)
					+ ", capacidadAula=" + capacidadAula + "]";
		}
		
		
		


		
		
		
	}
	
	
	
	
	

