import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Human Sema = new Human();
        Sema.name = "Sema";
        Sema.surname = "Anufriev";
        Sema.age_of_birth = 2003;
        Sema.get_info();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый катет: ");
        double cathet1 = sc.nextDouble();
        System.out.println("Введите второй катет: ");
        double cathet2 = sc.nextDouble();
        RightTriangle Triangle = new RightTriangle(cathet1,cathet2);
        System.out.println("Длина гипотенузы: "+Triangle.get_hyp());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту: ");
        float h = scanner.nextFloat();
        System.out.println("Введите массу: ");
        float m = scanner.nextFloat();
        PotentialEnergy Energy = new PotentialEnergy();
        Energy.set_h(h);
        Energy.set_m(m);
        System.out.println("Потенциальная энергия для h = "+Energy.get_h()+" и m = "+ Energy.get_m()+" равняется: "+Energy.get_potentional_energy());
    }
}