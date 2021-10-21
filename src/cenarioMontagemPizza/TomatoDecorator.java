package cenarioMontagemPizza;

public class TomatoDecorator extends AbstractCondimentDecorator {
    public TomatoDecorator(String description, AbstractPizza pizza) {
        super(description, pizza);
    }

    @Override
    void cost(double valor) {
        System.out.println("Adicional de tomate: 0.10");
        double novoValor = valor + 0.10;
        this.getDecoratedPizza().cost(novoValor);
    }
}
