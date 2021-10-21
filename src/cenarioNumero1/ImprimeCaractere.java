package cenarioNumero1;

public class ImprimeCaractere implements ICaractere{
    @Override
    public void imprime(NumeroUm numero) {
        System.out.print(numero.getNumero());
    }
}
