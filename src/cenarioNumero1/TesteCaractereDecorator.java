package cenarioNumero1;

public class TesteCaractereDecorator {
    public static void main(String[] args) {
        NumeroUm primeiroNumero = new NumeroUm();
        NumeroUm segundoNumero = new NumeroUm();

        ICaractere caractereColchete = new CaractereDecoratorColchete(new ImprimeCaractere());
        caractereColchete.imprime(primeiroNumero);

        ICaractere caractereParentese = new CaractereDecoratorParentese(new ImprimeCaractere());
        caractereParentese.imprime(primeiroNumero);

        ICaractere caractereComParenteseColchete = new CaractereDecoratorParentese(
                new CaractereDecoratorColchete(new ImprimeCaractere()));
        caractereComParenteseColchete.imprime(segundoNumero);
    }

}
