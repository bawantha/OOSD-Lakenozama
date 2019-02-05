package LakeNozama.Assets.Ally;

import LakeNozama.Objects.Binocular;
import LakeNozama.Objects.Warrior;


public class SuperSwimmer extends Warrior{
    Binocular binocular;
    public SuperSwimmer(int x, int y) {
        super();
        binocular=new Binocular();
        this.setX(x);
        this.setY(y);

    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public void setX(int x) {
        this.x=x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void setY(int y) {
        this.y=y;
    }

    @Override
    public void eat() {
        System.out.println("SupperSwimmer Eat");
    }

    @Override
    public void swim() {
        System.out.println("Supper Simmer swim");

    }

    @Override
    public void sleep() {
        System.out.println("Supper NormalSwimmer Swim");
    }
}
