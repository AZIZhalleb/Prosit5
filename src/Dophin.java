public class Dophin extends Aquatic {
   private float swimmingSpeed;
   Dophin()
   {}
Dophin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed)
{
    this.swimmingSpeed=swimmingSpeed;
}
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dophin{" +
                "swimmingSpeed=" + swimmingSpeed +
                ", habitat='" + getHabitat() + '\'' +
                ", isMammal=" + isMammal +
                '}';
    }
}
