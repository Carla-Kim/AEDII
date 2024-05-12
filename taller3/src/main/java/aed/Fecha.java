package aed;

public class Fecha {

    private int dia;
    private int mes;
    private Fecha fecha;

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        this.dia = fecha.dia;
        this.mes = fecha.mes;
    }

    public Integer dia() {
        return dia;
    }

    public Integer mes() {
        return mes;
    }

    public String toString() {
        return str(dia) + "/" + str(mes);
        // qie
    }
    
    @Override
    public boolean equals(Object otra) {
       if otra.dia() == this.dia && otra.mes() == this.mes {
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
