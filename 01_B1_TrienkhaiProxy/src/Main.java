public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double result = proxy.add(1, 2);
        System.out.println("1.0 + 2.0 = " + result);
        result = proxy.div(2, Double.MAX_VALUE);
        System.out.println("2.0 + Double.MAX_VALUE = " + result);
        result = proxy.mul(2, Double.MAX_VALUE);
        System.out.println("2.0 + Double.MAX_VALUE = " + result);
    }
}
