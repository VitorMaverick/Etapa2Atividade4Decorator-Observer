package cenarioBingo;

public interface IBingo {
    int getNumSorteado();
    void addObserver(IBingoObserver observer);
    void sorteiaNum();
    void fimDoGame(String nome);
}
