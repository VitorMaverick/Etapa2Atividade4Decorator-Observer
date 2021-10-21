package cenarioNumero1;

public class CaractereDecoratorColchete extends AbstractCaractereDecorator {

    public CaractereDecoratorColchete(ICaractere caractere) {
        super(caractere);
    }

    @Override
    public void imprime(NumeroUm numero) {
        numero.concat("{", "}");
        this.getCaractere().imprime(numero);
    }
}
