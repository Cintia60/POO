/**
 * A classe Guerreiro representa um tipo de personagem no jogo PoW (POAO of Warcraft).
 * Guerreiros têm a capacidade de usar armaduras e armas de curto alcance.
 * Eles podem subir de nível e têm uma especialidade de possuir armadura.
 */
public class Guerreiro extends Personagem {

    private boolean possuiArmadura; // Indica se o guerreiro possui armadura
    private String armaCurta; // Tipo de arma de curto alcance do guerreiro

    /**
     * Construtor para a classe Guerreiro.
     *
     * @param nome           O nome do guerreiro.
     * @param experiencia    O nível de experiência do guerreiro.
     * @param forca          O valor da força do guerreiro.
     * @param agilidade      O valor da agilidade do guerreiro.
     * @param inteligencia   O valor da inteligência do guerreiro.
     * @param possuiArmadura Indica se o guerreiro possui armadura.
     * @param armaCurta      O tipo de arma de curto alcance do guerreiro.
     */
    public Guerreiro(String nome, int experiencia, int forca, int agilidade, int inteligencia, boolean possuiArmadura, String armaCurta) {
        super(nome, experiencia, forca, agilidade, inteligencia);
        this.possuiArmadura = possuiArmadura;
        this.armaCurta = armaCurta;
    }

    /**
     * Verifica se o guerreiro possui armadura.
     *
     * @return true se o guerreiro possui armadura, false caso contrário.
     */
    public boolean possuiArmadura() {
        return possuiArmadura;
    }

    /**
     * Sobrescreve o método da superclasse para subir o nível do guerreiro.
     * Incrementa a experiência, força, agilidade e inteligência de acordo com as regras do jogo.
     */
    @Override
    public void subirNivel() {
        experiencia++;
        forca += forca * 0.2; // acrescenta 20%
        agilidade += agilidade * 0.1; // acrescenta 10%
        inteligencia += inteligencia * 0.05; // acrescenta 5%
    }

    /**
     * Sobrescreve o método da superclasse para mostrar a especialidade do guerreiro.
     * Imprime uma mensagem se o guerreiro possui armadura.
     */
    @Override
    public void mostrarEspecialidade() {
        if (possuiArmadura()) {
            System.out.println("Guerreiro com Armadura: " + this);
        }
    }
}
