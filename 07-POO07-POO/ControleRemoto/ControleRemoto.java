public class ControleRemoto {
    int volume;
    boolean ligado = false;
    int canal;

    Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void aumentarVolume() {
        if (!this.ligado) {
            System.out.println("Ligue a TV!");
        } else {
            if (this.volume > 99) {
                System.out.println("Volume Máximo!");
            } else {
                this.volume++;
            }
        }
    }

    public void diminuirVolume() {
        if (!this.ligado) {
            System.out.println("Ligue a TV!");
        } else {
            if (this.volume < 1) {
                System.out.println("MUDO!");
            } else {
                this.volume--;
            }
        }
    }

    public void aumentarCanal() {
        if (!this.ligado) {
            System.out.println("Ligue a TV!");
        } else {
            this.canal++;
        }
    }

    public void diminuirCanal() {
        if (!this.ligado) {
            System.out.println("Ligue a TV!");
        } else {
            if (this.canal < 1) {
                System.out.println("Canal inexistente!");
            } else {
                this.canal--;
            }
        }
    }

    public void status() {
        System.out.println("Volume: " + this.volume + "\nCanal: " + this.canal + "\nLigado? " + this.ligado);
    }
}

