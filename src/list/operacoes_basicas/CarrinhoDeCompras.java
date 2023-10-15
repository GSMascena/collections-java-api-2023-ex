package list.operacoes_basicas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;


    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        this.itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double sum = 0;
        for (Item item : itemList) {
            sum += (item.getPreco() * item.getQuantidade());
        }
        return sum;
    }

    public void exibirItens() {
        System.out.println(this.itemList);
    }

    public static void main(String[] args) {
        // Tests
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("SmartTV", 299.99, 2);
        carrinhoDeCompras.adicionarItem("PlayStation 5", 3999.99, 1);
        carrinhoDeCompras.adicionarItem("Xbox Series S", 1999.99, 2);
        carrinhoDeCompras.adicionarItem("Xbox Series S", 1999.99, 2);
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: R$ " + 
        new DecimalFormat("0.00").format(carrinhoDeCompras.calcularValorTotal()));
        carrinhoDeCompras.removerItem("Xbox Series S");
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: R$ " + 
        new DecimalFormat("0.00").format(carrinhoDeCompras.calcularValorTotal()));
    }
}
