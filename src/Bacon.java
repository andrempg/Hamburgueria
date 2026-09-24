public class Bacon extends AdicionalDecorator {

    public Bacon(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", bacon";
    }

    @Override
    public double getPreco() {
        return sanduiche.getPreco() + 4.00;
    }
}