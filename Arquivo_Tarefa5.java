import java.io.PrintWriter;

class Arquivo_Tarefa5 {
    public static void main (String[] args) {
        int n = 10;
        int i, j;
        PrintWriter saida;
        try {
            for(i=1; i<=n; i++){
                saida = new PrintWriter("arq"+i+".txt");
                for(j=1; j<=i; j++){
                    saida.println(j);
                }
                saida.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}