package ejercicio2;

public class Autos extends Vehículo {

	private String matricula;
	private int precio;
	
	public Autos(String tipo, String marca, String modelo, String matricula, int precio) {
		super(tipo, marca, modelo);
		this.matricula = matricula;
		this.precio = precio;
		
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	
}
