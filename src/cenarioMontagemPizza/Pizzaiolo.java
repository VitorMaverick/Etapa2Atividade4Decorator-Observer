package cenarioMontagemPizza;

public class Pizzaiolo {
    public static void main(String[] args) {
        double valorFrete = 20;
        AbstractPizza pizza = new OreganoDecorator("Pouco oregano",
                new BaconDecorator("bem passado", new Muzzarella("massa fina pae")));
        pizza.cost(valorFrete);

    }
}
