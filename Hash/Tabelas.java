package Hash;

import java.util.HashMap;

public class Tabelas {
    public static void main(String[] args) {
        HashMap<String, Double> tabela = new HashMap<>();
        tabela.put("Maça", 1.49);
        tabela.put("Banana", 0.9);
        tabela.put("Abacate", 1.2);

        System.out.println(tabela);

        System.out.println(tabela.get("Banana"));
    }
}
