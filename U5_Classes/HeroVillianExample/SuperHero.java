package U5_Classes.HeroVillianExample;

public class SuperHero {
    private String heroName;
    private Power superPower;

    //Keeps track of total # of Superhero objects created so far
    private static int numHeroes = 0;

    public SuperHero(String heroName, Power superPower) {
        // Somebody called the constructor, so we're creating a new
        // superhero object, so update the count
        numHeroes++;

        this.heroName = heroName;
        this.superPower = new Power(superPower.getName(), superPower.getStrength());
    }

    public static int getNumHeroes(){
        return numHeroes;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

    public String toString(){
        String output ="";

        output += "Super Hero Name: " + this.heroName +"\n";
        output +=superPower + "\n";

        return output;
    }
}
