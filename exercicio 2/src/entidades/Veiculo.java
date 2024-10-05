package entidades;

public class Veiculo {
    private String tipo;
    private String cor;
    private int quantidadeRodas;


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    @Override
    public String toString(){
        return "Tipo: " + this.tipo + " - " +
                "Cor: " + this.cor + " - " +
                "Quantidade de rodas: " + this.quantidadeRodas + " ";
    }
}
