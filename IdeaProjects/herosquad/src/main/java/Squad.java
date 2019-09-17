import java.util.ArrayList;

public class Squad {
    private int squadId;
    private int squadSize;
    private String squadName;
    private String cause;
    private static ArrayList<Squad> squadInstances=new ArrayList<>();
    private static ArrayList<Hero> heroes=new ArrayList<>();


    public Squad(int squadSize, String squadName, String cause) {
        this.squadSize = squadSize;
        this.squadName = squadName;
        this.cause = cause;
        squadInstances.add(this);
        this.squadId=squadInstances.size();
    }
//
//    public int getSquadId() {
//        return squadId;
//    }
//
//    public int getSquadSize() {
//        return squadSize;
//    }
//
//    public String getSquadName() {
//        return squadName;
//    }
//
//    public String getCause() {
//        return cause;
//    }
//
//    public static ArrayList<Squad> getAllSquads(){
//        return squadInstances;
//    }
//    public static void clearAllSquads(){
//        squadInstances.clear();
//    }
//    public static Squad findSquadById(int id){
//        return squadInstances.get(id-1);
//    }
//    public void deleteSquad(){
//        squadInstances.remove(squadId-1);
//    }
//    public void addHero(Hero hero){
//        heroes.add(hero);
//    }
//    public static ArrayList<Hero> getSquadHeroes(){
//        return heroes;
//    }
}
