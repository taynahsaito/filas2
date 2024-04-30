public class Garagem{
    public static void main(String[] args) {
        FilaGenerica<Carro> f = new FilaGenerica<>();
        int i=2010;
        while (!f.estaCheia()) {
            f.enfileira(new Carro(i+1000, "ABC" + i++));
            System.out.println(f);
        }
        while (!f.estaVazia()) {
            System.out.println(f.desenfileira() + " saiu");
            System.out.println(f);
        }
    }
}