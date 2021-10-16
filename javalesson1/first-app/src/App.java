public class App {
    public static void main(String[] args)  {
        User user1 = new User();
        user1.weight = 105;
        user1.height = 1.8;

        System.out.println("\n user's BMI(void): ");
        user1.calculateBMIvoid();

        System.out.println("\n user's BMI(double): " + user1.calculateBMIdouble());

        System.out.println("\n user's BMI (input double) " + user1.inputcalculateBMIdouble(105, 1.8));

       
    }
}
