import java.util.Scanner;
public class ChecadorSinal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a cor atual do sinal: ");
        int corAtual = sc.nextInt();
        sc.close();
        if(corAtual==1){
            System.out.println("A próxima luz do sinal será verde.");
        }else if(corAtual==2){
            System.out.println("A próxima luz do sinal será amarelo.");
        }else if(corAtual==3) {
            System.out.println("A próxima luz do sinal será vemelho.");
        }else{
            System.out.println("Cor inválida");
        }
    }
}
