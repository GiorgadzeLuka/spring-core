package bean;

public class AutomationTester extends Engineer {
    private String favouriteFramework;
    private boolean isBro;

    public String getFavouriteFramework() {
        return favouriteFramework;
    }

    public void setFavouriteFramework(String favouriteFramework) {
        this.favouriteFramework = favouriteFramework;
    }

    public boolean isBro() {
        return isBro;
    }

    public void setBro(boolean bro) {
        isBro = bro;
    }

    @Override
    public String toString() {
        return "AutomationTester{" +
                "favouriteFramework='" + favouriteFramework + '\'' +
                ", isBro=" + isBro +
                "} " + super.toString();
    }
}
