//Classe
public abstract class Medico{

    //Atributos da classe
    private String CRM;
    private String nome;
    private int idade;
    private double salario;

    //Quando chamar para mostrar as informações que adicionou vem dessa forma | System.out.println(medico); - Medico [nome=João, CRM=12345, idade=35, salario=8000.0]
    @Override
    public String toString(){
        return "Medico [nome=" + nome + ", CRM= "+ CRM + ", idade= "+ idade + ", salario= "+ salario + "]";
    }

    //Construtor
    public Medico(String CRM, String nome, int idade, double salario){
        super();
        this.CRM = CRM;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //Declaração dos métodos abstratos
    public abstract boolean medicoAposentado(){
        return idade >= 55;
    }
        
    public abstract double valorAposentadoria(){
        return salario * 0.8;
    }
        
    //Get
    public String  getCRM(){
        return CRM;
    }
    //Set
    public void setCRM(String CRM){
        this.CRM = CRM;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        salario(salario);
    }
}
