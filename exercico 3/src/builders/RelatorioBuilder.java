package builders;

import entidades.Relatorio;

public class RelatorioBuilder {
    private Relatorio relatorio = new Relatorio();

    public RelatorioBuilder setTitulo(String titulo){
        this.relatorio.setTitulo(titulo);
        return this;
    }

    public RelatorioBuilder setCorpo(String corpo){
        this.relatorio.setCorpo(corpo);
        return this;
    }

    public RelatorioBuilder setRodaPe(String rodaPe){
        this.relatorio.setRodaPe(rodaPe);
        return this;
    }

    public Relatorio build(){
        return this.relatorio;
    }

}
