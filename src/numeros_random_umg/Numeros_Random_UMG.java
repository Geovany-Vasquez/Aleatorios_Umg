package numeros_random_umg;

import java.io.BufferedWriter;
import java.util.Random;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Collections;

/* * @author Geovany Vasquez
 */
public class Numeros_Random_UMG {

    public static void agregar() {
        Random rd = new Random();
        /*
    
         */
        int r = 0;
        try {
            String ruta = "Aleatorio.txt";
            File file = new File(ruta);
            String ruta2 = "Aleatorio2.txt";
            File file2 = new File(ruta2);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            FileWriter fz = new FileWriter(file2);
            int desde = -1000000, hasta = 1000000;
            int erray[];
            erray = new int[1000000];

            int casa[];
            casa = new int[1000000];
            try ( BufferedWriter bz = new BufferedWriter(fz)) {
                try ( BufferedWriter bw = new BufferedWriter(fw)) {

                    for (int i = 0; i <= 999999; i++) {
                        r = rd.nextInt(hasta - desde + 1) + desde;
                        erray[i] = r;

                             System.out.println(i+", "+erray[i]);
                        fw.write(r + "\n");
                        fz.write(r + ",  ");
                    }
                     // System.out.println(i + "| " + r);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ver(){
        	Scanner File = null;
		ArrayList<Integer> list = new ArrayList<Integer>();
        try{
            File = new Scanner(new File("Aleatorio.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(File.hasNext()){
			if (File.hasNextInt()) list.add(File.nextInt());
			else File.next();
		}
		
		Collections.sort(list);
		
		for (Integer i: list) System.out.println(i);
      
          /*String texto;
           while ((texto = obj.readLine()) != null)
           System.out.println(texto);*/
    }//catch(Exception e) {
           // e.printStackTrace();
   
    public static void menu() {
        Scanner in = new Scanner(System.in);
        int a;
        do {

            System.out.println("1, Aleatorio");
            System.out.println("2, Leer y ordenar");
            System.out.println("3, Salir");
            System.out.println("Digite opcion: ");
            a = in.nextInt();

            switch (a) {
                case 1:
                    agregar();
                    break;

                case 2:
                    ver();
                    break;

            }
        } while (a != 3);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

}
