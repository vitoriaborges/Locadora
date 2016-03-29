package main;

public class Veiculo {

	private String placa;
	private String modelo;
	private String marca;
	private int ano;
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	
	

	@Override
	public String toString() {
		return " placa=" + placa + ", modelo=" + modelo
				+ ", marca=" + marca + ", ano=" + ano + "";
	
	}
	
}
