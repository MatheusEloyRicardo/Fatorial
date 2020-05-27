import java.util.Scanner;

public class FatorialMain {

	public static void main(String[] args) {
		System.out.print("Informe um n�mero: ");
		try (Scanner in = new Scanner(System.in)) {
			Fatorial fatorial = new Fatorial();
			fatorial.setNumero(in.nextInt());

			System.out.printf("Resultado � %s", CalculoFatorial.CalculaFatorial(fatorial));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
