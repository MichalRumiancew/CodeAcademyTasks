package methods;

public class Task12IsCube {
    public static boolean isCube(int number) {

        double cube = Math.cbrt(number);
        return number % cube == 0 ? true : false;
        //if number % cube ==0{
        //else{return false;}

    }

    public static void main(String[] args) {
        int number = Task7.getNumberFromInput();
        final String descriptions = "jest sześcianem ";
if (isCube(number)){


    System.out.println(descriptions);
        }
else System.out.println("Nie "+ descriptions.toLowerCase());

    }
}

