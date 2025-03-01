import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] array = new int[input.length()];
        for(int i = 0; i < input.length(); i++){
            array[i] = input.charAt(i) - '0';
        }
        for(int i = 0; i < array.length; i++){
            int max = i;
            for(int j = i ; j < array.length; j++){
                if(array[max] <= array[j]){
                    max = j;
                }
            }
            if(array[max] != array[i]){
                int temp = array[i];
                array[i] = array[max];
                array[max] = temp;
            }
        }
        for(int num : array){
            System.out.print(num);
        }

    }
}