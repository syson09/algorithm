import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int[] Narray = new int[N];
        for(int i = 0; i<N; i++){
            Narray[i] = sc.nextInt();
            if(max < Narray[i]){
                max = Narray[i];
            }
        }
        double sum = 0;
        for(int i = 0; i<N; i++){
            sum += Narray[i]/(double)max*100;
        }
        System.out.println(sum/N);
    }
}