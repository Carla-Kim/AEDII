package aed;

public class Horario {

    private int _hora;
    private int _minutos;

    public Horario(int hora, int minutos) {
        if hora > -1 && hora < 24 && min > -1 && min < 59 {
            set_hora(hora);
            set_minutos(minutos);
        }
    }

    void set_hora(int hora) {
        _hora = hora;
    }

    void set_minutos(int minutos) {
        _minutos = minutos;
    }

    public int hora() {
        return _hora;
    }

    public int minutos() {
        return _minutos;
    }

    @Override
    public String toString() {
        return str(_hora) + "/" + str(_minutos);
    }

    @Override
    public boolean equals(Object otro) {
        if otro.hora() == _hora && otro.minutos() == _minutos {
            return true;
        } else {
            return false;
        }
    }

}
