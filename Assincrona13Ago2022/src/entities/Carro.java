package entities;

public class Carro extends Veiculo {
	private String tipo;
	
	public Carro(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}