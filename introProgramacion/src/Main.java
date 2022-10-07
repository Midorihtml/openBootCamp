// segunda parte: crear una clase coche
class Coche {
    int puertas;

    public Coche(int puertas){
        this.puertas = puertas;
    }

    public void incrementarPuertas(){
        this.puertas += 1;
    }
    public void verPuertas(){
        System.out.println("el numero de puertas es " + this.puertas);
    }
}
public class Main {
    // primera parte: crear una función que reciba 3 parametros e invocarla en el main dandole valores
    public static void main(String[] args) {
        suma(1,2,3);
        Coche miCoche = new Coche(3);
        miCoche.incrementarPuertas();
        miCoche.verPuertas();
    }

    public static void suma(int a, int b, int c) {
        System.out.println("suma = " + (a + b + c));
    }

}

