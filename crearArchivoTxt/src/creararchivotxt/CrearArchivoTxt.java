/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creararchivotxt;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Privado
 */
public class CrearArchivoTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String ruta = "C:\\Users\\privado\\Documents\\TallerJava\\holamundo.txt";
        File archivo =crearArchivo(ruta);        
        String cadena="";        
        BufferedWriter bw;
        if(archivo.exists()) {                
                cadena=solicitaCadena();
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(cadena);
                System.out.println("Ya existe el archivo");
        } else {
                cadena=solicitaCadena();
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(cadena);
                System.out.println("No existe");
        }
        archivoOdirectorio(archivo);       
        bw.close();
        leerArchivo(archivo);
    }
    public static void leerArchivo(File archivo) throws FileNotFoundException{
        Scanner leeArchivo=new Scanner(archivo);
        while (leeArchivo.hasNextLine()) {
            String linea=leeArchivo.nextLine();
            System.out.println (linea); 
        }
        
    }
    public static File crearArchivo(String ruta){
        File archivo = new File(ruta);
        return archivo;
    }
    public static String solicitaCadena(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Escribe la cadena de texto");
        return leer.nextLine();
    }
    public static void archivoOdirectorio(File archivo){
        if(archivo.isDirectory()){
            System.out.println("Es un directorio");
        }else{
            System.out.println("Es un archivo");
        }
    }
}
