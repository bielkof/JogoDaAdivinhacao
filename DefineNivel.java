import java.util.Scanner;

public class DefineNivel {

	private int totalDeTentativas = 0;

	Scanner recebe = new Scanner(System.in);

	public int defineNivel() {
		System.out.print("- Escolha um nivel de 1 a 3: ");

		int nivel = recebe.nextInt();

		if (nivel == 1) {
			totalDeTentativas = 20;
			System.out.println("- Você terá "+totalDeTentativas+" tentativas.");
			return totalDeTentativas;
		} else if (nivel == 2) {
			totalDeTentativas = 10;
			System.out.println("- Você terá "+totalDeTentativas+" tentativas.");
			return totalDeTentativas;
		} else {
			totalDeTentativas = 5;
			System.out.println("- Você terá "+totalDeTentativas+" tentativas.");
			return totalDeTentativas;
		}
	}

	public int getTotalDeTentativas() {
		return totalDeTentativas;
	}
}
