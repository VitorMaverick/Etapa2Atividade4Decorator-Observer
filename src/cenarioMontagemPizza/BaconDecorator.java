package cenarioMontagemPizza;

public class BaconDecorator extends AbstractCondimentDecorator{
    public BaconDecorator(String description, AbstractPizza pizza) {
        super(description, pizza);
    }

    @Override
    void cost(double valor) {
        System.out.println("Adicional de bacon: 0.80");
        double novoValor = valor + 0.80;
        this.getDecoratedPizza().cost(novoValor);
    }
}
