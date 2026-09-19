public class ProfessorTitular extends Professor {

    public ProfessorTitular(String matricula, String nome, int horasSemanais, double salarioBase) {
        super(matricula, nome, horasSemanais, salarioBase);
    }

    @Override
    public boolean elegivelAfastamento() {
        return getHorasSemanais() >= 20;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + 1200;
    }

    @Override
    public String toString() {
        return super.toString()
                + " ProfessorTitular [elegivelAfastamento()="
                + elegivelAfastamento()
                + ", calcularSalarioFinal()="
                + calcularSalarioFinal()
                + "]";
    }
}
