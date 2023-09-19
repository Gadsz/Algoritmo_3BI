import java.io.File;
import java.util.Scanner;

class Arquivo_Tarefa6 {
    public static void main (String[] args) {
        int i;

        File arquivo;
        Scanner entrada;
        try {
                arquivo = new File("arq.txt");
                entrada = new Scanner(arquivo);

                while(entrada.hasNext()){
                    i = entrada.nextInt();
                    System.out.println(i);
                }

                entrada.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}