/**
 * A classe abstrata Personagem é a classe base para representar personagens no jogo PoW (POAO of Warcraft).
 * Define atributos comuns a todos os personagens, como nome, nível de experiência, força, agilidade e inteligência.
 * Além disso, declara métodos abstratos para subir de nível e mostrar especialidade, que devem ser implementados
 * por subclasses específicas (Guerreiro, Mago, Mercenario).
 */
public abstract class Personagem {
    protected String nome; // Nome do personagem
    protected int experiencia; // Nível de experiência do personagem
    protected int forca; // Valor da força do personagem
    protected int agilidade; // Valor da agilidade do personagem
    protected int inteligencia; // Valor da inteligência do personagem

    /**
     * Construtor para a classe abstrata Personagem.
     *
     * @param nome         O nome do personagem.
     * @param experiencia  O nível de experiência do personagem.
     * @param forca        O valor da força do personagem.
     * @param agilidade    O valor da agilidade do personagem.
     * @param inteligencia O valor da inteligência do personagem.
     */
    public Personagem(String nome, int experiencia, int forca, int agilidade, int inteligencia) {
        this.nome = nome;
        this.experiencia = experiencia;
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
    }

    /**
     * Método abstrato para subir o nível do personagem.
     * A implementação específica é fornecida pelas subclasses.
     */
    public abstract void subirNivel();

    /**
     * Método abstrato para mostrar a especialidade do personagem.
     * A implementação específica é fornecida pelas subclasses.
     */
    public abstract void mostrarEspecialidade();

    /**
     * Sobrescreve o método toString para fornecer uma representação de string padrão para objetos Personagem.
     *
     * @return Uma string que representa o nome e o nível de experiência do personagem.
     */
    @Override
    public String toString() {
        return nome + " (Nível " + experiencia + ")";
    }
}


