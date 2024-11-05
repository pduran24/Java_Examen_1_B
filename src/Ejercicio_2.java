import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int num; //Es el número que se introducirá, y se irá editando posteriormente
        int num2;//Como num se va editando, declaro num2 que se igualará a num una vez se lea, para mostrarlo finalmente
        int dig = 1;//Dig será el número de dígitos, inicializado en 1, ya que no hay ningún número con 0 dígitos

        System.out.print("Introducir un número entero: ");
        num = sc.nextInt();

        num2 = num;

        //el bucle parará cuando el cociente del número entre 10 sea 0
        while (num/10!=0){
            num /= 10;
            dig++; //voy aumentando dig en 1
        }

        System.out.println("El número "+num2+" tiene "+dig+" dígitos.");

        sc.close();

    }

}
