import java.util.ArrayList;
import java.util.List;

public class PrimeFactorGenerator
{
    public List<Integer> generate(int number)
    {
        List<Integer> list = new ArrayList<Integer>();
        for (int index = 2; index <= number; index++){
            while(number != index){
                if(number % index != 0){
                    break;
                }
                list.add(index);
                number = number/index;
            }
        }
        list.add(number);
        return list;
    }
}
