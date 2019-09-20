package modeloEstado;

public class Tamagotchi {
	
	private static final int COMER_MALHUMORADO = 10;
	
	private int gradoDeFelicidad;
	private Estado estado;
	private int tiempoDeMalhumor;
	private int desgastePorJugar;
	
	public void comer() {
		estado.comer(this);
	}
	
	public void jugar() {
		estado.jugar(this);
	}
	
	public boolean puedoJugar() {
		return false;
	}

	public int getGradoDeFelicidad() {
		return gradoDeFelicidad;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void incrementarNivelDeFelicidad(int cantidad) {
		gradoDeFelicidad += cantidad;
	}

	public int getTiempoDeMalhumor() {
		return tiempoDeMalhumor;
	}

	public void setTiempoDeMalhumor(int tiempoDeMalhumor) {
		this.tiempoDeMalhumor = tiempoDeMalhumor;
	}

	public void comerMalhumorado() {
		tiempoDeMalhumor += COMER_MALHUMORADO;
	}
	
	public int getDesgastePorJugar() {
		return desgastePorJugar;
	}

	public void setDesgastePorJugar(int desgastePorJugar) {
		this.desgastePorJugar = desgastePorJugar;
	}

	public void incrementarDesgaste() {
		desgastePorJugar++;
	}

	

	
	

}
