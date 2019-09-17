import java.util.ArrayList;

public class Hero {
    private String heroName;
    private String strength;
    private String weakness;
    private int heroID;
    private int age;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String heroNAme, String strength, String weakness, int age) {
        this.heroName = heroNAme;
        this.strength = strength;
        this.weakness = weakness;
        this.age = age;
        instances.add(this);
        this.heroID = instances.size();
    }

    public String getHeroName() {
        return heroName;
    }
//
//    public String getStrength() {
//        return strength;
//    }
//
//    public String getWeakness() {
//        return weakness;
//    }
//
//    public int getHeroID() {
//        return heroID;
//    }
//
//    public int getAge() {
//        return age;
//    }
//    public static ArrayList<Hero> getAllHeroes(){
//        return instances;
//    }
//    public static void clearAllHeroes(){
//        instances.clear();
//    }
//    public static Hero findHeroById(int id){
//        return instances.get(id-1);
//    }
//    public void deleteHero(){
//        instances.remove(heroID-1);
//    }

}
