publuc class Carro extends Veiculo{

    private TipoVeiculo tipo;

    public Carro(String placa, int horaEstacionamento){

        super(placa, horaEstacionamento);

        this.tipo = TipoVeiculo.CARRO;

        public TipoVeiculo getTipo(){
            return tipo;
        }

        public void setTipoVeiculo(TipoVeiculo tipo){
            this.tipo = tipo;
        }

        @Override
        public double calculaValorTotal(){

            return getHoraEstacionamento() * 10.00;
        }

    }
}
