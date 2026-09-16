public class MedicoAuxiliar extends Medico {

    //Vai pegar as informações da classe mãe médico para utilizar aqui por isso o super
    public MedicoAuxiliar(String CRM, String nome, int idade, double salario){
        super(CRM, nome, idade, salario);
    }
    //Escreva em cima de medicoAposentado que está na classe médico o que irei lhe passar
    @Override
    public valorAposentadoria(){
        return getIdade() >= 60;
    }
}
