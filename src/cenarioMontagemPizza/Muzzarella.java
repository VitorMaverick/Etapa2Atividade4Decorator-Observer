package cenarioMontagemPizza;

public class Muzzarella extends AbstractPizza {
    public Muzzarella(String description) {
        super(description);
    }

    @Override
    void cost(double valor) {
        double novoValor = valor + 14.90;
        this.increaseCost(novoValor);
        System.out.println("Pizza de muzzarela: 14.90");
        System.out.println("valor total + frete: " + this.getCost());

    }
}
