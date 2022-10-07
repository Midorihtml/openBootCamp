public class Main {
    public static void main(String[] args) {
        // primera parte crear un if que evalue si la variable numeroIf es positivo, negativo o cero
        var numeroIf = 20;
        if(numeroIf == 0){
            System.out.println("numeroIf es " + numeroIf);
        }else if(numeroIf < 0){
            System.out.println("es negativo");
        }else{ System.out.println("es positivo");};

        // segunda parte crea un bucle while, con la condicion de que numeroWhile < 3
        // incrementar el valor de la variable en 1 cada vez que se ejecute
        // mostrarlo por pantalla cada vez que se ejecute.
        System.out.println("-----------");
        int numeroWhile = 1;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("numeroWhile = " + numeroWhile);
        }

        // tercera parte crear un bucle do while con la misma estructura que el while
        // éste bucle solo debe ejecutarse una vez
        System.out.println("-----------");
        int numeroWhile2 = 3;
        do{
            numeroWhile2++;
            System.out.println("numeroWhile2 = " + numeroWhile2);
        }while(numeroWhile2 == 3);

        //cuarta parte: crear un bucle for, con la variable numeroFor = 0;
        // con la condicion de que sea <= 3, e irá incrementando su valor en 1
        // con cada ejecucion. Debera mostrarse en pantalla
        System.out.println("-----------");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor = " + numeroFor);
        }

        //quinta parte: crea un Switch con la variable estacion, y distintos case
        //para todas las estaciones del año. De acuerdo al case se debera mostrar
        //por pantalla la estacion actual. Se debera poner un default para
        //cuando la variable no sea una estacion.
        System.out.println("-----------");

        var estacion = "lalal";
        switch (estacion){
            case "primavera":
                System.out.println(estacion);
                break;
            case "verano":
                System.out.println(estacion);
                break;
            case "otoño":
                System.out.println(estacion);
                break;
            case "invierno":
                System.out.println(estacion);
                break;
            default:
                System.out.println("no se reconoce la estacion");
        }
    }
}