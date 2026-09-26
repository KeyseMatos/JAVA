publuc class Moto extends Veiculo{

    private TipoVeiculo tipo;

    public Moto(String placa, int horaEstacionamento){

        super(placa, horaEstacionamento);

        this.tipo = TipoVeiculo.MOTO;

        public TipoVeiculo getTipo(){
            return tipo;
        }

        public void setTipoVeiculo(TipoVeiculo tipo){
            this.tipo = tipo;
        }

        @Override
        public double calculaValorTotal(){

            return getHoraEstacionamento() * 5.00;
        }

    }
}
