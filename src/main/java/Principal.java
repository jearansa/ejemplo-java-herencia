
import java.lang.reflect.Method;

public class Principal{

	public static void main (String [] args){

		Asal emplead1 = new Asal ("Manuel Cortina", 12345678, 1200);
 		EmplProd emplead2 = new EmplProd ("Juan Mota", 55333222, 1200, "noche");
 		EmplDistr emplead3 = new EmplDistr ("Antonio Camino", 55333666, 1200, "Granada");

		// Relaciona la declaraci�n de los objetos con la lista de m�todos
		// que podemos invocar sobre los mismos

		System.out.println ("El nombre del emplead1 es " + emplead1.getNombre ( ));
		System.out.println ("El sueldo del emplead1 es " + emplead1.getSalario ( ));
 		System.out.println ("El nombre del emplead2 es " + emplead2.getNombre ( ));
 		System.out.println ("El turno del emplead2 es " + emplead2.getTurno ( ));
		System.out.println ("El sueldo del emplead2 es " + emplead2.getSalario ( ));
 		System.out.println ("El nombre del emplead3 es " + emplead3.getNombre ( ));
		System.out.println ("La region del emplead3 es " + emplead3.getRegion ( ));
		System.out.println ("El sueldo del emplead3 es " + emplead3.getSalario ( ));

		Asal emplead4 = new EmplDistr ("Antonio Camino", 55333666, 1200, "Granada");
		// Observa el siguiente error, por la declaraci�n del objeto:
		//System.out.println ("La region del emplead4 es " + emplead4.getRegion());

		// Podemos evitar el mismo, como hicimos en C++, por medio de un downcast:
		System.out.println ("La region del emplead3 es " + ((EmplDistr)emplead4).getRegion());

		// A�n m�s, por medio de "instanceof" podemos comprobar si
		// emplead4 es una instancia de "EmplDistr",
		// antes de llamar a uno de sus m�todos:
		if (emplead4 instanceof EmplDistr){
			System.out.println ("La region del emplead4 es, con instanceof "
				+ ((EmplDistr) emplead4).getRegion ( ));
		}

		// Observa que instanceof devuelve "true" si el objeto
		// es instancia de una clase,
		// o de cualquiera de sus supertipos, y puede devolver true a distintas
		// preguntas:
		if (emplead4 instanceof Asal){
			System.out.println ("El nombre del emplead4 es, con instanceof "
				+ emplead4.getNombre ( ));
		}
		if (emplead4 instanceof Object){
			System.out.println ("El valor de toString de emplead4 es, con instanceof "
				+ emplead4.toString ( ));
		}
		
		// Java tambi�n tiene una caracter�stica conocida como "Reflection"
		// que permite obtener informaci�n sobre la clase a la que perrtenece un objeto;
		// Por ejemplo, podemos obtener el nombre de la misma
		System.out.println ("La clase de emplead4 "
				+ emplead4.getClass( ).getName( ));

		// Tambi�n podemos tener acceso a la lista de m�todos de esa clase, y tambi�n a sus nombres:
		for (Method i: emplead4.getClass( ).getMethods( )){
			System.out.println ("M�todos: " + i);
		}

		
 		Asal [ ] array_asal = new Asal [3];

 		for (int i = 0; i < 3; i++){
 			array_asal [i]= new Asal ("", 0, 0);
 		}
 		array_asal [0] = emplead1;
 		array_asal [1] = emplead2;
 		array_asal [2] = emplead3;

		System.out.println ("El nombre del emplead1 es " + emplead1.getNombre( ));
 		System.out.println ("El nombre del emplead2 es " + emplead2.getNombre( ));
 		
 		// Al ser declarado el vector como de objetos Asal,
 		// no podemos hacer uso de los m�todos espec�ficos de las clases
 		// derivadas (getTurno(): String, getRegio(): String...)
 		//System.out.println ("El turno del emplead2 es " + emplead2.getTurno( ));
 		System.out.println ("El nombre del emplead3 es " + emplead3.getNombre( ));
		//System.out.println ("La region del emplead3 es " + emplead3.getRegion( ));
	}
}
