package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;


    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente () {
        List<Integer> numerosOrdemAscendente = new ArrayList<>(this.numerosList);

        Collections.sort(numerosOrdemAscendente);

        return numerosOrdemAscendente;
    }

    public List<Integer> ordenarDescendente () {
        List<Integer> numerosOrdemDescendente = new ArrayList<>(this.numerosList);

        Collections.sort(numerosOrdemDescendente, Collections.reverseOrder());;

        return numerosOrdemDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(33);
        ordenacaoNumeros.adicionarNumero(23);
        ordenacaoNumeros.adicionarNumero(70);
        ordenacaoNumeros.adicionarNumero(63);
        ordenacaoNumeros.adicionarNumero(13);
        ordenacaoNumeros.adicionarNumero(330);

        System.out.println(ordenacaoNumeros.numerosList);

        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
