public sealed class Animal permits Aquatic,Terrestria {

   private String family, name;
   private int age;
    boolean isMammal;

    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
    public boolean getMammal() {
        return isMammal;
    }

    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
