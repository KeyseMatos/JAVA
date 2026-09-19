public class ProfessorSubstituto extends Professor {

    public ProfessorSubstituto(String matricula, String nome, int horasSemanais, double salarioBase) {
        super(matricula, nome, horasSemanais, salarioBase);
    }

    @Override
    public boolean elegivelAfastamento() {
        return getHorasSemanais() >= 35;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase();
    }

    @Override
    public String toString() {
        return super.toString()
                + " ProfessorSubstituto [elegivelAfastamento()="
                + elegivelAfastamento()
                + ", calcularSalarioFinal()="
                + calcularSalarioFinal()
                + "]";
    }
}
