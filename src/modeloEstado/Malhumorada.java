package modeloEstado;

public class Malhumorada implements Estado {
	
	private static final int MAXIMO_TIEMPO_DE_MALHUMOR = 80;
	private static final int REINICIO_DE_DESGASTE_POR_MALHUMOR = 0;
	private static final int REINICIO_DE_DESGASTE_POR_JUGAR = 0;

	@Override
	public void comer(Tamagotchi tamagotchi) {
		tamagotchi.comerMalhumorado();
		if(tamagotchi.getTiempoDeDesgastePorMalhumor() > MAXIMO_TIEMPO_DE_MALHUMOR) {
			tamagotchi.setEstado(new Contenta());
			tamagotchi.setTiempoDeDesgastePorMalhumor(REINICIO_DE_DESGASTE_POR_MALHUMOR);
			tamagotchi.setDesgastePorJugar(REINICIO_DE_DESGASTE_POR_JUGAR);
		}
		
	}

	@Override
	public void jugar(Tamagotchi tamagotchi) {
		tamagotchi.setEstado(new Contenta());
		tamagotchi.setDesgastePorJugar(REINICIO_DE_DESGASTE_POR_JUGAR);
	}

}
