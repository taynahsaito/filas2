public class FilaGenerica <T>{
    private int primeiro;
    private int ultimo;
    private T[] dados;
    private int tamanho;
    
    public static final int CAPACIDADE_MINIMA = 10;
    // declaração de constantes - nao pode ser modificado (variavel final nao pode ser modificada, metodo final nao pode ser sobrescrito e classe final nao pode ser herdada)
    // quando nao parametrizamos um valor, chamamos ele de "numero magico" pois surgiu do nada

    //nao podemos criar um vetor de tipo generico - o compilador não sabe qual o tipo do objeto que ele vai armazenar
    public FilaGenerica(int capacidade){
        if (capacidade > 10)
            dados = (T[]) new Object[capacidade];
        else 
            dados = (T[]) new Object[CAPACIDADE_MINIMA];
        ultimo = dados.length - 1;
        primeiro = 0;
        tamanho = 0;
    }

    public FilaGenerica(){
        this(CAPACIDADE_MINIMA); //reaproveita o codigo, chamamos um construtor dentro de outro usando o 'this' - nesse caso o construtor fila
    }

    public boolean estaVazia(){
        return tamanho == 0 ;
    }

    public boolean estaCheia(){
        return tamanho == dados.length;
    }
    int proxima(int pos){
        return (pos + 1) % dados.length;
    }

    public boolean enfileira(T info){
        if (estaCheia()) return false;
        ultimo = proxima (ultimo);
        dados[ultimo] = info;
        tamanho++;
        return true;
    }   
    public T desenfileira(){
        T info = null;
        if (!estaVazia()) {
            info = dados[primeiro];
            primeiro = proxima(primeiro);
            tamanho--;
        }
        return info;    
    }

    @Override
    public String toString(){
        if (estaVazia()) return "fila vazia";
        String s = ""; //string vazia é diferente de uma string nula
        int i = primeiro;
        do{
            s += dados[i] + "\n";
            i = proxima(i);

        }while (i != proxima(ultimo));
        return s;
    }
}

