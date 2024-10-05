package composicao;

public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade do Conhecimento", "Centro");
        universidade.adicionarCurso(new Curso("CS101", "Introdução à Programação"));
        universidade.adicionarCurso(new Curso("CS102", "Estruturas de Dados"));
        universidade.oferecer();
    }
}
