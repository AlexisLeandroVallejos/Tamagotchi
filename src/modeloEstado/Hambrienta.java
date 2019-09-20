package modeloEstado;

public class Hambrienta implements Estado {
	
	private static final int REINICIO_DE_DESGASTE_POR_JUGAR = 0;

	public void comer(Tamagotchi tamagotchi) {
		tamagotchi.setEstado(new Contenta());
		tamagotchi.setDesgastePorJugar(REINICIO_DE_DESGASTE_POR_JUGAR);
	}

	@Override
	public void jugar(Tamagotchi tamagotchi) {
		tamagotchi.setEstado(new Malhumorada());
		tamagotchi.incrementarDesgaste();
	}

}
