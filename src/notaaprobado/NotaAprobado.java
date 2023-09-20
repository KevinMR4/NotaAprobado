package notaaprobado;
import java.util.Scanner;
/**
 *
 * @author KEVIN
 */
public class NotaAprobado {
    public void potaxieaprobade(){
        int nota;
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce la nota a analizar");
        nota=ent.nextInt();
        if(nota>5){
            System.out.println("Prueba superada");
        }else{
            System.out.println("No pasaste pa xdxdxdxd");
        }
    }
    public static void main(String[] args) {
        NotaAprobado pota = new NotaAprobado();
        pota.potaxieaprobade();
        
    }
    
}
