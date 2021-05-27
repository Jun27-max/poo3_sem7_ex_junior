package entities;

public class Smartphone extends Dispositivo implements SituacaoDispositivo {

	public Smartphone(String marca) {
		super(marca);

	}

	@Override
	public boolean ligar() {
		if (!isEstado()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean desligar() {
		if (!isEstado()) {
			return true;
		}
		return false;
	}

	@Override
	public String getTipo() {
		return "Smartphone";
	}

}
