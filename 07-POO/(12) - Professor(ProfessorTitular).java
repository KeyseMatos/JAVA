public class ProfessorTitular extends Professores{

    public ProfessorTitular(int totalProfessores, String matricula, String nome, int horasSemanais, double salarioBase){
        super(totalProfessores, matricula, nome, horasSemanais, salarioBase);
    }

    @Override
    public elegivelAfastamento(){
        return get.HorasSemanais() >= 20;
    }

    @Override
    public calcularSalarioFinal(){
        return get.salarioBase() + 1200;
    }
}
