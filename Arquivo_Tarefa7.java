import java.io.PrintWriter;

class Arquivo_Tarefa7 {
    public static void main (String[] args) {
    String texto
        
        try {
            PrintWriter saida;
            saida = new PrintWriter("texto.txt", texto++);
            saida.println("A");
            saida.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
