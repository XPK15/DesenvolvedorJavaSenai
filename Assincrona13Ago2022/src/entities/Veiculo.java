package entities;

public class Veiculo {
	private String motor;
	private int quantidadePassageiros;
	private int quantidadePneus;
	private String tipoCombustivel;
	
	public Veiculo(String motor, int quantidadePassageiros, int quantidadePneus, String tipoCombustivel) {
		this.motor = motor;
		this.quantidadePassageiros = quantidadePassageiros;
		this.quantidadePneus = quantidadePneus;
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getMotor() {
		return this.motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getQuantidadePassageiros() {
		return this.quantidadePassageiros;
	}

	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}

	public int getQuantidadePneus() {
		return this.quantidadePneus;
	}

	public void setQuantidadePneus(int quantidadePneus) {
		this.quantidadePneus = quantidadePneus;
	}

	public String getTipoCombustivel() {
		return this.tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
}
