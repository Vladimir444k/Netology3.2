public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = 1.87;
        int bodyMasIndex = service.calculate(index);
        System.out.println(bodyMasIndex);
    }
}
