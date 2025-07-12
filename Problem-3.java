import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int num;
        int series=1;
        Scanner scanner=new Scanner(System.in);
        num= scanner.nextInt();
        if(num%2==0)
            num--;
        while(num>0)
        {
            System.out.println(series);
            series+=2;
            num--;
        }

    }
}