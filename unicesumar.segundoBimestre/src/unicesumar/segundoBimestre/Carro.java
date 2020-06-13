package unicesumar.segundoBimestre;

public class Carro {
	private String marca;
	private String modelo;
	private String placa;
	private double cotacao =0;
	private String seguro;
	public Carro(String marca, String modelo, String placa, double cotacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cotacao = cotacao;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public double getCotacao() {
		return cotacao;
	}
	public String getSeguro() {
		return seguro;
	}
	
	

}
