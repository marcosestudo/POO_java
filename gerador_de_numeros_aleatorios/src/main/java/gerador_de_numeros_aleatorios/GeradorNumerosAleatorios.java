package gerador_de_numeros_aleatorios;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeradorNumerosAleatorios {

    public static void gerarArquivoNumerosAleatorios(int n) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("numeros_aleatorios.txt"));
            Random rand = new Random();

            for (int i = 0; i < n; i++) {
                int numero = rand.nextInt(100);
                writer.write(String.valueOf(numero));
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
