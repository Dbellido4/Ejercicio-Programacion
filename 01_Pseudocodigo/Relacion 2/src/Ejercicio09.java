import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		int digitos=1;
		Scanner x=new Scanner(System.in);
		System.out.print("Introduce el numero: ");
		int num=x.nextInt();
		while (num>10) {
			num/=10;
			digitos++;
		}
		System.out.print("El numero "+num+ " tiene "+ digitos + " digitos");
	}

}
