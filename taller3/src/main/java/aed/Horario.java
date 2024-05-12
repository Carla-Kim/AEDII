package aed;

public class Horario {

    private int hora;
    private int minutos;

    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return this.hora;
    }

    public int minutos() {
        return this.minutos;¿
    }

    @Override
    public String toString() {
        return str(this.hora) + "/" + str(this.minutos);
    }

    @Override
    public boolean equals(Object otro) {
        if otro.hora() == this.hora && otro.minutos() == this.minutos {
            return true;
        } else {
            return false;
        }
    }

}
