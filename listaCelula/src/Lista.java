
public class Lista {

    private static class Celula {

        Object item;
        Celula prox;
    }
    private Celula primeiro, ultimo, pos;

    public Lista() {
        this.primeiro = new Celula();
        this.pos = this.primeiro;
        this.ultimo = this.primeiro;
        this.primeiro.prox = null;
    }

    public void insere(Object x) {
        this.ultimo.prox = new Celula();
        this.ultimo = this.ultimo.prox;
        this.ultimo.item = x;
        this.ultimo.prox = null;
    }

    public boolean vazia() {
        return (this.primeiro == this.ultimo);
    }

    public void imprime() {
        Celula aux = this.primeiro.prox;
        while (aux != null) {
            System.out.println(aux.item.toString());
            aux = aux.prox;
        }
    }

    public Object pesquisa(Object chave) {
        if (vazia() || chave == null) {
            System.out.println("Erro! Lista vazia!");
            return null;
        }
        Celula aux = this.primeiro;
        while (aux.prox != null) {
            if (aux.prox.item.equals(chave)) {
                return true;
            }
            aux = aux.prox;
        }
        return false;
    }

    public Object retira(Object chave) throws Exception {
        if (this.vazia() || (chave == null)) {
            throw new Exception("Erro! Lista vazia ou chave inválida.");
        }
        Celula aux = this.primeiro;
        while (aux.prox != null && !aux.prox.item.equals(chave)) {
            aux = aux.prox;
        }
        if (aux.prox == null) {
            return null;
        }
        Celula q = aux.prox;
        Object item = q.item;
        aux.prox = q.prox;
        if (aux.prox == null) {
            this.ultimo = aux;
        }
        return null;
    }

}
