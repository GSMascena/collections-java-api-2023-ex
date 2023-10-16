package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;


    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(int codigoConvite, String nome) {
        this.convidadoSet.add(new Convidado(codigoConvite, nome));
    }

    public Convidado encontrarConvidado (int codigoConvite) {
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite)
                return convidado;
        }
        return null;
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        if (!this.convidadoSet.isEmpty()) {
            Convidado convidadoRemovido = this.encontrarConvidado(codigoConvite);

            if (convidadoRemovido != null)
                this.convidadoSet.remove(convidadoRemovido);
        }
    }

    public int contarConvidados() {
        return this.convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(this.convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados.");

        conjuntoConvidados.adicionarConvidado(1234, "Convidado1");
        conjuntoConvidados.adicionarConvidado(1235, "Convidado2");
        
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.adicionarConvidado(1235, "Convidado3");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.adicionarConvidado(1236, "Convidado4");

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados.");
    }
}
