package modeloEstadoTest;

import org.junit.Assert;
import org.junit.Test;

import modeloEstado.Tamagotchi;

public class PruebaEstadoTest {

	@Test
	public void comer_tamagotchiSeCreaConEstadoContentoComeYSeLeAumentaElGradoDeFelicidad() {
		Tamagotchi tamagotchi = new Tamagotchi();
		tamagotchi.comer();
		Assert.assertEquals("No se le aumenta el grado de felicidad", tamagotchi.getGradoDeFelicidad(), 1);
	}

	@Test
	public void jugar_tamagotchiSeCreaConEstadoContentoJuegaYSeLeAumentaElGradoDeFelicidad() {
		Tamagotchi tamagotchi = new Tamagotchi();
		tamagotchi.jugar();
		Assert.assertEquals("No se le aumenta el grado de felicidad", tamagotchi.getGradoDeFelicidad(), 2);
	}

	@Test
	public void jugar_tamagotchiSeCreaConEstadoContentoJuegaYSeLeAumentaElDesgastePorJugar() {
		Tamagotchi tamagotchi = new Tamagotchi();
		tamagotchi.jugar();
		Assert.assertEquals("No se le aumenta el desgaste por jugar", tamagotchi.getDesgastePorJugar(), 1);
	}

	@Test
	public void jugar_tamagotchiSeCreaConEstadoContentoJuegaMasDe5VecesYSeCambiaSuEstadoAHambrienta() {
		Tamagotchi tamagotchi = new Tamagotchi();
		int cont = 0;

		while (cont < 6) {
			tamagotchi.jugar();
			cont++;
		}
		Assert.assertTrue("No cambio de estado a Hambrienta", tamagotchi.estoyHambrienta());
	}

	@Test
	public void comer_tamagotchiHambrientoComeYSeVuelveContento() {
		Tamagotchi tamagotchi = new Tamagotchi();

		int cont = 0;
		while (cont < 6) {
			tamagotchi.jugar();
			cont++;
		}

		tamagotchi.comer();
		Assert.assertTrue("No se vuelve contento", tamagotchi.estoyContenta());
	}

	@Test
	public void jugar_tamagotchiHambrientoJuegaYSeVuelveMalhumorado() {
		Tamagotchi tamagotchi = new Tamagotchi();

		int cont = 0;
		while (cont < 6) {
			tamagotchi.jugar();
			cont++;
		}

		tamagotchi.jugar();
		Assert.assertTrue("No se vuelve malhumorado", tamagotchi.estoyMalhumorada());
	}

	@Test
	public void comer_tamagotchiMalhumoradoComeYSuTiempoDeDesgastePorMalhumorAumentaEn10() {
		Tamagotchi tamagotchi = new Tamagotchi();

		int cont = 0;
		while (cont < 7) {
			tamagotchi.jugar();
			cont++;
		}
		tamagotchi.comer();
		Assert.assertEquals("No se aumenta su tiempo de desgaste por malhumor",
				tamagotchi.getTiempoDeDesgastePorMalhumor(), 10);
	}

	@Test
	public void comer_tamagotchiMalhumoradoComePorNovenaVezYSeVuelveContento() {
		Tamagotchi tamagotchi = new Tamagotchi();

		int cont = 0;
		while (cont < 7) {
			tamagotchi.jugar();
			cont++;
		}
		cont = 0;
		while (cont < 8) {
			tamagotchi.comer();
			cont++;
		}
		tamagotchi.comer();
		Assert.assertTrue("No se vuelve contento", tamagotchi.estoyContenta());
	}

	@Test
	public void jugar_tamagotchiMalhumoradoJuegaYSeVuelveContento() {
		Tamagotchi tamagotchi = new Tamagotchi();

		int cont = 0;
		while (cont < 7) {
			tamagotchi.jugar();
			cont++;
		}
		tamagotchi.jugar();
		Assert.assertTrue("No se vuelve contento", tamagotchi.estoyContenta());
	}

}
