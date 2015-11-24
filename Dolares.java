import java.util.Scanner;
public class Dolares {

	public static void main(String[] args) 
	{
		Scanner nuevo=new Scanner(System.in);
		int i,x=0; float s=0; float[] num= new float[100];
		EjemploMenu Estado=new EjemploMenu();
		
		System.out.println("Por favor ingrese las siglas de un Estado de EUA: "+"\n(Si necesita ayuda escriba "+"help para"
				+ " o '?' desplegar una lista de los estados y sus siglas");
		Estado.N=nuevo.nextLine();
		Estado.Menu(Estado.N);
		System.out.println("Por favor ingrese cuantos datos va a sumar(no más de 100 campos permitidos)");
		x=nuevo.nextInt();
		
		for (i=0;i<x;i++)
		{
			System.out.println("Ingrese el precio en dolares: ");
			num[i]=nuevo.nextFloat();
		}
		for (i=0;i<x;i++)
		{
			s=s+num[i];
		}
		
		System.out.flush();
		System.out.flush();
		s=(float) (s*Estado.getTaxes());
		System.out.println("El Costo total con Taxas sera: "+s);
	}

}
