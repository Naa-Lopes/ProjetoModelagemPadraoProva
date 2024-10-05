package agregacao;

class Casa {
    private String endereco;
    private String cor;
    private Quarto[] quartos;

    public Casa(String endereco, String cor, int numQuartos) {
        this.endereco = endereco;
        this.cor = cor;
        this.quartos = new Quarto[numQuartos];
    }

    public void adicionarQuarto(Quarto quarto, int index) {
        if (index >= 0 && index < quartos.length) {
            quartos[index] = quarto;
        }
    }

    public void abrirPorta() {
        System.out.println("Abrindo a porta da casa em " + endereco);
        for (Quarto quarto : quartos) {
            if (quarto != null) {
                quarto.arrumar();
            }
        }
    }
}
