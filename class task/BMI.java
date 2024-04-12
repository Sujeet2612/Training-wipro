import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in kg and height in meter");
        float w = sc.nextFloat();
        float h = sc.nextFloat();
        float bmi = w / (h*h);
        if(bmi < 18.5){
            System.out.println("Under weight");
        }
        else if(bmi >= 18.5 && bmi < 25){
            System.out.println("Normal weight");
        }
        else if(bmi >=25 && bmi < 30){
            System.out.println("Over weight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
