package poo.demo;

interface IPagamento {
    boolean processarPagamento(double valor);

    StatusPagamento getStatus();
}