package main;

public class Veiculo {

	private String placa;
	private String modelo;
	private String marca;
	private int ano;
	private long quilometragem;
	
	
	
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
	public long getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(long quilometragem) {
		this.quilometragem = quilometragem;
	}
	

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", modelo=" + modelo
				+ ", marca=" + marca + ", ano=" + ano + ", quilometragem=" + quilometragem +"]";
	
	}
	
}
