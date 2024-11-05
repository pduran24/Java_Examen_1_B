import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaro la variable que se introducirá:
        int num;

        //Leo el número:
        System.out.print("Introducir un número entero: ");
        num = sc.nextInt();

        if (num%2==0) System.out.println("El número "+num+" es par."); //Si el resto de dividir entre 2 es 0, el número es par
        else System.out.println("El número "+num+" es impar."); //Si es distinto de 0, el número es impar


        sc.close();


    }

}
