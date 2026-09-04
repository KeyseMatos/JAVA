public class Televisao {

    int volume;
    boolean ligado;
    int canal;

    public Televisao() {
        this.volume = 0;
        this.ligado = false;
        this.canal = 1;
    }

    public static void main(String[] args) {

        Televisao tv = new Televisao();

        ControleRemoto cr = new ControleRemoto(tv);
        cr.ligar();
        cr.aumentarVolume();
        cr.diminuirCanal();
        cr.aumentarCanal();

        cr.status();
    }
}
