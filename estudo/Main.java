public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2);
        Circulo c2 = new Circulo(4);

        System.out.println("Área de c1: " + c1.area());
        System.out.println("Comprimento de c1: " + c1.comprimento());
        
        System.out.println("Área de c2: " + c2.area());
        System.out.println("Comprimento de c2: " + c2.comprimento());

    }
}