
// La orden "extends" nos permite definir 
// herencia de una clase ya definida

// Pregunta: y si no ponemos "extends",
// ¿de qué clase estamos heredando por defecto en Java?

public class EmplDistr extends Asal{

	private String region;

	// Observa el constructor; la primera línea del mismo
	// siempre debe contener una invocación al constructor
	// de la clase Base
	
	// La sintaxis es por medio de "super (lista_de_parámetros)"
	// Si en la clase Base hubiese un constructor sin parámetros,
	// Java directamente (y de forma transparente al programador)
	// invocaría a "super ();", salvo que nosotros invoquemos a otro constructor
	public EmplDistr (String n, long dni, double sb, String r){
		super (n, dni, sb);
		this.region = r;
	}

	public String getRegion (){
		return this.region;
	}

	public void setRegion (String nueva_region){
		this.region = nueva_region;
	}

	// Para invocar a un método de la clase Base
	// que se esté redefiniendo en la clase Derivada, debemos usar la
	// sintaxis especial "super.metodo (lista_de_parámetros);"
	// Si no incluimos "super._" estaríamos invocando al propio
	// método, y provocaríamos un bucle infinito

	public double getSalario (){
		return super.getSalario () * (1 + 0.10);
	}
}
