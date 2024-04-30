import java.util.Random;
public class TesteFila{
    public static void main(String[] args) {
        Random r = new Random();
        Fila f = new Fila();
        do {
            if(r.nextBoolean()){
                if(!f.estaCheia())
                    f.enfileira(r.nextInt(10));
            }
            else{
                if(!f.estaVazia()){
                    System.out.println(f.desenfileira() + " saiu");
                }
            }
            System.out.println(f);
            System.out.println(f.stringDoVetor());
        }while(!f.estaVazia());
    }
}