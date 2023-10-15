non-sealed public class Aquatic extends Animal {
   private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    Aquatic()
{

}
    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                ", isMammal=" + isMammal +
                '}';
    }
    Aquatic(String family, String name, int age, boolean isMammal,String habitat)
    {
        this.habitat=habitat;
    }
}
