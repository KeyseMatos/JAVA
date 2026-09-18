public class ProfessorSubstituto extends Professores{

    public ProfessorSubstituto(int totalProfessores, String matricula, String nome, int horasSemanais, double salarioBase){
        super(totalProfessores, matricula, nome, horasSemanais, salarioBase);
    }

    @Override
    public elegivelAfastamento(){
        return get.getHorasSemanais() >= 35;
    }

    @Override
    public calcularSalarioFinal(){
        return get.salarioBase();
    }
}
