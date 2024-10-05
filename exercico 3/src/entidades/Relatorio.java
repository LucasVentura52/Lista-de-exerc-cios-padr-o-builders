package entidades;

public class Relatorio {
    private String titulo;
    private String corpo;
    private String rodaPe;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setRodaPe(String rodaPe) {
        this.rodaPe = rodaPe;
    }

    @Override
    public String toString(){
        return "Título: " + this.titulo + " - " +
                "Corpo: " + this.corpo + " - " +
                "Roda pé: " + this.rodaPe + " ";
    }
}
