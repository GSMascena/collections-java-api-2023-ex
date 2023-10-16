package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavraSet.add(palavra);
    }
    
    public void removerPalavra(String palavra) {
        if (this.verificarPalavra(palavra))
            this.palavraSet.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        if (!this.palavraSet.isEmpty())
            return this.palavraSet.contains(palavra);
        return false;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(this.palavraSet);
    }
    
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Dio");
        conjuntoPalavrasUnicas.adicionarPalavra("Bootcamp");
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Collections");
        conjuntoPalavrasUnicas.adicionarPalavra("Java");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("Java esta no conjunto? " + 
                                    conjuntoPalavrasUnicas.verificarPalavra("Java"));

        conjuntoPalavrasUnicas.removerPalavra("Java");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("Java esta no conjunto? " + 
                                    conjuntoPalavrasUnicas.verificarPalavra("Java"));
    }
}
