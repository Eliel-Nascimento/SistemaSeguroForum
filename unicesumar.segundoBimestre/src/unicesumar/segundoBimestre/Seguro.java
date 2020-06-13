package unicesumar.segundoBimestre;

import java.util.ArrayList;
import java.util.List;

public class Seguro {
	private double precototal =0;
	private String temposeguro;
	private Cliente cliente;
	private List<Carro> carro = new ArrayList<>();

	public Seguro( String temposeguro, Cliente cliente) {
		this.temposeguro = temposeguro;
		this.cliente = cliente;

	}

	public double getPrecototal() {
		return precototal;
	}

	public String getTemposeguro() {
		return temposeguro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Carro> getCarro() {
		return carro;
	}

	public void addnovoscarros(Carro c) {
		carro.add(c);
		this.precototal += c.getCotacao();
	}

}
