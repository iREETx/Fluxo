package veiculos;
public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de portas: " + portas);
    }
}