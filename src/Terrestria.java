non-sealed public class Terrestria extends Animal{
    private int nbrLeges;

    public int getNbrLeges() {
        return nbrLeges;
    }

    public void setNbrLeges(int nbrLeges) {
        this.nbrLeges = nbrLeges;
    }

    @Override
    public String toString() {
        return "Terrestria{" +
                "nbrLeges=" + nbrLeges +
                ", isMammal=" + isMammal +
                '}';
    }
    Terrestria(String family, String name, int age, boolean isMammal,String habitat)
    {
        this.nbrLeges=nbrLeges;
    }
}
