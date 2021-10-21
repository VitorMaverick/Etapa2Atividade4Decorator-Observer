package cenarioNumero1;

public class NumeroUm {
    private String numero = "1";

    public String getNumero() {
        return numero;
    }

    public void concat(String primeiroCarac,String segundoCarac) {
        this.numero = primeiroCarac + numero + segundoCarac;
    }
}
