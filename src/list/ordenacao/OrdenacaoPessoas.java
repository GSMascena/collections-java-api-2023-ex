package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa (String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(this.pessoaList);

        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(this.pessoaList);

        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Arthur", 20, 1.90);
        ordenacaoPessoas.adicionarPessoa("Joyce", 60, 1.60);
        ordenacaoPessoas.adicionarPessoa("Jaime", 5, 1.20);
        ordenacaoPessoas.adicionarPessoa("Richarlison", 39, 1.20);
        ordenacaoPessoas.adicionarPessoa("Zacarias", 30, 1.70);
        ordenacaoPessoas.adicionarPessoa("Roberto", 25, 1.75);
        
        System.out.println(ordenacaoPessoas.pessoaList);

        System.out.println(ordenacaoPessoas.ordenarPorAltura());

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }
}
