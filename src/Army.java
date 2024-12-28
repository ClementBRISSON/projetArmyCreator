import java.util.ArrayList;

public class Army {
    private String name;
    private String faction;
    private int maxPoints;
    private ArrayList<Groupe> groupes;

    public Army() {}

    public Army(String name, String faction, int maxPoints) {
        this.name = name;
        this.faction = faction;
        this.maxPoints = maxPoints;
        this.groupes = new ArrayList<Groupe>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public ArrayList<Groupe> getGroups() {
        return groupes;
    }

    public void setGroups(ArrayList<Groupe> groups) {
        this.groupes = groups;
    }
}
