package cenarioMontagemPizza;

public class OreganoDecorator extends AbstractCondimentDecorator{
    public OreganoDecorator(String description, AbstractPizza pizza) {
        super(description, pizza);
    }

    @Override
    void cost(double valor) {
        System.out.println("Adicional de oregano: 0.50");
        double novoValor = valor + 0.50;
        this.getDecoratedPizza().cost(novoValor);
    }
}
