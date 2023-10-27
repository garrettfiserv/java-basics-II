public class Calculator implements Calculatable{

    @Override
    public Integer add(Integer number1, Integer number2) {
        return (number1 + number2);
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        return (number1-number2);
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        return (number1*number2);
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        return (number1/number2);
    }
}
