public class App {
    public static void main(String[] args) throws Exception {
        double calculo =0;

        for(double i = 1; i <= 100; i++){
            calculo += 1/i;
        }
        System.out.printf("%.2f\n", calculo);
    }
}
