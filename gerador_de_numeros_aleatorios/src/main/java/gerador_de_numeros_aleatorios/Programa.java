package gerador_de_numeros_aleatorios;

public class Programa {

    public static void main(String[] args) {
        int n = 1000;

        GeradorNumerosAleatorios.gerarArquivoNumerosAleatorios(n);
        int[] histograma = CalculadorHistograma.calcularHistograma();

        for (int i = 0; i < histograma.length; i++) {
            System.out.println(i + ": " + histograma[i]);
        }
    }
}
