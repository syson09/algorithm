import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for(int i = 0; i<N; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 1; i < N ; i++){
            for(int j = 0; j < N - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}