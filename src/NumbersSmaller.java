import java.util.Scanner;

public class NumbersSmaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i< size;i++)
        {
            arr[i]= scanner.nextInt();
        }
        int[] result = new int[size];
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
                result[i]=count;
            }
        }
        for(int i=0;i< size;i++)
        {
            System.out.println(result[i]);
        }
    }
}
