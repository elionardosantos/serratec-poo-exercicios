package Entidade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numPedido;
    private Cliente cliente;
    private LocalDate data;
    private Double valorSubtotalItens = 0.0;
    private Double valorTotal = 0.0;
    private Double valorFrete = 0.0;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(int numPedido, Cliente cliente, LocalDate data) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.data = data;
    }

    public void adicionarProduto(ItemPedido item, Integer quantidade) {
        item.setQuantidade(quantidade);
        item.setSubTotal(( item.getPrecoUnitario() * quantidade));

        this.valorSubtotalItens += item.getSubTotal();
        this.itens.add(item);
    }

    public void fecharPedido() {

        this.valorFrete = this.valorSubtotalItens > 250.0 ? 0.0 : 25.0;
        this.valorTotal = this.valorSubtotalItens + this.valorFrete;

        System.out.print(
                "\n\n---------- PEDIDO "+ this.numPedido +" -----------" +
                "\nNome: " + this.cliente.getNome() +
                "\nCPF: " + this.getCliente().getCpf() +
                "\nData: " + this.data +
                "\n\n-------- ITENS DO PEDIDO ---------"
        );

        for(ItemPedido item : itens){

            System.out.printf(
                    "\n %dx %s - R$ %.2f",
                    item.getQuantidade(),
                    item.getNome(),
                    item.getSubTotal()
            );

        }

//        itens.forEach(
//
//                item -> System.out.printf(
//                        "\n %dx %s - R$ %.2f",
//                        item.getQuantidade(),
//                        item.getNome(),
//                        item.getSubTotal()
//                )
//
//        );


        System.out.printf(
                "\n\n------------- TOTAL --------------" +
                "\nSubtotal itens: R$ %.2f" +
                "\nValor do frete: R$ %.2f" +
                "\nTotal do pedido: R$ %.2f\n\n\n",
                this.valorSubtotalItens,
                this.valorFrete,
                this.valorTotal
        );
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
