import java.util.Scanner;


public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        int num;
        int series=1;
        Scanner scanner=new Scanner(System.in);
        num= scanner.nextInt();
        while(num>0)
        {
            System.out.println(series);
            series+=2;
            num--;
        }

    }
}