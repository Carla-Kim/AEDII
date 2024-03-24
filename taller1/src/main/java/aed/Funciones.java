package aed;

import java.util.ArrayList;
import java.util.List;

class Funciones {
    int cuadrado(int x) {
        int res = x * x;
        return res;
    }

    double distancia(double x, double y) {
        double res = Math.sqrt(x*x + y*y);
        return res;
    }

    boolean esPar(int n) {
        boolean res = n % 2 == 0;
        return res; 
    }

    boolean esBisiesto(int n) {
        boolean res = (n % 4 == 0) && ((n % 100 != 0) || (n % 400 == 0));
        return res;
    }

    int factorialIterativo(int n) {
        int res = 1;
        if(n == 0) {
            res = 1;
        } else {
            for (int i = 1; i <= n; i++) {;
                res = res * i;
            }
        }
        return res;
    }

    int factorialRecursivo(int n) {
        if (n >= 1) {
            return n * factorialRecursivo(n - 1);
        } else {
            return 1;
        }
    }

    boolean esPrimo(int n) {
        double euclides = Math.floor(Math.sqrt(n));
        
        if (n < 2) {
            return false;
        }

        for(int i = 2; i <= euclides; i++){;
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for(int numero : numeros) {
            res += numero;
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int position = 0;
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] == buscado) {
                position = i;
            }
        }
        return position;
    }

    boolean tienePrimo(int[] numeros) {
        for(int numero : numeros) {
            if(esPrimo(numero) == true) {
                return true;
            }
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        boolean sonPares = false;
        for(int numero : numeros) {
            if(esPar(numero) == true) {
                sonPares = true;
            } else {
                return false;
            }
        }
        return sonPares;
    }

    boolean esPrefijo(String s1, String s2) {
        boolean verificador = false;

        if(s1.length() > s2.length()){
            return false;
        }

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                verificador = true;
            } else {
                return false;
            }
        }
        return verificador;
    }

    boolean esSufijo(String s1, String s2) {
        boolean verificador = false;
        int s1Length = s1.length();
        int s2Length = s2.length();


        if(s1Length > s2Length){
            return false;
        }

        for(int i = 0; i < s1Length; i++) {
            if(s1.charAt(s1Length - i -1) == s2.charAt(s2Length - i -1)) {
                verificador = true;
            } else {
                return false;
            }
        }
        return verificador;
        
    }
}
