package Hash;

import java.util.HashMap;

public class Votar {
    static HashMap<String, Boolean> voted = new HashMap<>();
    static void verificar_votacao(String nome) {
        if (voted.containsKey(nome)) {
            System.out.println("Mande embora");
        } else {
            voted.put(nome, true);
            System.out.println("Deixe votar!");
        }
    }
    public static void main(String[] args) {
        verificar_votacao("mike");
        verificar_votacao("mike");
    }
}

