package U9_Inheritance;
public class Athlete
{
    private String name;
    private int age;
    public Athlete(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName(String name)
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge(int age)
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public class TeamAthlete extends Athlete
    {
        private String teamName;
        private String sport;

        public TeamAthlete (String name, int age, String teamName, String sport)
        {
            super(name, age);
            this.teamName = teamName;
            this.sport = sport;
        }

        public String getTeamName(String teamName)
        {
            return teamName;
        }
        public void setTeamName(String teamName)
        {
            this.teamName = teamName;
        }
        public String getSport(String sport)
        {
            return sport;
        }
        public void setSport(String sport)
        {
            this.sport = sport;
        }
    }
}
