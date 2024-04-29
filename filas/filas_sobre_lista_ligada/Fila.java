public class Fila <E> { //a fila vai ser de um elmento qualquer
    private No<E> primeiro;
    private No<E> ultimo;

    //construtor padrão
    public boolean estaVazia(){
        return primeiro == null;
    }

    public void enfileira (E i) {
        No<E> novo = new No<E>(i);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo; 
    }

    public E desenfileira (){
        if(estaVazia()) return null;
        E temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) //esvaziou a fila
            ultimo = null;
        return temp;
    }

    @Override
    public String toString(){
        if (estaVazia())
            return "fila vazia";
        String s = "";
        No<E> aux = primeiro;
        while (aux != ultimo) {
            s += aux.getInfo() + " - ";
            aux = aux.getProximo();
        } 
        s += aux.getInfo();
        return s;
    }
}

class No <E>{ //<E> = objeto genérico qualquer
    private E info;
    private No<E> proximo;

    public No(E info) {
        this.info = info;
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public No<E> getProximo() {
        return proximo;
    }

    public void setProximo(No<E> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString () {
        return info + "";
    }
}
//as filas sempre removem um elemento do inicio e inserem no final.
//arquivos em java podem ter quantas classes você precisar, mas só uma pode ser publica.
//nas filas, não temos operações de arrasto, pois envolve laços - o custo seria caro (pois depende do tamanho do vetor) e queremos um custo fixo:
//por isso existe o vetor circular para filas - toda vez que inserimos, altera o ultimo e toda vez que removemos altera o primeiro.
//na remoção, o elemento só é apagado de fato quando é sobreposto, se não for sobreposto, a remoção é lógica.
//no caso de não houver mais elementos de ultimo, e sobra apenas o do indice 0(que estava com o ponteiro de primeiro), fazemos operações de resto - a soma do indice + 1 e tirando o resto do tamanho do vetor