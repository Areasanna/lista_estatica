import java.util.Arrays;

public class Vetor {
    private Integer[] elementos;
    private int tamanho; // Corrigido de 'tamnho' para 'tamanho' para clareza

    // Construtor de classe
    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Integer elemento){
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }  else{
            return false;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vetor {\n");
        sb.append("\titems: [");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }

        sb.append("]\n");
        sb.append(String.format("\tcapacity: %d\n", elementos.length));
        sb.append(String.format("\tsize: %d\n", tamanho));
        sb.append("}");

        return sb.toString();
    }
    public int tamanho(){
        return this.tamanho;
    }
    public Integer buscar(int i){
        if(!(i >=0 && i < tamanho)){
            throw new IllegalArgumentException("Posição inválida.");
        }
        return this.elementos[i];
    }
    public int busca(Integer elemento){
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
        this.elementos[tamanho] = null;
    }
    public boolean adiciona(int posicao, Integer elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        if (this.tamanho >= this.elementos.length) {
            return false; // Vetor está cheio
        }
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }
}