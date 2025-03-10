import java.util.ArrayList;

/**
 * A classe Mago é uma subclasse de Personagem e representa personagens do tipo mago no jogo PoW (POAO of Warcraft).
 * Possui um atributo adicional, mochila, que contém itens como sementes de abóbora.
 *
 * @version 1.0
 */
public class Mago extends Personagem {
    private ArrayList<String> mochila; // Lista de itens na mochila do mago

    /**
     * Construtor para a classe Mago.
     *
     * @param nome         O nome do mago.
     * @param experiencia  O nível de experiência do mago.
     * @param forca        O valor da força do mago.
     * @param agilidade    O valor da agilidade do mago.
     * @param inteligencia O valor da inteligência do mago.
     * @param mochila      A mochila do mago contendo itens.
     */
    public Mago(String nome, int experiencia, int forca, int agilidade, int inteligencia, ArrayList<String> mochila) {
        super(nome, experiencia, forca, agilidade, inteligencia);
        this.mochila = mochila;
    }

    /**
     * Obtém a mochila do mago.
     *
     * @return A mochila do mago.
     */
    public ArrayList<String> getMochila() {
        return mochila;
    }

    /**
     * Sobrescreve o método subirNivel para aumentar o nível de experiência e ajustar os atributos
     * de força, agilidade e inteligência de acordo com as regras específicas do mago.
     */
    @Override
    public void subirNivel() {
        experiencia++;
        forca += forca * 0.05; // acrescenta 5%
        agilidade += agilidade * 0.1; // acrescenta 10%
        inteligencia += inteligencia * 0.2; // acrescenta 20%
    }

    /**
     * Sobrescreve o método mostrarEspecialidade para exibir informações sobre o mago com sementes de abóbora na mochila.
     */
    @Override
    public void mostrarEspecialidade() {
        if (getMochila().contains("Sementes de Abóbora")) {
            System.out.println("Mago com Sementes de Abóbora: " + this);
        }
    }
}
