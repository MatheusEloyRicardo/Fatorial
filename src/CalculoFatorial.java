public class CalculoFatorial {

	/**
	 * Metodo usando recursividade para calcular fatorial
	 * @param Fatorial fatorial
	 * @return calculo
	 */
	public static long CalculaFatorial(Fatorial fatorial) {
		int num = fatorial.getNumero();
		int anterior = num-1;
		long resultado = 0;

		if (num <= 1) {
			return 1;

		} else {
			fatorial.setNumero(anterior);
			resultado =  num * CalculaFatorial(fatorial);
		}

		return resultado;
	}
}
