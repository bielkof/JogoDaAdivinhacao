import java.util.Scanner;

public class GeraRodada {

	private int rodada;

	DefineNivel nivel = new DefineNivel();
	GeraNumeroSecreto numeroSecreto = new GeraNumeroSecreto();
	GeraChute chute = new GeraChute();

	Scanner recebe = new Scanner(System.in);

	public void geraRodada() {

		numeroSecreto.geraNumeroSecreto();
		nivel.defineNivel();

		for (rodada = 1; rodada <= nivel.getTotalDeTentativas(); rodada++) {
			System.out.println("rodada: " + rodada + " de: " + nivel.getTotalDeTentativas());
			chute.geraChute();

			boolean acertou = chute.getChute() == numeroSecreto.getNumeroSecreto();
			boolean maior = chute.getChute() > numeroSecreto.getNumeroSecreto();

			if (acertou) {
				System.out.println("*** Parab�ns Voc� Acertou ***");
				break;
			} else if (maior) {
				System.out.println("- Seu chute � maior");
			} else {
				System.out.println("- seu chute � menor");
			}

		}
		
		System.out.println("O N�mero secreto era "+numeroSecreto.getNumeroSecreto());
		System.out.println("Fim de Jogo!");
	}

	public int getRodada() {
		return rodada;
	}

}
