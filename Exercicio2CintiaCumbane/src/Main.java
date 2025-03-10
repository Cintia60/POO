/**
 * A classe Main contém o método principal (main) que inicia a execução do programa.
 * Cria uma instância da classe PoW (jogo) e utiliza seus métodos para imprimir informações sobre as personagens do jogo.
 */
public class Main {
    public static void main(String[] args) {
        // Cria uma instância da classe PoW (jogo)
        PoW jogo = new PoW();

        // Imprime informações sobre todas as personagens
        System.out.println("Todas as Personagens:");
        jogo.imprimirPersonagens();

        // Imprime informações sobre personagens com nível superior a 10
        System.out.println("\nPersonagens com Nível Superior a 10:");
        jogo.mostrarPersonagensNivelSuperiorA10();

        // Imprime informações sobre personagens especiais com suas especialidades
        System.out.println("\nPersonagens Especiais:");
        jogo.imprimirPersonagensEspeciais();

        // Exibe as estatísticas dos personagens antes e depois de subirem de nível
        System.out.println("\nSubir Nível de Experiência:");
        jogo.subirNivelDeExperiencia();
    }
}
