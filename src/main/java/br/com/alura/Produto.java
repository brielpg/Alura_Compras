package br.com.alura;

public class Produto implements Comparable<Produto>{
    private String nomeDoProduto;
    private double precoDoProduto;

    public Produto(String nomeDoProduto, double precoDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.precoDoProduto = precoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    @Override
    public String toString() {
        return "Produto:\nNome= " + nomeDoProduto + "\npreço= " + precoDoProduto;
    }

    @Override
    public int compareTo(Produto o) {
        return Double.valueOf(this.precoDoProduto).compareTo(Double.valueOf(o.precoDoProduto));
    }
}
