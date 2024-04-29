public class Rua {
    public static void main(String[] args) {
        Fila<Carro> rua = new Fila<>();
        System.out.println(rua);

        Carro c1 = new Carro(2010, "ABC1234");
        rua.enfileira(c1);
        System.out.println(rua);

        Carro c2 = new Carro(2024, "TAY34856");
        rua.enfileira(c2);
        System.out.println(rua);

        c1 = new Carro(2020, "EUU0000");
        rua.enfileira(c1);
        rua.enfileira(new Carro(2022,"LLL0231"));

        System.out.println(rua);

        System.out.println(rua.desenfileira() + " saiu da rua");
        System.out.println(rua);
    }
}
