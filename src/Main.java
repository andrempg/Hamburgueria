public class Main {

    public static void main(String[] args) {

        Sanduiche sanduiche = new Hamburguer();
        sanduiche = new Bacon(sanduiche);
        sanduiche = new Queijo(sanduiche);

        FormaDePagamento pagamento = new PagamentoPix();

        Pedido pedido = new Pedido(sanduiche, pagamento);

        System.out.println("\n========== PEDIDO ==========");
        System.out.println("Sanduiche: " + sanduiche.getDescricao());
        System.out.printf("Subtotal: R$ %.2f%n", pedido.calcularTotal());
        System.out.printf("Total pago: R$ %.2f%n", pedido.finalizarPedido());
    }
}
