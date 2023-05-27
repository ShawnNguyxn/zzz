import java.util.ArrayList;

public class FootballLeague {
    private String name;
    private long moneyBonus;
    private ArrayList<FootballTeam> ft;

    public FootballLeague(){
    }
    public FootballLeague(String name, long moneyBonus, ArrayList<FootballTeam> ft){
        this.name = name;
        this.moneyBonus = moneyBonus;
        this.ft = ft;
    }
    public String getName(){
        return name;
    }
    public long getMoneyBonus(){
        return moneyBonus;
    }
    public void display(){
        System.out.println("League Name "+getName());
        System.out.println("League Bonus "+getMoneyBonus());
        for (FootballTeam temp:ft) {
            System.out.println("League Team "+temp);
        }
    }
    public static ArrayList<FootballLeague> getMaxLeagueTeam(ArrayList<FootballLeague> vt){
        long max =0;
        ArrayList<FootballLeague> v = new ArrayList<>();
        for (int i=0; i<vt.size(); i++){
            if (vt.get(i).ft.size()>max){
                max = vt.get(i).ft.size();
            }
        }
        for (int a=0; a< vt.size(); a++){
            if (vt.get(a).ft.size()==max){
                v.add(vt.get(a).ft.size());
            }
        }
        return v;
    }
}
