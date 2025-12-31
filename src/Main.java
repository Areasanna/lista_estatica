public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona(10);
        vetor.adiciona(20);
        vetor.adiciona(30);
        System.out.println(vetor);
        System.out.println("Tamanho atual: " + vetor.tamanho());
        System.out.println("Item na posição 0: " + vetor.buscar(0));
        System.out.println("Posição do Elemento 20: " + vetor.busca(20));
        System.out.println("Posição do Elemento 99: " + vetor.busca(99));

        vetor.remove(0);
        System.out.println(vetor);

        vetor.adiciona(0,1);
        System.out.println(vetor);
    }
}
