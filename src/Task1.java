public class Task1 {

    // variables declared at the top
    static float earthWeightPanashe = 70.0f;
    static float marsGravityPanashe = 0.38f;
    static float marsWeightPanashe;

    static double marsWeightDoublePanashe;
    static int marsWeightIntPanashe;
    static char marsWeightCharPanashe;
    static int charMathResultPanashe;

    public static void main(String[] args) {

        // calculate mars weight
        marsWeightPanashe = earthWeightPanashe * marsGravityPanashe;
        System.out.println("Mars weight (float): " + marsWeightPanashe);

        // assign to double
        marsWeightDoublePanashe = marsWeightPanashe;
        System.out.printf("Mars weight as double (4 decimals): %.4f\n", marsWeightDoublePanashe);

        // cast double to int
        marsWeightIntPanashe = (int) marsWeightDoublePanashe;
        System.out.println("Mars weight cast to int: " + marsWeightIntPanashe);

        // cast int to char
        marsWeightCharPanashe = (char) marsWeightIntPanashe;
        System.out.println("Int cast to char: " + marsWeightCharPanashe);

        // math operation on char
        charMathResultPanashe = marsWeightCharPanashe + 10;
        System.out.println("Char plus 10 result stored in int: " + charMathResultPanashe);
    }
}

