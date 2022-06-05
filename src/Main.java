public class Main {

    public static void main(String[] args) {
        System.out.println(goWalk(21, 1));
        System.out.println(goWalk(19, 27));
        System.out.println(goWalk(46, 10));
        System.out.println(goWalk(1, 2));
        System.out.println(goWalk(10, -10));
    }

    public static String goWalk(int ageOfPerson, int temperature) {
        if ((ageOfPerson > 20 && ageOfPerson < 45) && (temperature > -20 && temperature < 30)) {
            return "You can walk1";
        } else if ((ageOfPerson < 20) && (temperature > 0 && temperature < 28)) {
            return "You can walk2";
        } else if ((ageOfPerson > 45) && (temperature > -10 && temperature < 25)) {
            return "You can walk3";
        } else {
            return "Stay at home";
        }
    }

    public static int generateRandomAge() {
        
    }
}