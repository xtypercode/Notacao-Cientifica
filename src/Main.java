import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if(num > 0.0d){
            System.out.printf("+%.4E", num);
        }else{
            System.out.printf("%.4E", num);
        }
    }
}
