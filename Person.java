public class Person {

    

    String[] name = {"Mozzie", "Emma"};

    int[] age = {26, 25};

    String[] gender = {"Male", "Female"};

    

    static boolean married = false;

    static String nationality;

    

    public static boolean married() {

        

        return married = true;

    }

    public static void single() {

        

        married = false;

    }

    

    public static void filipino() {

        nationality = "Filipino";

    }

    public static void foreigner() {

        nationality = "Foreigner";

    }

}
