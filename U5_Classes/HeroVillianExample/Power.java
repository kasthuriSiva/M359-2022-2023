package U5_Classes.HeroVillianExample;

public class Power {
    private String name;
    private double strength;

    /**
     * Full constructor for power objects
     * @param name This is the name of the super power
     * @param strength This is the strength of the super power (1-10)
     */
    public Power(String name, double strength) {
        this.name = name;
        this.strength = strength;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public String toString(){
        String output ="";

        output +="Name of the super power: " + this.name +"\n";
        output +="Power strength: " + this.strength + "\n";

        return output;
    }
}

