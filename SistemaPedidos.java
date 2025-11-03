package poo.demo;

/*public class SistemaPedidos {
        public static void main(String[] args) {

                Produto teclado = new Produto("Fortrek Teclado Gamer BLACK EAGLE", 79.10, 15);
                Produto MousePad = new Produto("Mouse Pad Preto", 8.90, 4);
                Produto mouse = new Produto("Mouse Dell sem fio - WM118", 69, 999);
                Produto placavideo = new Produto("RTX 3060 Super", 1500.00, 10);

                /*ItemPedido itemTeclado = new ItemPedido(teclado, 1);
                ItemPedido itemMousePad = new ItemPedido(MousePad, 2);
                ItemPedido itemMouse = new ItemPedido(mouse, 1);
                ItemPedido itemPlacaVideo = new ItemPedido(placavideo, 1);

                ItemPedido itens[] = new ItemPedido[6];
                itens[0] = itemTeclado;
                itens[1] = itemMousePad;
                itens[2] = itemMouse;
                itens[3] = itemPlacaVideo;

                ClientePF clientePF = new ClientePF("Crystian", "flamengotetracampeaodalibertadores2025@gmail.com","123.123.123-12");
                ClientePJ clientePJ = new ClientePJ("Arthur", "saopaulodocrespo@gmail.com", "321321123131.032");


                 * System.out.println(
                 * "Nome: " + clientePF.getNome() + ", Email: " + clientePF.getEmail() +
                 * ", CPF: "
                 * + clientePF.getCpf());
                 * System.out.println(
                 * "Nome: " + clientePJ.getNome() + ", Email: " + clientePJ.getEmail() +
                 * ", CNPJ: "
                 * + clientePJ.getCnpj());


                Pedido pedido1 = new Pedido(clientePF);
                Pedido pedido2 = new Pedido(clientePJ);
                Pedido pedido3 = new Pedido(clientePF);
                Pedido pedido4 = new Pedido(clientePJ);

                PagamentoCartaoCredito pagamento2 = new PagamentoCartaoCredito("1000000000000001", "Arthur");
                PagamentoCartaoCredito pagamento1 = new PagamentoCartaoCredito("2000000000000002", "Crystian");
                PagamentoBoleto pagamento3 = new PagamentoBoleto("12345678901234567890", 800.00);
                PagamentoBoleto pagamento4 = new PagamentoBoleto("09876543210987654321", 1500.00);


                pedido1.adicionarItem(teclado, 1);
                pedido1.adicionarItem(mouse, 1);
                pedido1.exibiritens();
                pedido1.setMetodoPagamento(pagamento1);
                System.out.printf("Valor Total da compra: R$ %.2f\n\n", pedido1.calcularTotal());

                System.out.println(pagamento1.processarPagamento(pedido1.calcularTotal()) + "\n");

                pedido2.adicionarItem(mouse, 1000);
                pedido2.adicionarItem(MousePad, 1);
                pedido2.exibiritens();
                pedido2.setMetodoPagamento(pagamento2);
                System.out.printf("Valor Total da compra: R$ %.2f\n\n", pedido2.calcularTotal());

                System.out.println(pagamento2.processarPagamento(pedido2.calcularTotal()) + "\n");

                pedido3.adicionarItem(teclado, 10);
                pedido3.exibiritens();
                pedido3.setMetodoPagamento(pagamento3);
                System.out.printf("Valor Total da compra: R$ %.2f\n\n", pedido3.calcularTotal());

                System.out.println(pagamento3.processarPagamento(pedido3.calcularTotal()) + "\n");

                pedido4.adicionarItem(placavideo, 1);
                pedido4.exibiritens();
                pedido4.setMetodoPagamento(pagamento4);
                System.out.printf("Valor Total da compra: R$ %.2f\n\n", pedido4.calcularTotal());

                System.out.println(pagamento4.processarPagamento(pedido4.calcularTotal()) + "\n");

        }

}*/