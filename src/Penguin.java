public class Penguin extends Aquatic {
  private   float swimmingDeph;
  Penguin()
  {}
    Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDeph)
    {
        this.swimmingDeph=swimmingDeph;
    }
    public float getSwimmingDeph() {
        return swimmingDeph;
    }

    public void setSwimmingDeph(float swimmingDeph) {
        this.swimmingDeph = swimmingDeph;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDeph=" + swimmingDeph +
                ", habitat='" + getHabitat() + '\'' +
                ", isMammal=" + isMammal +
                '}';
    }
}
