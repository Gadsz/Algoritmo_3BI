package ARQUIVOS;

import java.io.PrintWriter;

class Arquivos_Tarefa3{
    public static void main(String[] args) {
        int i;
        String nome = "tads";
        String nome_arquivo;

        nome_arquivo = String.format("arquivo_%s.jpg", nome);

        try{
            PrintWriter saida = new PrintWriter(nome_arquivo);


            for(i=1; i<=1000; i++){
                saida.println(i);
            }
            
            saida.close();

        }catch(Exception e){
            System.out.println("Erro no arquivo.");
        }






    }
}
