package main;

public class Locacao {
	
	private Veiculo veiculo;
	private Cliente cliente;
	
	private String dataL;
	private String horaL;
	private String dataD;
	private String horaD;
	
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getDataL() {
		return dataL;
	}
	public void setDataL(String dataL) {
		this.dataL = dataL;
	}
	public String getHoraL(){
			return horaL;
	}
	public void setHoraL(String horaL){
			this.horaL = horaL;
	}
	public String getDataD() {
		return dataD;
	}
	public void setDataD(String dataD) {
		this.dataD = dataD;
	}
	public String getHoraD(){
			return horaD;
	}
	public void setHoraD(String horaD){
			this.horaD = horaD;
	}
	
	public void mostraLocacao(){
		System.out.println("**** Dados da locacao ****" );
		System.out.println("Veiculo: " + this.veiculo);
		System.out.println("Dados do Cliente: " + this.cliente);
		System.out.println("Data da Locacao: " + this.dataL);
		System.out.println("Hora da Locacao: " + this.horaL);
		System.out.println("Data da Devolucao: " + this.dataD);
		System.out.println("Hora da Devolucao: " + this.horaD);
		System.out.println("***********************************" );
	}

	
}
