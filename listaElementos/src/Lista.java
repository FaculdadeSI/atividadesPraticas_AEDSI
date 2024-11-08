

public class Lista {

    static int item[];
    static int primeiro, ultimo;

    public static void Lista(int tam) { //cria uma lista vazia
        item = new int[tam];
        primeiro = 0;
        ultimo = primeiro;
    }

    public static void insere(int x) { //insere um elemento no final da lista
        if (ultimo >= item.length) {
            System.out.println("Erro: lista está cheia!");
            return;
        } else {
            item[ultimo] = x;
            ultimo += 1;
        }
    }

    public static boolean vazia() { //testa se há elementos no vetor 'item' e retorna true (ou false)       
        return (primeiro == ultimo); //a lista em 'item' estará vazia se primeiro (=0) é igual a ultimo (=0)
    }

    public static void imprime() { //imprime os elementos da lista do primeiro até (último - 1)
        for (int i = primeiro; i < ultimo; i++) {
            System.out.println(item[i]);
        }
    }

    public static Object pesquisa(int chave) { //pesquisa um elemento na lista 
        if (vazia()) {
            System.out.println("Erro! Lista vazia!");
            return null; //elemento não encontrado (null é POO)
        }
        int p = 0;
        while (p < ultimo && item[p] != chave) {
            p++;
        }
        if (p >= ultimo) {
            return null; //'it' não está no vetor!
        }
        //'it' foi encontrado na posição p, salvamos 'it' (um valor que não sabemos qual é) para retornar
        Object elem = item[p]; //essa atribuição é permitida, mais adiante iremos retornar um registro
        return elem;
    }

    public static Object retira(int chave) { //busca um elemento igual à chave na lista, se existir retorna o elemento
        if (vazia()) {
            System.out.println("Erro! Lista vazia!");
            return null; //elemento não encontrado (null é POO)
        }
        int r = 0;
        while (r < ultimo && item[r] != chave) {
            r++;
        }
        if (r >= ultimo) {
            return null; //'it' não está no vetor!
        }
        //'it' foi encontrado na posição r, salvamos 'it' (um valor que não sabemos qual é) para retornar
        Object elem = item[r]; //essa atribuição é permitida, mais adiante iremos retornar um registro

        ultimo = ultimo - 1; //todos os demais elementos (índices de r à ultimo - 1) serão deslocados uma posição para frente para ocupar a posição r de 'it' (retirado)
        for (int aux = r; aux < ultimo; aux++) {
            item[aux] = item[aux + 1];
        }
        return null;
    }

    public static Object retiraPrimeiro(int chave) { //retira e retorna o 1° elemento da lista, se esta não estiver vazia
        if (vazia()) {
            System.out.println("Erro! Lista vazia!");
            return null;
        }
        Object elem = item[0]; //salva o item[0] para retornar
        ultimo = ultimo - 1; //todos os demais elementos (índice de 1 à último-1) serão deslocados uma posição para frente para ocupar a posição a posição 0
        for (int aux = 0; aux < ultimo; aux++) {
            item[aux] = item[aux + 1];
        }
        return elem;
    }
}
