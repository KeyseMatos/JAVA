import java.util.ArrayList;

public class Universidade {

    ArrayList<Professor> professores = new ArrayList<Professor>();

    // Adicionar professor
    public void adicionarProfessor(Professor p) {
        professores.add(p);
    }

    // Buscar professor pela matrícula
    public Professor buscarProfessor(String matricula) {

        for (Professor professor : professores) {

            if (professor.getMatricula().equals(matricula)) {
                return professor;
            }
        }

        return null;
    }

    // Remover professor pela matrícula
    public void removerProfessor(String matricula) {

        Professor professor = buscarProfessor(matricula);

        if (professor != null) {
            professores.remove(professor);
        }
    }
}
