package modeloEstado;

public class Tamagotchi {
	
	private static final int COMER_MALHUMORADO = 10;
	
	private int gradoDeFelicidad = 0;
	private Estado estado;
	private int tiempoDeDesgastePorMalhumor;
	private int desgastePorJugar = 0;
	
	public Tamagotchi() {
		this.estado = new Contenta();
	}
	
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

	public int getTiempoDeDesgastePorMalhumor() {
		return tiempoDeDesgastePorMalhumor;
	}

	public void setTiempoDeDesgastePorMalhumor(int tiempoDeMalhumor) {
		this.tiempoDeDesgastePorMalhumor = tiempoDeMalhumor;
	}

	public void comerMalhumorado() {
		tiempoDeDesgastePorMalhumor += COMER_MALHUMORADO;
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
	
	public boolean estoyHambrienta() {
		return this.getDesgastePorJugar() > 5;
	}
	
	public boolean estoyMalhumorada() {
		return this.getDesgastePorJugar() > 6;
	}
	
	public boolean estoyContenta() {
		return !estoyHambrienta() || !estoyMalhumorada();
	}
	
	

	

	
	

}
