package cenarioMontagemPizza;

public abstract class AbstractPizza {
    String Description;
    double cost;

    public AbstractPizza(String description) {
        Description = description;
        this.cost = 0;
    }

    public double getCost() {
        return this.cost;
    }

    public void increaseCost(double cost) {
        this.cost += cost;
    }

    abstract void cost(double valor);

}
