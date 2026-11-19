package GestaoHospitalar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaTurma {

    public static void main(String[] args) {

        //ARRAYLIST

        ArrayList<String> alunos = new ArrayList<String>();
        alunos.add("João");
        alunos.add("Maria");
        alunos.add("Pedro");
        alunos.add("João");

        System.out.println("===ARRAYLIST===");

        for (String aluno : alunos) {
            System.out.println("- " + aluno);
        }

        //HASHSET

        HashSet<String> alunosHashSet = new HashSet<String>();
        alunosHashSet.add("João");
        alunosHashSet.add("Maria");
        alunosHashSet.add("Pedro");
        alunosHashSet.add("Ana");

         System.out.println("===HASHSET===");
         System.out.println("Quantidade de alunos: " + alunosHashSet.size());

        //HASHMAP

        HashMap<String, Double> alunosHashMap = new HashMap<String, Double>();
        alunosHashMap.put("João", 8.5);
        alunosHashMap.put("Maria", 9.0);
        alunosHashMap.put("Pedro", 7.5);

        System.out.println("===HASHMAP===");
        System.out.println("Notas dos alunos: " + alunosHashMap);

        String nomeBusca = "João";

        System.out.println("\n====BUSCAR NOTA====");

        if (alunosHashMap.containsKey(nomeBusca)) {
            System.out.println("Nota de " + nomeBusca + ": " + alunosHashMap.get(nomeBusca));
        } else {
            System.out.println("Aluno não encontrado.");
        }

    }
}
