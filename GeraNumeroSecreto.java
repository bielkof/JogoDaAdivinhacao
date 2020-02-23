import java.util.Random;

public class GeraNumeroSecreto {

	int numeroSecreto;

	public int geraNumeroSecreto() {
		Random numeroRandom = new Random();
		numeroSecreto = numeroRandom.nextInt(100);
		System.out.println("numero secreto: " + numeroSecreto);
		return numeroSecreto;
	}

	public int getNumeroSecreto() {
		return numeroSecreto;
	}

}
