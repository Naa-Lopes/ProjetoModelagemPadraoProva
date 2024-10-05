package agregacao;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Rua das Flores, 123", "azul", 2);
        casa.adicionarQuarto(new Quarto("grande", "quarto principal"), 0);
        casa.adicionarQuarto(new Quarto("pequeno", "quarto de hóspedes"), 1);
        casa.abrirPorta();
    }
}