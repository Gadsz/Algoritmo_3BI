import java.util.Stack;

class Arquivo_Tarefa10{
    public static void main(String[] args) {
        int x;
        Stack <Integer> pilha = new Stack<Integer>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        

        while(! pilha.isEmpty()){
            x = pilha.pop();
            System.out.println(x);
        }

    }
}