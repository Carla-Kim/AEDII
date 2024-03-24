package aed;

class Debugging {
    boolean xor(boolean a, boolean b) {
        if(a != b) {
            return true;
         }
        return false;
    }
    //cambie la funcion completa por una condicional.

    boolean iguales(int[] xs, int[] ys) {
        boolean res = true;
        
        if(xs.length != ys.length) {
            return false;
        }

        for (int i = 0; i < xs.length; i++) {
            if (xs[i] != ys[i]) {
                res = false;
            }
        }
        return res;
    }
    //agrege la condicion que ambas listas sean de igual tamaño.

    boolean ordenado(int[] xs) {
        boolean res = true;
        for (int i = 0; i < xs.length - 1; i++) {
            if (xs[i] > xs[i+1]) {
                res = false;
            }
        }
        return res;
    }
    //arregle la indexacion que se iba siempre a uno mas del tamaño de la lista.

    int maximo(int[] xs) {
        int res = xs[0];
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > res) {
                res = xs[i];
            }
        }
        return res;
    }
    //correji la asignacion de res por un elemento que sea parte de la lista, agregue los corchetes que faltaban del if y agrege al res el xs[i] que le faltaba.

    boolean todosPositivos(int[] xs) {
        boolean res = true;
        for (int x : xs) {
            if (x > 0) {
                res = true;
            } else {
                return false;
            }
        }
        return res;
    }
    //correji que res sea true desde el inicio en el caso de la que lista sea vacia(?), arregle que una vez encuentren un negativo que retornen directamente false.

}
