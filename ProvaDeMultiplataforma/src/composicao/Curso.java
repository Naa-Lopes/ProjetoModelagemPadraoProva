package composicao;

class Curso {
    private String codigo;
    private String nome;

    public Curso(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void matricular() {
        System.out.println("Matriculando no curso " + nome + " (Código: " + codigo + ")");
    }
}
