public class Main {
    public static void main(String[] args) {
        suma (30, 20, 10);

        Coche miCoche = new Coche();
        miCoche.masPuertas();
        System.out.println("Numero de puertas " + miCoche.puertas);
    }

    public static double suma(double value1, double value2, double value3) {
        double resultado = value1 + value2 + value3;
        return resultado;
    }
}

class Coche {
    int puertas;

    public void masPuertas(){
        this.puertas ++;

    }
}
