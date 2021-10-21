package cenarioBingo;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        IBingo bingo = new BingoSystem();
        IBingoObserver card1 = new BingoCard(List.of(5,10,15,27,40), "Vitor");
        IBingoObserver card2 = new BingoCard(List.of(10,16,15,20,46), "Maria");
        IBingoObserver card3 = new BingoCard(List.of(5,12,15,20,30), "Zeze");
        IBingoObserver card4 = new BingoCard(List.of(4,10,15,20,22), "Joao");
        IBingoObserver card5 = new BingoCard(List.of(5,10,15,20,30), "Iane");
        bingo.addObserver(card1);
        bingo.addObserver(card2);
        bingo.addObserver(card3);
        bingo.addObserver(card4);
        bingo.addObserver(card5);
        for(int i=0; i<1000; i++) {
            bingo.sorteiaNum();

        }
    }
}
