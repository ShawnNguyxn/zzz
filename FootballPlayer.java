import java.util.ArrayList;

public class FootballPlayer {
    private String name;
    private int age;
    private String add;
    private double height;
    private double weight;
    private long salary;

    public FootballPlayer() {
    }

    public FootballPlayer(String name, int age, String add, double height, double weight, long salary){
        this.name = name;
        this.age = age;
        this.add = add;
        this.height = height;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAdd(){
        return add;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public long getSalary(){
        return salary;
    }

    public void display(){
        System.out.println("Name "+getName());
        System.out.println("Age "+getAge());
        System.out.println("Add "+getAdd());
        System.out.println("Height "+getHeight());
        System.out.println("Weight "+getWeight());
        System.out.println("Salary "+getSalary());
    }

    public static void sortSalary(ArrayList<FootballPlayer> v){
        ArrayList<FootballPlayer> p = new ArrayList<>();
    }

}
