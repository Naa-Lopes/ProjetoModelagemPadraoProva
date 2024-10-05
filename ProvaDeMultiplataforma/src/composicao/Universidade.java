package composicao;

import java.util.ArrayList;

class Universidade {
    private String nome;
    private String localizacao;
    private ArrayList<Curso> cursos;

    public Universidade(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void oferecer() {
        System.out.println("Oferecendo cursos na " + nome + " localizada em " + localizacao);
        for (Curso curso : cursos) {
            curso.matricular();
        }
    }
}