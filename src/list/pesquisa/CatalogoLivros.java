package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro (String titulo, String autor, int anoPublicacao) {
        this.livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor (String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!this.livroList.isEmpty()) {
            for (Livro livro : this.livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if (!this.livroList.isEmpty()) {
            for (Livro livro : this.livroList) {
                if (livro.getAnoDePublicacao() >= anoInicial && 
                    livro.getAnoDePublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }

        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        for (Livro livro : livroList) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
        catalogoLivros.adicionarLivro("Vidas Secas", "Graciliano Ramos", 1938);
        catalogoLivros.adicionarLivro("O Cortiço", "Aluísio Azevedo", 1890);
        catalogoLivros.adicionarLivro("Iracema", "José de Alencar", 1865);
        catalogoLivros.adicionarLivro("O Guarani", "José de Alencar", 1857);

        System.out.println(catalogoLivros.pesquisarPorAutor("josé de alencar"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1800, 1899));
        System.out.println(catalogoLivros.pesquisarPorTitulo("dom casmurro"));
    }
}
