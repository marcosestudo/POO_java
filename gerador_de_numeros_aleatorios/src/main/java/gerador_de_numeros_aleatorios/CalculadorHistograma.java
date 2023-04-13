package gerador_de_numeros_aleatorios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalculadorHistograma {

    public static int[] calcularHistograma() {
        int[] histograma = new int[100];

        try {
            BufferedReader reader = new BufferedReader(new FileReader("numeros_aleatorios.txt"));

            String linha;
            while ((linha = reader.readLine()) != null) {
                int numero = Integer.parseInt(linha);
                histograma[numero]++;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return histograma;
    }
}
