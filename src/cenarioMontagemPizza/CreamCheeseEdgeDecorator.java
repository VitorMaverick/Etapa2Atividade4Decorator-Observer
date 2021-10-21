package cenarioMontagemPizza;

public class CreamCheeseEdgeDecorator extends AbstractCondimentDecorator {
    public CreamCheeseEdgeDecorator(String description, AbstractPizza pizza) {
        super(description, pizza);
    }

    @Override
    void cost(double valor) {
        System.out.println("adicional de queijo: 1.20");
        double novoValor = valor + 1.20;
        this.getDecoratedPizza().cost(novoValor);
    }
}
