package lsp1;

public class Penguin extends Bird {

    public Penguin(){
        super(false);
        flySpeed = 0;
    }

    @Override
    public void fly() {
        throw new RuntimeException("Пингвин не умеет летать!");
    }

}
