/**
 *
 * @author 0072379
 */
public class Exemplo_1 {

    private Object item[];
    private int topo;

    public Exemplo_1(int maxTam) {
        this.item = new Object[maxTam];
        this.topo = -1;
    }

    public void empilha(Object x) {
        if (this.topo == this.item.length) {
            System.out.println("Erro! A pilha está cheia!");
        } else {
            this.topo += 1;
            this.item[this.topo] = x;
        }
    }

    public boolean vazia() {
        return (this.topo == -1);
    }

    public Object desempilha() {
        if (this.vazia()) {
            System.out.println("Erro! A pilha está vazia!");
        }
        this.topo = topo - 1;
        return this.item[this.topo + 1];
    }
}
