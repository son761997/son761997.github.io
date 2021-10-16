public class User {
    double weight;
    double height;
    double BMI;

    public void calculateBMIvoid() {
        double BMI = weight / (height * height);
         System.out.println(BMI);
    }

    public double calculateBMIdouble() {
        double BMI = weight / (height * height);
        return BMI;
    }

    public double inputcalculateBMIdouble( double weight , double height) {
       double BMI = weight / (height * height);
        return BMI;
   }
}


