package cenarioNumero1;

public class CaractereDecoratorParentese extends AbstractCaractereDecorator{
    public CaractereDecoratorParentese(ICaractere caractere) {
        super(caractere);
    }

    @Override
    public void imprime(NumeroUm numero) {
        numero.concat("(", ")");
        this.getCaractere().imprime(numero);
    }
}
