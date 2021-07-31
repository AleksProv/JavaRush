package comparison_numbers.serel;

import java.io.Serializable;

public class Family implements Serializable {
    private String familyStatus;
    private String children;
    private int countChildren;

    public Family(String familyStatus, String children, int countChildren) {
        this.familyStatus = familyStatus;
        this.children = children;
        this.countChildren = countChildren;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public int getCountChildren() {
        return countChildren;
    }

    public void setCountChildren(int countChildren) {
        this.countChildren = countChildren;
    }

    @Override
    public String toString() {
        return "Family{" +
                "familyStatus='" + familyStatus + '\'' +
                ", children='" + children + '\'' +
                ", countChildren=" + countChildren +
                '}';
    }
}
