
public class Lista {

    static String convidados[];
    static int primeiro, ultimo;

    public static void Convidados(int tam) {
        convidados = new String[tam];
        primeiro = 0;
        ultimo = primeiro;
    }

    public static void insere(String x) {
        if (ultimo >= convidados.length) {
            System.out.println("Erro! Lista de convidados cheia!");
            return;
        } else {
            convidados[ultimo] = x;
            ultimo += 1;
        }
    }

    public static boolean vazia() {
        return (primeiro == ultimo);
    }

    public static void imprime() {
        for (int i = primeiro; i < ultimo; i++) {
            System.out.println(convidados[i]);
        }
    }

    public static Object pesquisa(int chave) {
        if (vazia()) {
            System.out.println("Erro! Lista de convidados vazia!");
            return null;
        }
        int p = 0;
        while (p < ultimo && convidados[p].equals(chave)) {
            p++;
        }
        if(p>=ultimo){
            return null;
        }
        
        Object elem=convidados[p];
        return elem;
    }
    
    
}
