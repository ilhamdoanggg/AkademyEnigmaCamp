import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas{
public static void main(String[]args) throws IOException{

	BufferedReader baris = new BufferedReader(new InputStreamReader(System.in));
	System.out.print(/*"masukan jumblah data :"*/);
	String jumblahdata = baris.readLine();
	//String 
	int data = Integer.parseInt(jumblahdata);
	String [] nama = new String [data];
	String [] umur = new String [data];


	int number=1;
	for (int i=0;i<data; i++ ) {	
		System.out.println("masukan data ke " + number ++);
		System.out.print("masukan nama anada :");
		nama[i]=baris.readLine();

		System.out.print("masukan umur anada :");
		umur[i]=baris.readLine();

///		System.out.println();
//		if
		/*do {
			System.out.print("masukan umur anada :");
			try {

			}
		}
*/

//		umur[i]=Integer.parseInt(baris.readLine);
		}

	//output
			System.out.println("________________");
			System.out.println("|  nama | umur  |");
			System.out.println("________________");
			
			/*perulangan data yang di input*/

				for (int x=0, y=0; x < nama.length && y < umur.length ;x++, y++ )
					 {
						System.out.println("|"+nama[x]+ "|" +umur[y]+"|");
					}

			System.out.println("________________");
			}
}
/*	{
	InputStreamReader isr = new InputStreamReader(System.in);
   	BufferedReader baris = new BufferedReader(isr);

    	usia = new int[40];
    	name = new String[40];

	    for(int i=0;i<40;i++){
        	System.out.println("Enter the name of students");
        	name[i] = baris.readLine();
    	}             


	String [] nama = new String [nama];
	int [] usia  = new int [usia];

	BufferedReader baris = new BufferedReader(new InputStreamReader(System.in));

	String jumblahdata = baris.readLine("masukan jumblahdata :");
	System.out.print("masukan banyak data :" );
	int jumblahdata = baris.readLine();
	String jumblahdata = Integer.parseInt(baris.readLine());
	System.out.print("asd");

	for (int i=0 ; i<jumblahdata ; i++ ) {
		nama[i]=baris.readLine();
	}
*/