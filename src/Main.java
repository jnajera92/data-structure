import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Genericos<String> datoGenerico = new Genericos<>();
        Genericos<Integer> datoGenericoInteger = new Genericos<>();

        ArrayList<Gato> datoLista = new ArrayList<>();


        datoGenerico.setContenido("cadena");

        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Utilidades.imprimirArray(numeros);

        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};
        Utilidades.imprimirArray(letras);

        Jaula<Gato> jaulaDeGato = new Jaula<>();
        jaulaDeGato.setAnimal(new Gato());

        Jaula<Perro> jaulaDePero = new Jaula<>();
        jaulaDePero.setAnimal(new Perro());

        jaulaDeGato.getAnimal().getNombre();
        jaulaDePero.getAnimal().getNombre();

        //FACTORIAL
        System.out.println(factorial(5));

        System.out.println(5 * 4 * 3 * 2);

        //Obtener serie de fibonacci


    }

    public static int factorial(int n) { //2
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    class Utilidades {
        public static <E> void imprimirArray(E[] array) {
            for (E e : array) {
                System.out.println(e);
            }
        }
    }

    static class Animal {
        public String nombre;

        public void getNombre() {
            System.out.println(nombre + " enjaulado!");
        }
    }

    static class Gato extends Animal {

        public Gato() {
            super.nombre = "gato";
        }
    }

    static class Perro extends Animal {

        public Perro() {
            super.nombre = "perro";
        }
    }


    static class Jaula<T extends Animal> { //wildCards

        private T animal;

        public void setAnimal(T animal) {
            this.animal = animal;
        }

        public T getAnimal() {
            return animal;
        }
    }
}
