package javacore.level3.lectore_11.robot;

public abstract class AbstractRobot implements Attackable, Defensable {
    private static int hitCount;
    private String name;

    public AbstractRobot(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public BodyPart attack() {
        BodyPart attackeBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackeBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackeBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackeBodyPart = BodyPart.LEG;
        } else if (hitCount > 3) {
            hitCount = 0;
            attackeBodyPart = BodyPart.CHEST;
        }
        return attackeBodyPart;
    }


    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCount > 3) {
            hitCount = 0;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;

    }
}