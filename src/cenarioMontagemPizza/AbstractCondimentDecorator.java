package cenarioMontagemPizza;

public abstract class AbstractCondimentDecorator extends AbstractPizza {
    AbstractPizza decoratedPizza;

    public AbstractCondimentDecorator(String description, AbstractPizza pizza) {
        super(description);
        this.decoratedPizza = pizza;
    }
    @Override
    abstract void cost(double valor);

    public AbstractPizza getDecoratedPizza() {
        return this.decoratedPizza;
    }
}
