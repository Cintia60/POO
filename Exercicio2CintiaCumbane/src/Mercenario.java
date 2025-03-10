/**
 * A classe Mercenario representa um tipo de personagem no jogo PoW (POAO of Warcraft).
 * Mercenários têm a capacidade de usar armas de longo alcance e têm um número limitado de munições.
 * Eles podem subir de nível e têm uma especialidade em usar armas de longo alcance, como arcos.
 */
public class Mercenario extends Personagem {

    private String armaLongoAlcance; // Tipo de arma de longo alcance do mercenário
    private int numeroMunicoes; // Número de munições do mercenário

    /**
     * Construtor para a classe Mercenario.
     *
     * @param nome              O nome do mercenário.
     * @param experiencia       O nível de experiência do mercenário.
     * @param forca             O valor da força do mercenário.
     * @param agilidade         O valor da agilidade do mercenário.
     * @param inteligencia      O valor da inteligência do mercenário.
     * @param armaLongoAlcance  O tipo de arma de longo alcance do mercenário.
     * @param numeroMunicoes    O número de munições do mercenário.
     */
    public Mercenario(String nome, int experiencia, int forca, int agilidade, int inteligencia, String armaLongoAlcance, int numeroMunicoes) {
        super(nome, experiencia, forca, agilidade, inteligencia);
        this.armaLongoAlcance = armaLongoAlcance;
        this.numeroMunicoes = numeroMunicoes;
    }

    /**
     * Obtém o tipo de arma de longo alcance do mercenário.
     *
     * @return O tipo de arma de longo alcance.
     */
    public String getArmaLongoAlcance() {
        return armaLongoAlcance;
    }

    /**
     * Sobrescreve o método da superclasse para subir o nível do mercenário.
     * Incrementa a experiência, força, agilidade e inteligência de acordo com as regras do jogo.
     */
    @Override
    public void subirNivel() {
        experiencia++;
        forca += forca * 0.08; // acrescenta 8%
        agilidade += agilidade * 0.2; // acrescenta 20%
        inteligencia += inteligencia * 0.08; // acrescenta 8%
    }

    /**
     * Sobrescreve o método da superclasse para mostrar a especialidade do mercenário.
     * Imprime uma mensagem se o mercenário está usando um arco.
     */
    @Override
    public void mostrarEspecialidade() {
        if (getArmaLongoAlcance().equals("Arco")) {
            System.out.println("Mercenário com Arco: " + this);
        }
    }
}
