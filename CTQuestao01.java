import java.util.Scanner;
public class CTQuestao01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int idade = scan.nextInt();
        if (idade<16) {
            System.out.println("Não pode votar");
        } else if(idade>=16 && idade<=17 || idade>65){
            System.out.println("Votar facultativo");
        } else if(idade>=18 && idade<=65){
            System.out.println("Votar obrigatorio");
        }
    }    
}
