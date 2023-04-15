package AplikacjaPierwsza;

public abstract class Pet {

    public String Name;

    public String Race;

    public int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void walk(){
        System.out.println("Chodzę na łapach");
    }
}
