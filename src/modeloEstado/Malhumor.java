package modeloEstado;

public class Malhumor implements Estado {
	
	private static final int MAXIMO_TIEMPO_DE_MALHUMOR = 80;

	@Override
	public void comer(Tamagotchi tamagotchi) {
		if(tamagotchi.getTiempoDeMalhumor() > MAXIMO_TIEMPO_DE_MALHUMOR) {
			tamagotchi.setEstado(new Contenta());
		}
		tamagotchi.comerMalhumorado();
	}

	@Override
	public void jugar(Tamagotchi tamagotchi) {
		tamagotchi.setEstado(new Contenta());
	}

}
