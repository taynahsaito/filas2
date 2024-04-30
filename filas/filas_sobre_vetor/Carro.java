public class Carro {
    private int anoFabricacao;
    private String placa;

    //construtor
    public Carro(int anoFabricacao, String placa) {
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "[anoFabricacao=" + anoFabricacao + ", placa=" + placa + "]";
    }

}
