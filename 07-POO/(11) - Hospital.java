import java.util.ArrayList;

public class Hospital{

    ArrayList<Medico> medicos = new ArrayList<Medico>();

        //adicionar medicos, o void pois é vazia não tem retorno
        public void adicionarMedico(Medico medico){
            medicos.add(medico);
        }
        //buscar medico através do CRM
        public Medico buscarMedico(String CRM){
            for(Medico medico : medicos){
                if(medico.getCRM().equals(CRM)){ //equals é como se fosse o == para inteiros porém ele é pra String
                    return medico;
                }
            }
            return null;
        }

        //Remover médico através do CRM
        public void removerMedico(String CRM){

            Medico medico = buscarMedico(CRM); //busca o médico primeiro

            if(medico != null){ // caso não esteja vazio remover o médico
                medicos.remove(medico);
            }
        }

        /* VERIFICAR SE FICA AQUI
        Medico clinico = new Medico("2021", "Keyse", 54, 20.000);
        MedicoAuxiliar MAux = new MedicoAuxiliar("2223", "Jhon", 60, 14.000);
        MedicoCirurgiao MCir = new MedicoCirurgiao("4554", "Adriane", 55, 16.000);

        System.out.println(clinico.medicoAposentado());
		System.out.println(mAux.medicoAposentado());
		System.out.println(mC.medicoAposentado());
		System.out.println(clinico.valorAposentadoria());
		System.out.println(mAux.valorAposentadoria());
		System.out.println(mC.valorAposentadoria());
		
		System.out.println(clinico);
		System.out.println(mAux);
		System.out.println(mC);*/
		
}
