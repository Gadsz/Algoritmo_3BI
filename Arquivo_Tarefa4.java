import java.io.PrintWriter;

class Arquivo_Tarefa4 {
    public static void main (String[] args) {

        PrintWriter saida;
        try {
            saida = new PrintWriter("arq.txt");
            saida.println("AED TADS 2023");
            saida.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        

    }
}
