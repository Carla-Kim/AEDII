package aed;

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
        // COMPLETAR
        return 0;
    }

    boolean tienePrimo(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean todosPares(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean esPrefijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }
}
