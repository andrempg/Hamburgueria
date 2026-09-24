public abstract class AdicionalDecorator implements Sanduiche {
    protected Sanduiche sanduiche;

    public AdicionalDecorator(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }
}
