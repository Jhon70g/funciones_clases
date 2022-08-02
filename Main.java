package open_bootcamp;

public class Main {
    public static void main(String[] args) {
        int resusltado;
        resusltado = suma(20,40,60);
        System.out.println(resusltado);

        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();
        System.out.println(miCoche.puertas);

    }
    public static int suma(int a, int b, int c) {
       return a + b + c;
    }
    class Coche {
       public int puertas = 6;
       public void incrementarPuerta() {
           this.puertas++;

       }


    }
}