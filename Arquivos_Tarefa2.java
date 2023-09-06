import java.io.PrintWriter;

class Arquivos_Tarefa2{
    public static void main(String[] args) {
        int i;

        try{
            PrintWriter saida_pares = new PrintWriter("pares.txt");
            PrintWriter saida_impares = new PrintWriter("ímpares.txt");

            for(i=1; i<=1000; i++){
                if (i % 2 == 0) {
                    saida_pares.println(i);
                }else
                // if (i % 2 == 1) {
                    saida_impares.println(i);
                // }
            }

            saida_pares.close();
            saida_impares.close();

        }catch(Exception e){
            System.out.println("Erro no arquivo.");
        }






    }
}
