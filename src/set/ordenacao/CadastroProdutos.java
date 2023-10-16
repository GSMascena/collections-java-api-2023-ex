package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        this.produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }
    
    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(this.produtoSet);
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorProdutoPorPreco());
        produtosPorPreco.addAll(this.produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(
                                            1L, 
                                            "Produto 5", 
                                            15.0, 
                                            5);

        cadastroProdutos.adicionarProduto(
                                            2L, 
                                            "Produto 0", 
                                            20.0, 
                                            10);
        cadastroProdutos.adicionarProduto(
                                            1L, 
                                            "Produto 3", 
                                            10.0, 
                                            2);
        cadastroProdutos.adicionarProduto(
                                            9L, 
                                            "Produto 9", 
                                            2.0, 
                                            2);
        
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
