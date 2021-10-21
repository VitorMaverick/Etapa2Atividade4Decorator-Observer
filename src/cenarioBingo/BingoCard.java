package cenarioBingo;

import java.util.List;

public class BingoCard implements IBingoObserver{
    List<Integer> numerosMarcados;
    int numeroDeAcertos;
    String nome;

    public BingoCard(List<Integer> numerosMarcados, String nome) {
        this.numerosMarcados = numerosMarcados;
        this.numeroDeAcertos = 0;
        this.nome = nome;
    }

    @Override
    public void notificaAlteracao(IBingo bingo) {
        numerosMarcados.forEach(numero->{
            if(numero == bingo.getNumSorteado()){
                this.numeroDeAcertos++;
                if(this.numeroDeAcertos == 5) {
                    bingo.fimDoGame(this.nome);
                }

            }
        });
    }
}
