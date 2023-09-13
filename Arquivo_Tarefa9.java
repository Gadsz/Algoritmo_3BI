import java.util.LinkedList;

class Arquivos_Tarefa9{
    public static void main(String[] args){
        int i;
        LinkedList<Integer> valores; //importa biblioteca LInkedList

        //<> colocamos o tipo da variavel entre esses simbolos
        //a class integer força que seja um obj na hora de inclcuir elementos

        valores = new LinkedList<Integer>();

        valores.add(10);
        valores.add(20);
        valores.add(30);
        valores.add(40);
        valores.add(50);
        valores.add(60);

        valores.set(1, valores.get(1)+5);

        

        for(i=0;i<valores.size();i++){
        System.err.println(valores.get(i));
        }
    }
}
//biblioteca linkedlist
//array list faz o ponteiro e aumenta e diminui  de foram dinamica
//charAta localiza o caractere na posição que repassamos
//get