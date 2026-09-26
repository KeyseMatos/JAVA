public class Vaga{

    private int numero;
    private Veiculo veiculo;

    //CONSTRUTOR
    public Vaga(int numero){
        this.numero = numero;
    }

    //GETT E SET

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    @Override
    public String toString(){

        if(veiculo == null){

            return "Vaga " + numero +" -Livre";

        }else{

            return "Vaga " + numero +" - " + veiculo;
        }
    }
}
