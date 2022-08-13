package entities;

public class Moto extends Veiculo {
	private String tipo;
	
	public Moto(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
