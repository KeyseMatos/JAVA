public class Main {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE ESTACIONAMENTO =====");

        // Criando um carro
        Carro carro = new Carro("ABC1234", 3);

        // Criando uma moto
        Moto moto = new Moto("XYZ5678", 4);

        // Testando placa inválida
        System.out.println("\n===== TESTE DE VALIDAÇÃO =====");

        carro.setPlaca("ABC");

        System.out.println("Placa atual do carro: "
                + carro.getPlaca());

        // Criando o estacionamento
        Estacionamento estacionamento =
                new Estacionamento("Estacionamento SENAI");

        // Criando vagas
        Vaga vaga1 = new Vaga(1);
        Vaga vaga2 = new Vaga(2);
        Vaga vaga3 = new Vaga(3);

        // Adicionando vagas ao estacionamento
        estacionamento.adicionarVaga(vaga1);
        estacionamento.adicionarVaga(vaga2);
        estacionamento.adicionarVaga(vaga3);

        // Estacionando veículos
        estacionamento.estacionar(carro, 1);
        estacionamento.estacionar(moto, 2);

        // Listando vagas
        estacionamento.listarVagas();

        // Mostrando valores
        System.out.println("\n===== VALORES =====");

        System.out.println("Valor do carro: R$ "
                + carro.calcularValorTotal());

        System.out.println("Valor da moto: R$ "
                + moto.calcularValorTotal());

        // Total de veículos
        System.out.println("\nTotal de veículos atendidos: "
                + Veiculo.getTotalVeiculosAtendidos());
    }
}
