import java.util.ArrayList;

public class FootballTeam {
    private String name;
    private long valuesTeam;
    private ArrayList<FootballPlayer> pl;

    public FootballTeam(){}
    public FootballTeam(String name, long valuesTeam, ArrayList<FootballPlayer> p){
        this.name = name;
        this.valuesTeam = valuesTeam;
        this.pl = p;
    }
    public String getName(){
        return name;
    }
    public long getValuesTeam(){
        return valuesTeam;
    }
    public void display(){
        System.out.println("Football Team "+getName());
        System.out.println("Team Values "+getValuesTeam());
        for (FootballPlayer temp:pl) {
            System.out.println("Team Players "+temp);
        }
    }

    public double avgAgePlayer(){
        double sum = 0;
        for (int i=0 ; i<pl.size(); i++){
            sum += pl.get(i).getAge();
        }
        return sum/pl.size();
    }

    public static ArrayList<FootballTeam> findMaxValuesTeam (ArrayList<FootballTeam> vt){
        double max = 0;
        ArrayList<FootballTeam> v = new ArrayList<>();
        for (int i=0; i<vt.size(); i++){
            if (vt.get(i).getValuesTeam()>max){
                max = vt.get(i).getValuesTeam();
            }
            for (int a=0; a<vt.size(); a++){
                if (vt.get(a).getValuesTeam()==max){
                    v.add(vt.get(a));
                }
            }
        }
        return v;
    }
}
