
public class Asal{

	private	String nombre;
	private long dni;
	private double salarioBase;

	public Asal(String n, long dni, double sb){
   		this.nombre = n;
   		this.dni = dni;
   		this.salarioBase = sb;
	}

	public String getNombre (){
     		return this.nombre;
	}

	public void setNombre (String nn){
     		this.nombre = nn;
	}

	public long getDni (){
     		return this.dni;
	}

	public void setDni (long nd){
     		this.dni = nd;
	}

	public double getSalario (){
		return this.salarioBase;
	}

	// Atención: el método toString pertenece a la clase "Object",
	// aquí lo estamos redefiniendo para objetos de tipo "Asal"
	public String toString (){
		String aux = new String();
		aux = aux + "El nombre es " + this.getNombre() + "\n";
		aux = aux + "El DNI es " + this.getDni() + "\n";
		aux = aux + "El salario es " + this.getSalario() + "\n";
		return aux;
	}
}