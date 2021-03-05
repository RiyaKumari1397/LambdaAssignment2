import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Streams {
    public static void main(String[] args){
     List<Integer> list = new Random().ints(1,150).limit(100).boxed().collect(Collectors.toList());
     System.out.println(list);

     List<Integer> primes=list.stream().filter(Java8Streams::isPrime).collect(Collectors.toList());
     System.out.println("List of prime numbers from the above list are:\n" + primes);


}
public static boolean isPrime(int number)
{
    for(int i=2 ; i<=number/2 ;i++ )
    {
        if(number % i ==0)
        {
            return false;
        }
    }
    return true;
}
}
