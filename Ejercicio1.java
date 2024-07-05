import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        double venta[]= new double[30];
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese las ventas del mes");
            for(int i=0;i<venta.length;i++){
                System.out.println("Venta "+(i+1));
                venta[i]= sc.nextDouble();
                
            }
            int s=0;
            int total=0;
            while (s<30) {
                if(venta[s]>=2000){
                    System.out.println(""+ venta[s]);
                    total++;
                }
                s++;
            }
        System.out.println("total de ventas es mayores a 2000"+ total);
    }
}