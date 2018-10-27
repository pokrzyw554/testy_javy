public class main {
    public static void main(String[] args) {

        System.out.println("witam, trzaśniemy sobie program");
        System.out.println("program ma za zadanie przekazać tablice elementow do metody");
        System.out.println("a metoda ma robic swoje");
        String y = "test;";
        int wiek = 23;
        metoda(y, wiek);

        System.out.println("x: " + y);
    }

    public static int metoda(String y, int wiek) {
        System.out.println("y: " + y);
        System.out.println("masz " +wiek);
        y = "Ela";
        System.out.println("y: " + y);
        return 0;
    }
}
