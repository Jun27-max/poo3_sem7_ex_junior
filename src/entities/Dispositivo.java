package entities;

public abstract class Dispositivo {

	private boolean estado;

	private String marca;

	public Dispositivo(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public abstract String getTipo();

	public boolean isEstado() {
		return estado;
	}

}
