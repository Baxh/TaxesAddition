import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EjemploMenu {
	public String N;
	public float Taxes;
	EjemploMenu()
	{
		Taxes=0;
		N=null;
	}
	public void setN(String n) {
		N = n;
	}

	public String Menu (String N)
	{
		switch (N)
		{
		case "AL" : Taxes=(float) 1.0891;break;
		case "AK" : Taxes=(float) 1.0176;break;
		case "AZ" : Taxes=(float) 1.0817;break;
		case "AR" : Taxes=(float) 1.0926;break;
		case "CA" : Taxes=(float) 1.0844;break;
		case "CO" : Taxes=(float) 1.0744;break;
		case "CT" : Taxes=(float) 1.0635;break;
		case "DE" : Taxes=(float) 1 ;break;
		case "FL" : Taxes=(float) 1.0665;break;
		case "GA" : Taxes=(float) 1.0696;break;
		case "HI" : Taxes=(float) 1.0435;break;
		case "ID" : Taxes=(float) 1.0601;break;
		case "IL" : Taxes=(float) 1.0819;break;
		case "IN" : Taxes=(float) 1.0700;break;
		case "IA" : Taxes=(float) 1.0678;break;
		case "KS" : Taxes=(float) 1.0820;break;
		case "KY" : Taxes=(float) 1.0600;break;
		case "LA" : Taxes=(float) 1.0891;break;
		case "ME" : Taxes=(float) 1.0550;break;
		case "MD" : Taxes=(float) 1.0600;break;
		case "MA" : Taxes=(float) 1.0625;break;
		case "MI" : Taxes=(float) 1.0600;break;
		case "MN" : Taxes=(float) 1.0720;break;
		case "MS" : Taxes=(float) 1.0707;break;
		case "MO" : Taxes=(float) 1.0781;break;
		case "MT" : Taxes=(float) 1 ;break;
		case "NE" : Taxes=(float) 1.0680;break;
		case "NV" : Taxes=(float) 1.0794;break;
		case "NH" : Taxes=(float) 1 ;break;
		case "NJ" : Taxes=(float) 1.0697;break;
		case "NM" : Taxes=(float) 1.0735;break;
		case "NY" : Taxes=(float) 1.0848;break;
		case "NC" : Taxes=(float) 1.0690;break;
		case "ND" : Taxes=(float) 1.0656;break;
		case "OH" : Taxes=(float) 1.0710;break;
		case "OK" : Taxes=(float) 1.0770;break;
		case "OR" : Taxes=(float) 1 ;break;
		case "PA" : Taxes=(float) 1.0634;break;
		case "RI" : Taxes=(float) 1.0700;break;
		case "SC" : Taxes=(float) 1.0713;break;
		case "SD" : Taxes=(float) 1.0583;break;
		case "TN" : Taxes=(float) 1.0945;break;
		case "TX" : Taxes=(float) 1.0825;break;
		case "UT" : Taxes=(float) 1.0668;break;
		case "VT" : Taxes=(float) 1.0614;break;
		case "VA" : Taxes=(float) 1.0563;break;
		case "WA" : Taxes=(float) 1.0889;break;
		case "WV" : Taxes=(float) 1.0607;break;
		case "WI" : Taxes=(float) 1.0543;break;
		case "WY" : Taxes=(float) 1.0547;break;
		
		case "help" : System.out.println("Los Estados se presentaran a continuacion"); 
		File archivo=null;
		FileReader fr=null;
		BufferedReader br=null;
		try 
		{
			archivo = new File("States.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			
			String Linea;
			while ((Linea=br.readLine())!=null)
				System.out.println(Linea);
			fr.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		;Dolares.main(null);break;
		
		case "?" : System.out.println("Los Estados se presentaran a continuacion"); 
		try 
		{
			archivo = new File("States.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			
			String Linea;
			while ((Linea=br.readLine())!=null)
				System.out.println(Linea);
			fr.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		;Dolares.main(null);break;
		
		}
		// TODO Auto-generated method stub
		return N;		
	}
	public float getTaxes() {
		return Taxes;
	}

}
