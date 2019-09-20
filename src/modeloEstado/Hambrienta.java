package modeloEstado;

public class Hambrienta extends Estado {
	
	public void comer(Tamagotchi tamagotchi) {
		tamagotchi.setEstado(new Contenta());
	}

	@Override
	public void jugar(Tamagotchi tamagotchi) {
		tamagotchi.setEstado(new Malhumor());
	}

}
