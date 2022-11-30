package U5_Classes.HeroVillianExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
    //Create a super power object for speed
        Power p1 = new Power("Super speed", 10);
        Power p2 = new Power("Flight", 8);
        System.out.println(p1);
        System.out.println(p2);

        //Create some heros and villains

        SuperHero superMan = new SuperHero("Superman",p2);
        System.out.println(superMan);
       // Villain

        Villian V1 = new Villian("Reverse Flash",p1);
        System.out.println(V1);

        // Reduce Reverse flashes power from 10 to 6
        V1.getSuperPower2().setStrength(6);
        System.out.println(V1);

        //Have these 2 battle each other
        battle(superMan , V1);
    }

    /**
     * Simulate a battle between Hero and Villain
     * power strength wins. If power levels are equal flip a coin
     *             At the end of each battle:
     *                  1.Winner will gain 10% of the loser's power level
     *                  2. Loser will lose between 5-35% of their own power level (random)
     * @param h Strength of Hero's Power
     * @param v Strength of the Villian's power
     */
    public static void battle(SuperHero h , Villian v ){
       double hStr = h.getSuperPower().getStrength();
       double vStr = v.getSuperPower2().getStrength();


        if(hStr > vStr){
            System.out.println("Hero Won!");

            double newHeroStr = hStr + 0.1 * vStr;
            h.getSuperPower().setStrength(newHeroStr);

            int lossPercent = (int)(Math.random()*(35-5+1)) + 5;
            double newVillainStr = vStr - (lossPercent/100.0)*vStr;
            v.getSuperPower2().setStrength(newVillainStr);
        }
        else if(vStr > hStr){
            System.out.println("Villain Won!");
            double newVillianStr2 = hStr + 0.1 * vStr;
            h.getSuperPower().setStrength(newVillianStr2);

            int lossPercent = (int)(Math.random()*(35-5+1)) + 5;
            double newHeroStr2 = vStr - (lossPercent/100.0)*vStr;
            v.getSuperPower2().setStrength(newHeroStr2);

        }
        else{               //Flip coin
            if((Math.random() < 0.5)){

            }
            else{

            }
        }
    }
}

