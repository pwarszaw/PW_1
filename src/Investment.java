public class Investment {

    public static void main(String[] args) {

        double invest = 14_000;
        System.out.println("Wartość inwestycji to: " + invest);

        invest *= 1.4;
        System.out.println("Po pierwszym roku inwestycja zwiększyła się o 40% i wynosi: " + invest);

        invest -= 1500;
        System.out.println("W drugim roku inwestycja straciła 1500 i wynosi: " + invest);

        invest *= 1.12;
        System.out.println("W trzecim roku inwestycja zwiększyła się o 12% i wynosi: " + invest);

    }
}
