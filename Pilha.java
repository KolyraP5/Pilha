public class Pilha {
    private int capacidade;
    private int topo;
    private int [] dados;

    public Pilha (int capacidade) {
        dados = new int[capacidade];
        topo = -1;
    }

    public int inserir(int dados){
        topo ++;
        dados[topo] = dados;
        return dados;

    }

    private int cheia(int capacidade){
        if (topo == capacidade){
            System.out.print("a pilha está cheia");
        }
        return capacidade;
    }
    private int vazia (int capacidade){
        if (topo ==0) {
            System.out.print("A pilha está vazia");
        }
        return capacidade;
    }

    private void imprime{
        System.out.print("");
    }
    public void main(String[] args) {
        inserir(5);
        cheia(10);
        vazia(0);
    }
}
