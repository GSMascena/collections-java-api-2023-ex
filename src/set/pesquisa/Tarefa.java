package set.pesquisa;

public class Tarefa {
    private String descricao;
    private boolean foiConcluida;

    public Tarefa(String descricao, boolean foiConcluida) {
        this.descricao = descricao;
        this.foiConcluida = foiConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean foiConcluida() {
        return foiConcluida;
    }

    public void setFoiConcluida(boolean estaTerminada) {
        this.foiConcluida = estaTerminada;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        if (this.foiConcluida)
            return "(" + this.descricao + ", Concluida)";
        return "(" + this.descricao + ", Pendente)";
    }
}
