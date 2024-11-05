import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        //n1 y n2 los declaro en long porque si la cadena es muy larga, los números pueden ser muy grandes
        long n1 = -1;//Inicializada en -1 para que el primer número de la serie sea 0, ya que -1 + 1 = 0
        long n2 = 1;

        //se introduce la longitud de la serie, pero con control, ya que la longitud de la cadena no puede ser 0 o negativa
        do {
            System.out.print("Escribir el número de términos de la serie de Fibonacci (número positivo o mayor que 0): ");
            num = sc.nextInt();
        } while(num<=0);

        //Como sabemos el número de interacciones, declaro un bucle for para ir rellenando la cadena
        for (int i=0; i<num; i++){
            //El siguiente (next) será igual a la suma de n1 (inicializado en -1) y n2 (inicializado en 1)
            long next = n1 + n2;
            //actualizo tanto n2 como n1
            n1 = n2;
            n2 = next;

            System.out.print(n2+" ");

        }

        sc.close();
    }
}


