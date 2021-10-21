package cenarioNumero1;

public abstract class AbstractCaractereDecorator implements ICaractere{
    private ICaractere caractere;

    public AbstractCaractereDecorator(ICaractere caractere) {
        this.caractere = caractere;
    }

    @Override
    public abstract void imprime(NumeroUm numero);
    //System.out.println(numero.getNumero());

    public ICaractere getCaractere() {
        return this.caractere;
    }
}
