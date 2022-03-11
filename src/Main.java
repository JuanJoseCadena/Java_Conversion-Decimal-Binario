import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Selecciona la conversión que deseas realizar (sin introducir el punto):");
		System.out.println("1. Binario a decimal");
		System.out.println("2. Decimal a binario");
		
		Scanner lector = new Scanner(System.in);
		Scanner lectornum = new Scanner(System.in);
		int comprobador = 0;
		String cadena = "";
		try {
		cadena = lector.nextLine();
		if (cadena.trim().equals("")) 
		{
			System.out.println("No se ha detectado ningun valor. Por favor, vuelve a intentarlo introduciendo 1 o 2 según la opción que desees emplear");
			System.exit(0);
		}
		comprobador = Integer.parseInt(cadena);
		}
		catch(Exception e) {
			System.out.println("Se ha detectado un valor inesperado. Por favor, vuelve a intentarlo introduciendo 1 o 2 según la opción que desees emplear");
			System.exit(0);
		}

		long decimal = 0;
		long aux;
		String binario="";
		
		
		if (comprobador==1) 
		{
			System.out.println("Introduzca el número binario (sin comas, puntos ni espacios)");
			long numbinario = 0;
			
			try {
			binario = lectornum.nextLine();
			
			if (binario.trim().equals(""))
			{
				System.out.println("No se ha detectado ningun valor. Por favor, vuelve a intentarlo introduciendo un número binario");
				System.exit(0);
			}
			
			numbinario = Long.parseLong(binario);
			}
			catch(Exception e) {
				System.out.println("El valor introducido no corresponde a un número binario, por favor, vuelve a intentarlo introduciendo un número binario");
				System.exit(0);
			}
			
			aux = decimal;
			int count = 1;
			
			if(binario.matches(".*[2-9].*")) 
			{
				System.out.println("El valor introducido no corresponde a un número binario, por favor, vuelve a intentarlo introduciendo un número binario");
				System.exit(0);
			}
			
			while(numbinario>0) 
			{
				aux = numbinario %2;
				decimal = decimal+aux*count;
				numbinario = numbinario/10;
				count=count*2;
			}
			
			System.out.println("El número binario " + binario + " es igual a " + decimal + " en sistema decimal");
			
		}
		else
			if (comprobador==2) 
			{
				System.out.println("Introduzca el número decimal entero (sin comas, puntos ni espacios)");
				String numero = "";
				
				try {
				numero = lectornum.nextLine();
				
				if (numero.trim().equals(""))
				{
					System.out.println("No se ha detectado ningun valor. Por favor, vuelve a intentarlo introduciendo un número decimal entero");
					System.exit(0);
				}
				
				decimal = Long.parseLong(numero);
				}
				catch(Exception e) {
					System.out.println("El valor introducido no corresponde a un número decimal entero, por favor, vuelve a intentarlo introduciendo un número decimal entero");
					System.exit(0);
				}
				
				aux = decimal;
				
				while(aux>0) 
				{
					binario = aux % 2 + binario;
					aux= aux/2;
				}
				
				System.out.println("El número decimal " + decimal + " es igual a " + binario + " en sistema binario");
				
			}
			else 
			{
				System.out.println("Se ha detectado un valor inesperado. Por favor, vuelve a intentarlo introduciendo 1 o 2 según la opción que desees emplear");
			}
	}

}
