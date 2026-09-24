public class Alface extends AdicionalDecorator {

    public Alface(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", alface";
    }

    @Override
    public double getPreco() {
        return sanduiche.getPreco() + 1.50;
    }
}