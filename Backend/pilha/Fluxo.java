public class Fluxo{
     
    public static void main(String[] args) 
    {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | MinhaExcecao e) {
            e.getStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() 
    {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() 
    {
        System.out.println("Ini do metodo2");
        
        // ArithmeticException exception = new ArithmeticException();
        throw new MinhaExcecao("Deu ruim");

        //System.out.println("Fim do metodo2");
    }
}