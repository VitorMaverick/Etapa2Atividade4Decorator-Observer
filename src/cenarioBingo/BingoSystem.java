package cenarioBingo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.exit;

public class BingoSystem implements IBingo {
    int numSorteado;

    List<IBingoObserver> cards = new ArrayList<>();

    public void sorteiaNum() {
        this.numSorteado = ThreadLocalRandom.current().nextInt(50);
        cards.forEach(card->card.notificaAlteracao(this));
    }

    public int getNumSorteado() {
        return numSorteado;
    }

    @Override
    public void fimDoGame(String nome) {
        System.out.println("Fim do jogo, " + nome +
                " é venceu!");
        exit(0);
    }

    @Override
    public void addObserver(IBingoObserver observer) {
        cards.add(observer);
    }
}
