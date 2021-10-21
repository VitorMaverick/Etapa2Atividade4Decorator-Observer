package cenarioMontagemPizza;

public class Pepperoni extends AbstractPizza {
    public Pepperoni(String description) {
        super(description);
    }

    @Override
    void cost(double valor) {
        double novoValor = valor + 11.90;
        this.increaseCost(novoValor);
        System.out.println("Pizza de peperone: 11.90");
        System.out.println("valor total + frete: " + this.getCost());

    }
}
