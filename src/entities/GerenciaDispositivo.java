package entities;


public class GerenciaDispositivo {
	
	private Dispositivo[] dispositivos;
	private int cont;
	
	public GerenciaDispositivo() {
		this.aumentaEspaco();
		dispositivos = new Dispositivo[10];
	}
	
	public void addDispositvo(Dispositivo dispositivo) {
		dispositivos[cont++] = dispositivo;
	}
	
	
	public String situacaoDosAparelhos() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < cont; i++) {
			String resultado = dispositivos[i].isEstado()? "Ligado" : "desligado";
			sb.append(dispositivos[i].getMarca())
			.append(dispositivos[i].getTipo())
			.append(":")
			.append(resultado)
			.append("\n");
		}
		return sb.toString();
	}
	
	private void aumentaEspaco() {
		if (this.cont == this.dispositivos.length) {
			Dispositivo[] novoArray = new Dispositivo[this.dispositivos.length * 2];
			for (int i = 0; i < this.dispositivos.length; i++) {
				novoArray[i] = this.dispositivos[i];
			}
			this.dispositivos = novoArray;
		}
		
	}
	
	
	

}
