public class MedicoCirurgiao extends Medico{

    //Vai pegar as informações da classe mãe médico para utilizar aqui por isso o super
    public MedicoCirurgiao(String CRM, String nome, int idade, double salario){
        super(CRM, nome, idade, salario);
    }
    //Escreva em cima de medicoAposentado que está na classe médico o que irei lhe passar
    @Override
    public boolean medicoAposentado(){
        return getIdade() >= 50;
    }
    @Override
    public double valorAposentadoria(){
        return super.valorAposentadoria() + 800;
        //o super ele vai chamar a aposentadoria na classe medico que já tem o calculo e vou aumentar os 800
    }
}
