package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaSet.add(new Tarefa(descricao, false));
    }
    
    public void removerTarefa(String descricao) {
        Tarefa tarefaRemovida = null;

        if (!this.tarefaSet.isEmpty())
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemovida = tarefa;
                    break;
                }
            }

        if (tarefaRemovida != null)
            this.tarefaSet.remove(tarefaRemovida);
    }

    public void exibirTarefas() {
        System.out.println(this.tarefaSet);
    }

    public int contarTarefas() {
        return this.tarefaSet.size();
    }

    private Set<Tarefa> pesquisarPorConclusao (boolean foiConcluida) {
        Set<Tarefa> tarefasPorConclusao = new HashSet<>();

        if (!this.tarefaSet.isEmpty())
            for (Tarefa tarefa : this.tarefaSet) {
                if (tarefa.foiConcluida() == foiConcluida)
                    tarefasPorConclusao.add(tarefa);
            }

        return tarefasPorConclusao;
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        return pesquisarPorConclusao(true);
    }

    public Set<Tarefa> obterTarefasPendentes() {
        return pesquisarPorConclusao(false);
    }

    private Tarefa pesquisaPorDescricao (String descricao) {
        if (!this.tarefaSet.isEmpty())
            for (Tarefa tarefa : this.tarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao))
                    return tarefa;
            }

        return null;
    }

    private void alterarConclusao (Tarefa tarefaAtualizada,boolean foiConcluida) {
        if (tarefaAtualizada != null)
            tarefaAtualizada.setFoiConcluida(foiConcluida);
    }

    public void marcarTarefaConcluida(String descricao) {
        this.alterarConclusao(this.pesquisaPorDescricao(descricao), true);
    }

    public void marcarTarefaPendente(String descricao) {
        this.alterarConclusao(this.pesquisaPorDescricao(descricao), false);
    }

    public void limparListaTarefas() {
        this.tarefaSet.removeAll(this.tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Codificar");

        listaTarefas.adicionarTarefa("Estudar");

        listaTarefas.adicionarTarefa("Enviar para o Github");

        listaTarefas.adicionarTarefa("Passear com o cachorro");

        listaTarefas.exibirTarefas();

        System.out.println("Existem um total de: " + listaTarefas.contarTarefas());

        System.out.println("\n");

        System.out.println("TAREFAS CONCLUIDAS");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println("TAREFAS PENDENTES");
        System.out.println(listaTarefas.obterTarefasPendentes());

        System.out.println("\n");

        listaTarefas.marcarTarefaConcluida("Codificar");

        listaTarefas.marcarTarefaConcluida("Enviar para o Github");
        
        System.out.println("TAREFAS CONCLUIDAS");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println("TAREFAS PENDENTES");
        System.out.println(listaTarefas.obterTarefasPendentes());

        System.out.println("\n");

        listaTarefas.marcarTarefaPendente("Codificar");

        System.out.println("TAREFAS CONCLUIDAS");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println("TAREFAS PENDENTES");
        System.out.println(listaTarefas.obterTarefasPendentes());

        System.out.println("\n");

        listaTarefas.removerTarefa("Passear com o cachorro");

        listaTarefas.exibirTarefas();

        System.out.println("Existem um total de: " + listaTarefas.contarTarefas());

        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();

        System.out.println("Existem um total de: " + listaTarefas.contarTarefas());
    }
}
