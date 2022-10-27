
import java.util.Scanner;
public class BMQuestao01 {

    public static void main(String[] args) {
        
        int n;
 
 Scanner entrada = new Scanner(System.in);
 
    System.out.print("Digite UM numero: ");
        n = entrada.nextInt();
 
 if (n==1)
     System.out.println("Segunda feira");
 if (n==2)
     System.out.println("Terça feira");
 if (n==3)
     System.out.println("Quarta feira");
 if (n==4)
     System.out.println("Quinta feira");
 if (n==5)
     System.out.println("Sexta feira");
 if (n==6)
     System.out.println("Sabado");
 if (n==7)
     System.out.println("Domingo");
 if (n>7 || n<1)
     System.out.println("NUMERO INVALIDO");
        
    }
}