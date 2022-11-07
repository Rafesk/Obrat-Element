import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //a= 351 n= 123202
        System.out.println("\r\nTask_5");
        System.out.println("Введите a и n: ");
        Task_5(in.nextInt(),in.nextInt());
    }
    public static void Task_5(int a, int n){
        int k = n;
        int q = 1;
        int r = n;
        int rnext = r;
        int x1 = 1; int x2=0; int y1 = 0; int y2 = 1; int x = 0;int y= 0;
        while (rnext!=0){
            n=r;
            q = a/n;
            r = a-(a/n)*n;
            a= n;
            x = x1-q*x2;
            y = y1-q*y2;
            x1=x2;
            x2=x;
            y1=y2;
            y2=y;
            rnext = n-(n/r)*r;

        }
        if(r==1){
            System.out.println(rnext);
            System.out.printf("Ответ: %d\r\n", Math.abs(x)%k);
        }
        else{
            System.out.println(rnext);
            System.out.printf("Ответ: %d\r\n", x);
        }

    }

}

