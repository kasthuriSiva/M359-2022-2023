package U5_Classes.HeroVillianExample;

public class Villian {
    private String villainName;
    private Power superPower2;

    public Villian(String villainName, Power superPower2) {
        this.villainName = villainName;
        this.superPower2 = superPower2;
    }

    public String getVillainName() {
        return villainName;
    }

    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }

    public Power getSuperPower2() {
        return superPower2;
    }

    public void setSuperPower2(Power superPower2) {
        this.superPower2 = superPower2;
    }

    public String toString(){
        String output ="";

        output += "Villain Name: " + this.villainName +"\n";
        output +=superPower2 + "\n";

        return output;
    }
}
