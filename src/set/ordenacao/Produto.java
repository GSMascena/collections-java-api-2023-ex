package set.ordenacao;

public class Produto implements Comparable<Produto> {
    private long codigo;
    private String nome;
    private double preço;
    private int quantidade;
    
    public Produto(long codigo, String nome, double preço, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "(" + getCodigo() + ": " + getNome() + ", R$" + getPreço() + ")";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
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
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public int compareTo(Produto p) {
        return this.getNome().compareToIgnoreCase(p.getNome());
    }    
}
