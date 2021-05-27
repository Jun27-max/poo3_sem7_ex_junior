package entities;

public class TV extends Dispositivo implements SituacaoDispositivo {

	public TV(String marca) {
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
		return "Televisão";
	}

}
