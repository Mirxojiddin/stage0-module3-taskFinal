package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int res;
        res = number%10;
        number /=10;
        res +=number%10;
        number /=10;
        res +=  number%10;
        number /=10;
        res +=  number%10;
        
        System.out.println(res);

    }
}
