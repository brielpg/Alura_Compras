package br.com.alura;
import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limite;
    private double saldoAtual;
    private List<Produto> compras;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldoAtual = this.limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancarCompra(Produto produto){
        if(this.saldoAtual >= produto.getPrecoDoProduto()){
            this.saldoAtual -= produto.getPrecoDoProduto();
            this.compras.add(produto);
            return true;
        }

        return false;
    }

    public void exibirInformacoesDoCartao(){
        System.out.println("****************************");
        System.out.println("COMPRAS REALIZADAS:\n");
        for (Produto i:this.compras) {
            System.out.println(i.getNomeDoProduto()+" - "+i.getPrecoDoProduto());
        }
        System.out.println("\n****************************");
        System.out.println("\nSaldo do cartao: "+this.getSaldoAtual());
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }
}
