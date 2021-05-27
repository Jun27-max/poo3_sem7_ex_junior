package entities;

public class Notebook extends Dispositivo implements SituacaoDispositivo {
	
	public Notebook(String marca) {
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
