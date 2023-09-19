import java.io.PrintWriter;

class Arquivo_Tarefa7 {
    public static void main (String[] args) {
        
        try {
            PrintWriter saida;
            saida = new PrintWriter("texto.txt");
            saida.println("A");
            saida.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
