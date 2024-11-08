
public class TestaLista {

    public static void main(String[] args) {

        //cria uma lista para 10 elementos
        Lista.Lista(10);

        //inserido os elementos da lista
        Lista.insere(1);
        Lista.insere(22);
        Lista.insere(13);
        Lista.insere(31);
        Lista.insere(15);

        //imprimindo a lista
        Lista.imprime();

        //excluindo elementos
        Lista.retira(13);
        Lista.imprime();
        Lista.retira(22);
        Lista.imprime();

        //pesquisando elementos
        Lista.pesquisa(31);
    }

}
