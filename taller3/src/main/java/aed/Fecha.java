package aed;

public class Fecha {

    private int _dia;
    private int _mes;
    private Fecha _fecha;

    public Fecha(int dia, int mes) {
        if dia <= diasEnMes(mes) && dia > 0 && mes <= 12 && mes > 0 {
            set_dia(dia);
            set_mes(mes);
        }
    }

    void set_dia(int dia) {
        _dia = dia;
    }

    void set_mes(int mes) {
        _mes = mes;
    }

    public Fecha(Fecha fecha) {
        this._fecha = new Fecha(fecha.dia(), fecha.mes());
        // que
    }

    public Integer dia() {
        return _dia;
    }

    public Integer mes() {
        return _mes;
    }

    public String toString() {
        return str(_dia) + "/" + str(_mes);
        // qie
    }
    
    @Override
    public boolean equals(Object otra) {
       if otra.dia() == _dia && otra.mes() == _mes {
            return true;
       } else {
            return false;
       }

    }

    public void incrementarDia() {
        if _dia <= diasEnMes(_mes) && _dia > 0 {
            _dia += 1;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
