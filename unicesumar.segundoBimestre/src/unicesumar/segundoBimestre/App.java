package unicesumar.segundoBimestre;

public class App {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Brasil", "Parana", "Maringa", "Av.Cuiaba");
		Cliente cliente1 = new Cliente("Eliel", "0546254987", endereco1);
		endereco1.addCliente(cliente1);
		Carro hb20 = new Carro("Hyundai", "Sedan", "AHX2648", 250);
		Carro astra = new Carro("volks", "hatch", "ANX2564", 150);
		Seguro seguro1 = new Seguro("12", cliente1);
		seguro1.addnovoscarros(hb20);
		seguro1.addnovoscarros(astra);
		
		mostrarTudo(seguro1);

	}

	public static void mostrarTudo(Seguro s) {
        System.out.println(" SEGURO: " +s.getCliente().getNome()+ "\n");
        System.out.println("Tempo contrato: " +s.getTemposeguro()+"meses");
        System.out.println("Valor total Mensal: " +s.getPrecototal());

        System.out.println("\n CLIENTE DADOS");
        System.out.println(" Nome: " +s.getCliente().getNome());
        System.out.println(" CPF: " +s.getCliente().getCpf());
        for (int j = 0; j < s.getCliente().getEndereco().size(); j++) {
        	 System.out.println(" Endereco Estado:" +s.getCliente().getEndereco().get(j).getEstado());
        	 System.out.println(" Endereco Cidade:" +s.getCliente().getEndereco().get(j).getCidade());
        	 System.out.println(" Endereco Rua:" +s.getCliente().getEndereco().get(j).getRua());
            }
        
        
        System.out.println("\nCARROS DADOS" + "\n");
        for (int i = 0; i <s.getCarro().size() ; i++) {
            System.out.println("Marca: " + s.getCarro().get(i).getMarca());
            System.out.println("Modelo: " + s.getCarro().get(i).getModelo());
            System.out.println("Placa: " + s.getCarro().get(i).getPlaca());
            System.out.println("Preço Mensal: " +s.getCarro().get(i).getCotacao()+ "\n");
        }
        System.out.println("=============================================================\n\n");
    }
}