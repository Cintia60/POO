import java.util.ArrayList;

/**
 * A classe PoW representa o jogo de RPG (Role Playing Game) POAO of Warcraft.
 * Gerencia um conjunto de personagens que podem ser guerreiros, magos ou mercenários.
 * Fornece funcionalidades como impressão de personagens, exibição de personagens com nível superior a 10,
 * impressão de personagens especiais com suas especialidades e a capacidade de subir o nível de experiência de todos os personagens.
 */
public class PoW {
    private ArrayList<Personagem> personagens; // Lista de personagens do jogo

    /**
     * Construtor para a classe PoW.
     * Inicializa a lista de personagens e popula-a com guerreiros, magos e mercenários.
     */
    public PoW() {
        this.personagens = new ArrayList<>();
        inicializarPersonagens();
    }

    /**
     * Inicializa a lista de personagens com guerreiros, magos e mercenários.
     * Adiciona cada personagem à lista.
     */
    private void inicializarPersonagens() {
        for (int i = 1; i <= 5; i++) {
            Guerreiro guerreiro = new Guerreiro("Guerreiro" + i, (int) (Math.random() * 25) + 1, 10, 5, 3, true, "Espada");
            personagens.add(guerreiro);

            Mago mago = new Mago("Mago" + i, (int) (Math.random() * 25) + 1, 2, 4, 9, new ArrayList<>());
            mago.getMochila().add("Sementes de Abóbora"); // Adicionando sementes de abóbora ao mago
            personagens.add(mago);

            Mercenario mercenario = new Mercenario("Mercenario" + i, (int) (Math.random() * 25) + 1, 4, 10, 4, "Arco", 20);
            personagens.add(mercenario);
        }
    }

    /**
     * Imprime informações sobre todos os personagens, incluindo nome e nível de experiência.
     */
    public void imprimirPersonagens() {
        for (Personagem p : personagens) {
            System.out.println(p);
        }
    }

    /**
     * Mostra informações sobre personagens com nível de experiência superior a 10, incluindo nome e nível de experiência.
     */
    public void mostrarPersonagensNivelSuperiorA10() {
        for (Personagem p : personagens) {
            if (p.experiencia > 10) {
                System.out.println(p);
            }
        }
    }

    /**
     * Chama o método mostrarEspecialidade para cada personagem, exibindo suas especialidades.
     */
    public void imprimirPersonagensEspeciais() {
        for (Personagem p : personagens) {
            p.mostrarEspecialidade();
        }
    }

    /**
     * Exibe as estatísticas dos personagens antes e depois de subirem de nível.
     * Chama o método subirNivel para cada personagem.
     */
    public void subirNivelDeExperiencia() {
        System.out.println("Estatísticas Antes:");
        imprimirPersonagens();

        for (Personagem p : personagens) {
            p.subirNivel();
        }

        System.out.println("\nEstatísticas Depois:");
        imprimirPersonagens();
    }
}

