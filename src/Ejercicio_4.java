import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        double serie_restos = 0; //Serie restos será el número invertido
        int dig = 0; //Voy a contar los dígitos del número que introduzca el usuario

        System.out.print("Introducir un número a invertir: ");
        num = sc.nextInt();
        int num2 = num;

        //Determino primero los dígitos que tiene el número a invertir:
        while (num2/10!=0){
            num2 /= 10;
            dig++;
        }

        double factor = Math.pow(10,dig); //El factor será inicializado a la potencia de 10 elevada a la cantidad de dígitos que tiene el número introducido

        //este bucle for simplemente tomará los restos y los ira multiplicando por el factor
        for (int i=0; i<=dig; i++){
            int resto = num%10; //Guardo el resto
            serie_restos += resto * factor; //Se va guardando el número invertido: suma del resto * factor + el siguiente resto por el factor/10

            factor /= 10; //reduzco el factor un dígito, para que la suma se realice correctamente
            num /= 10; //actualizo el número
        }

        System.out.println("El número invertido es: "+serie_restos);

        sc.close();

    }


}
