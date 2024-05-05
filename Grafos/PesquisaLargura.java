package Grafos;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PesquisaLargura {
    private Map<String, Set<String>> grafo;

    public PesquisaLargura(Map<String, Set<String>> grafo) {
        this.grafo = grafo;
    }
    public static void main(String[] args) {
        Map<String, Set<String>> grafo = new HashMap<>();
        PesquisaLargura p = new PesquisaLargura(grafo);
        p.Pesquisa("voce");

    }
    public boolean Pesquisa(String nome){
        Deque<String> fila = new ArrayDeque<>();
        fila.addAll(grafo.get(nome));
        Set<String> verificadas = new HashSet<>();

        while (!fila.isEmpty()) {
            String pessoa = fila.poll();
            if (!verificadas.contains(pessoa)) {
                if (pessoaEhVendedora(pessoa)) {
                    System.out.println(pessoa + " é vendedor de manga");
                    return true;
                } else {
                    fila.addAll(grafo.get(pessoa));
                    verificadas.add(pessoa);
                }
            }
        }
        return false;

    }
    private boolean pessoaEhVendedora(String pessoa) {
        return false;
    }
}
