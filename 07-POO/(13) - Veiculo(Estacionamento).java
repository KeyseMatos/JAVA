import java.util.ArrayList;
import java.util.List;

public class Estacionamento{

    private String nome;

    private List<Vaga>vagas;

    //CONSTRUTOR
    public Estacionamento(String nome){

        this.nome = nome;

        vagas = new ArrayList<>();
    }

    //GETT E SET

    public getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public List<Vaga> getVagas(){
        return vagas;
    }

    public void estacionar(Veiculo veiculo, int nomeroVaga){

        for(Vaga vaga : vagas){

            if(vaga.getNumero() == numeroVaga){
                vaga.setVeiculo(veiculo);

                System.out.println("Veículo estacionado na vaga "+numeroVaga);

                return;
            }
        }
        System.out.println("Vaga não encontrada.");
    }

    public void listarVagas(){

        System.out.println("\n===== VAGAS =====");

        for(Vaga vaga : vagas){
            System.out.println(vaga);
        }
    }

}
