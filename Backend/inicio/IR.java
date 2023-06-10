package inicio;
public class IR {

    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario >= 1900.0 && salario <= 2800.0)
            System.out.println("o IR e de 7.5% e pode deduzir na declaracao valor de R$ 142");
        else if (salario > 2800.0 && salario <= 3751.0)
            System.out.println("o IR e de 15% e pode deduzir R$ 350");
        else if (salario > 3751.0 && salario <= 4664.0)
            System.out.println("o IR é de 22.5% e pode deduzir R$ 636");

    }
}