import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Arquivo_Tarefa8 {

    public static void main(String[] args) throws IOException {
        // Cria um map para armazenar a contagem de cada letra
        Map<Character, Integer> contagem = new HashMap<>();

        // Abre o arquivo
        FileReader reader = new FileReader("texto.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        // Lê o arquivo linha a linha
        String linha;
        while ((linha = bufferedReader.readLine()) != null) {
            for (char letra : linha.toLowerCase().toCharArray()) {
                // Incrementa a contagem da letra
                contagem.put(letra, contagem.getOrDefault(letra, 0) + 1);
            }
        }

        // Imprime a contagem de cada letra
        for (Map.Entry<Character, Integer> entrada : contagem.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        // Fecha o arquivo
        reader.close();
    }
}