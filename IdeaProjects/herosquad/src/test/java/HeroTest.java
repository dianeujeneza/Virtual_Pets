import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @After
    public void tearDown(){
        Hero.clearAllHeroes();
    }

    @Test
    public void hero_instantiatesCorrectly()throws Exception{
        Hero hero=setupHero();
        assertTrue(hero instanceof Hero);
    }

    @Test
    public void getHeroName_returnsCorrectName_true() throws Exception{
        Hero hero=setupHero();
        assertEquals("superman",hero.getHeroName());
    }

    @Test
    public void getStrength_returnsCorrectStrength_true()throws Exception {
        Hero hero=setupHero();
        assertEquals("flight",hero.getStrength());
    }

    @Test
    public void getWeakness_returnsCorrectWeakness() throws Exception{
        Hero hero=setupHero();
        assertEquals("moon",hero.getWeakness());
    }

    @Test
    public void getAge_returnsCorrectAge() throws Exception {
        Hero hero=setupHero();
        assertEquals(10,hero.getAge());
    }

    @Test
    public void getAllHeroes_returnsAllHeroCreated()throws Exception {
        Hero hero=setupHero();
        Hero otherHero=setupHero();
        assertEquals(2,Hero.getAllHeroes().size());
    }

    @Test
    public void getAllHeroes_returnsAllHeroes_true()throws Exception{
        Hero hero=setupHero();
        Hero otherHero=setupHero();
        assertTrue(Hero.getAllHeroes().contains(hero));
        assertTrue(Hero.getAllHeroes().contains(otherHero));
    }

    @Test
    public void clearAllHeroes() throws Exception{
        Hero hero=setupHero();
        Hero otherHero=setupHero();
        Hero.clearAllHeroes();
        assertTrue(Hero.getAllHeroes().isEmpty());
    }


    public Hero setupHero(){
        Hero hero=new Hero("superman","flight","moon",10);
        return hero;
    }

    @Test
    public void getHeroID_heroInstantiatesWithId_true() {
        Hero hero=setupHero();
        assertEquals(1,hero.getHeroID());
    }

    @Test
    public void findHeroById_returnsCorrectHero()throws Exception{
        Hero hero=setupHero();
        assertEquals(1,Hero.findHeroById(hero.getHeroID()).getHeroID());
    }

    @Test
    public void findHeroById_returnsCorrectPostIfMoreThan1Exists()throws Exception{
        Hero hero=setupHero();
        Hero otherHero=setupHero();
        assertEquals(2,Hero.findHeroById(otherHero.getHeroID()).getHeroID());
    }

    @Test
    public void deleteHero_deletesSpecificHero_true(){
        Hero hero=setupHero();
        Hero otherHero=setupHero();
        hero.deleteHero();
        assertEquals(1,Hero.getAllHeroes().size());
        assertEquals(Hero.getAllHeroes().get(0).getHeroID(),2);

    }

}