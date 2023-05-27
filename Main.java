import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create a FootballPlayer object
        FootballPlayer messi = new FootballPlayer("Lionel Messi", 34, "Argentina", 1.70, 72, 100000000);

        // Create a FootballPlayer object
        FootballPlayer ronaldo = new FootballPlayer("Cristiano Ronaldo", 37, "Portugal", 1.87, 84, 90000000);

        // Create a FootballTeam object
        FootballTeam barcelona = new FootballTeam("Barcelona", 1000000, new ArrayList<FootballPlayer>() {{
            add(messi);
        }});

        // Create a FootballTeam object
        FootballTeam realMadrid = new FootballTeam("Real Madrid", 90000, new ArrayList<FootballPlayer>() {{
            add(ronaldo);
        }});

        // Create a FootballLeague object
        FootballLeague laLiga = new FootballLeague("LaLiga", 1000000, new ArrayList<FootballTeam>() {{
            add(barcelona);
            add(realMadrid);
        }});

        // Display the information of the FootballPlayer objects
        System.out.println("Information of FootballPlayer messi:");
        messi.display();

        System.out.println("Information of FootballPlayer ronaldo:");
        ronaldo.display();

        // Display the information of the FootballTeam objects
        System.out.println("Information of FootballTeam barcelona:");
        barcelona.display();

        System.out.println("Information of FootballTeam realMadrid:");
        realMadrid.display();

        // Display the information of the FootballLeague object
        System.out.println("Information of FootballLeague laLiga:");
        laLiga.display();

        // Find the FootballTeam objects with the maximum number of players
        ArrayList<FootballLeague> maxLeagueTeam = FootballLeague.getMaxLeagueTeam(new ArrayList<FootballLeague>() {{
            add(laLiga);
        }});

        // Display the information of the FootballLeague objects with the maximum number of players
        System.out.println("FootballLeague objects with the maximum number of players:");
        for (FootballLeague league : maxLeagueTeam) {
            league.display();
        }
    }
}