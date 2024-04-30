public class Fila{
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int tamanho;
    
    public static final int CAPACIDADE_MINIMA = 10;
    // declaração de constantes - nao pode ser modificado (variavel final nao pode ser modificada, metodo final nao pode ser sobrescrito e classe final nao pode ser herdada)
    // quando nao parametrizamos um valor, chamamos ele de "numero magico" pois surgiu do nada

    
    public Fila (int capacidade){
        if (capacidade > 10)
            dados = new int[capacidade];
        else 
            dados = new int[CAPACIDADE_MINIMA];
        ultimo = dados.length - 1;
        primeiro = 0;
        tamanho = 0;
    }

    public Fila(){
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

    public boolean enfileira(int i){
        if(estaCheia()) return false;
        ultimo = proxima(ultimo);
        dados[ultimo] = i;
        tamanho++;
        return true;
    }   
    public int desenfileira(){
        if (estaVazia()) return -1;
        int temp = dados[primeiro];
        primeiro = proxima(primeiro);
        tamanho--;
        return temp;
    }

    @Override
    public String toString(){
        if (estaVazia()) return "fila vazia";
        String s = ""; //string vazia é diferente de uma string nula
        int i = primeiro;
        do{
            s += dados[i] + " ";
            i = proxima(i);

        }while (i != proxima(ultimo));
        return s;
    }
    public String stringDoVetor(){
        if (estaVazia()){
            return ("_ _ _ _ _ _ _ _ _ _");
        }
        String s = "";
        int i;
        if (primeiro <= ultimo){
            for (i = 0; i< primeiro; i++)
                s += "_ ";
            for (i = primeiro; i<= ultimo; i++)
                s += dados[i] + " ";
            for (i=ultimo+1; i<dados.length; i++)
                s += "_ ";
        }
        else{
            for(i=0; i<ultimo; i++)
                s += dados[i] + " ";
            for(i=ultimo+1; i<primeiro;i++)
                s += "_ ";
            for (i= primeiro; i<dados.length;i++)
                s += dados[i] + " ";
        }
        return s;
    }
}