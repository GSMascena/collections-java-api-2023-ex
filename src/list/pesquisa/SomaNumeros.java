package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;
    

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public int calcularSoma() {
        int sum = 0;

        for (int numero : numeroList) {
            sum += numero;
        }
        
        return sum;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = -1;

        if (!this.numeroList.isEmpty())
            for (int numero : numeroList) {
                maiorNumero = numero > maiorNumero ? numero : maiorNumero;
            }

        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = -1;

        if (!this.numeroList.isEmpty()) {
            menorNumero = this.numeroList.get(0);
            for (int numero : numeroList) {
                menorNumero = numero < menorNumero ? numero : menorNumero;
            }
        }
       
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(this.numeroList);
    }
    
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(50);
        somaNumeros.adicionarNumero(100);

        System.out.println("Soma: " + somaNumeros.calcularSoma());

        System.out.println("Maior Numero: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor Numero: " + somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();

        somaNumeros.adicionarNumero(-30);

        System.out.println("Soma: " + somaNumeros.calcularSoma());

        System.out.println("Maior Numero: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor Numero: " + somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();
    }
}
