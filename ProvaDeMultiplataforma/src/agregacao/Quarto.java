package agregacao;

class Quarto {
    private String tamanho;
    private String tipo;

    public Quarto(String tamanho, String tipo) {
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public void arrumar() {
        System.out.println("Arrumando o " + tipo + " de tamanho " + tamanho);
    }
}