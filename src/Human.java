import java.time.Year;

public class Human {
    public String name;
    public String surname;
    public int age_of_birth;
    public static int this_year = Year.now().getValue();
    public void get_info(){
        System.out.println("Имя: "+name);
        System.out.println("Фамилия: "+surname);
        System.out.println("Возраст: "+(this_year-age_of_birth));
    }
}
