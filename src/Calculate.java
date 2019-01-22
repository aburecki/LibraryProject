public class Calculate {
    public static void main (String[] args) {
        Calculator cal1 = new Calculator();

       double add = cal1.add(6,8);
       System.out.println(add);

       double subtract = cal1.subtract(6, 8);
       System.out.println(subtract);

       double multiply = cal1.multiply(6,8);
       System.out.println(multiply);

       double divide = cal1.divide(6,8);
       System.out.println(divide);

       double add3 = cal1.add(1,2,3);
       System.out.println(add3);

       System.out.println(cal1.subtract(1,2,3));
    }
}
