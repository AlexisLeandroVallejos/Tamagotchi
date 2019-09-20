package modeloEstado;

public class Contenta implements Estado {
	
	private static final int FELICIDAD_POR_COMER = 1;
	private static final int FELICIDAD_POR_JUGAR = 2;
	private static final int DESGASTE_PARA_HAMBRIENTA = 5;

	@Override
	public void comer(Tamagotchi tamagotchi) {
		tamagotchi.incrementarNivelDeFelicidad(FELICIDAD_POR_COMER);
	}

	@Override
	public void jugar(Tamagotchi tamagotchi) {
		tamagotchi.incrementarNivelDeFelicidad(FELICIDAD_POR_JUGAR);
		tamagotchi.incrementarDesgaste();
		if(tamagotchi.getDesgastePorJugar() > DESGASTE_PARA_HAMBRIENTA) {
			tamagotchi.setEstado(new Hambrienta());
		}
	}

}
