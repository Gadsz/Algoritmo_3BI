import java.io.PrintWriter;

class Arquivos_Tarefa{
    public static void main(String[] args) {
        int i;

        try{
            PrintWriter saida = new PrintWriter("numeros.txt");

            for(i=1; i<=10; i++){
                saida.println(i);
            }
            saida.close();
        }catch(Exception e){
            System.out.println("Erro no arquivo.");
        }

    }
}
