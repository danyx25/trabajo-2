
import java.util.Scanner;


public class arreglo {
    int aux[][]=new int [3][3];
    int aux1[][]=new int [3][3];
    public void arreglo1(){
    int [][]num=new int [3][3];
    int l=1;
        System.out.println("La primera matriz está conformado por: ");
        for (int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                num [i][j]=l;
                aux[i][j]=num[i][j];
                l++;
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void arreglo2(){
        System.out.println("Añade los números a tu segunda matriz: ");
        Scanner ent=new Scanner(System.in);
        int [][]arreglo2=new int [3][3];
        for(int i=0;i<arreglo2.length;i++){
            for(int j=0;j<arreglo2.length;j++){
                arreglo2 [i][j]=ent.nextInt(); 
                aux1[i][j]=arreglo2[i][j];
            }
    
        }
        System.out.println("La segunda matriz está conformado por: ");
         for(int i=0;i<arreglo2.length;i++){
            for(int j=0;j<arreglo2.length;j++){
                System.out.print(arreglo2 [i][j]+" ");
            }System.out.println();
        }
    }
    public void suma_arreglo_más_arreglo2(){
        int arreglo3[][]=new int [3][3];
        System.out.println("La suma de las matrices es: ");
        for(int i=0;i<arreglo3.length;i++){
            for(int j=0;j<arreglo3.length;j++){
                arreglo3[i][j]=aux[i][j]+aux1[i][j];
                System.out.print(arreglo3[i][j]+" ");
            }System.out.println();
        }
    }
}
