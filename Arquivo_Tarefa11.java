import java.util.Stack;

class Arquivo_Tarefa11{
    public static void main(String[] args) {
        //testar os parenteses abertos e fechados para ver se a expressão é válida ou não, use
        String expressao = "()()";
        Stack <Character> pilha = new Stack<Character>();

        int i;
        char c;
        boolean erro;

        erro = false;
        for(i=0;i<expressao.length();i++){
            c = expressao.charAt(i);

            switch(c){
                case '(':
                    pilha.push(c);
                    break;
                case ')':
                    if(pilha.pop() != '(' ){
                        erro = true;
                    }
                    break;
            }

            if(erro){
                break;
            }
        }
        
        if(erro || !pilha.isEmpty()){
            System.out.println("Expressão inválida");
        }else{
            System.out.println("Expressão válida");
        }




    }
}