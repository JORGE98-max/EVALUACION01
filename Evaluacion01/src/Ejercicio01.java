import java.util.Scanner;

public class Ejercicio01 {
	
	static String nomcomp;

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese su nombre completo: ");
		 nomcomp = scan.nextLine();
		 
		 System.out.println(nomcomp);

	}

}
