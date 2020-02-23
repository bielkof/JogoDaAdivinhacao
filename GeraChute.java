import java.util.Scanner;

public class GeraChute {
	private int chute;

	Scanner recebe = new Scanner(System.in);

	public int geraChute() {
		System.out.print("- Digite um número entre 1 e 100: ");

		chute = recebe.nextInt();

		System.out.println("- Seu chute é: " + chute);

		if (chute < 1 || chute > 100) {
			System.out.println("Apenas números entre 1 e 100!");
		}
		return chute;
	}

	public int getChute() {
		return chute;
	}
}
