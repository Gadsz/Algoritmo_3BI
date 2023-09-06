import java.io.PrintWriter;

class Arquivos{
    public static void main(String[] args) {
        // String mensagem = "Guia do mochileiro das galáxias";
        int resposta = 42;

        try{
            PrintWriter saida = new PrintWriter("saída.txt");
            saida.printf("A resposta para a vida, universo e tudo mais é %d\n", resposta);
            saida.close();
        }catch(Exception e){
            System.out.println("Erro no arquivo.");
        }

    }
}
