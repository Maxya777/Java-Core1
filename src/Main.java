public class Main {
    public static void main(String[] args) {

//            Calculator calc = Calculator.instance.get();
//
//                int a = calc.plus.apply(1, 2);
//                int b = calc.minus.apply(1, 1);
//                int c = calc.divide.apply(a, b);

        // Ошибка ArithmeticException возникла по причине того, что на 0 делить нельзя
        //int a = 3; int b = 0; int c = a/b = 3/0;
        // Чтобы ее решить, нужно чтобы int b в результате вычитания небыло равно 0.
        // Можно так же воспользоваться обработкой ошибки с помощью try{} catch{}
        // Либо отредактировать в классе Calculator бинарный оператор:
        // BinaryOperator<Integer> divide = (x, y) -> y > 0 ? x / y : y < 0 ? x / y : 0;

        Calculator calc = Calculator.instance.get();
        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.divide.apply(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Делить на 0 нельзя");
        }
    }
}
