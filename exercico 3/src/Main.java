import builders.RelatorioBuilder;
import entidades.Relatorio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executando Relatório");
        executarRelatorio();
    }

    private static void executarRelatorio(){
        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("Relatório de vendas")
                .setCorpo("Normas ABNT")
                .setRodaPe("2 mm")
                .build();

        System.out.println(relatorio.toString());
    }
}