package LakeNozama.Assets.Ally;

import LakeNozama.Objects.Warrior;

public class NormalSwimmer extends Warrior {
    public NormalSwimmer(int x, int y){
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
        return this.getY();
    }

    @Override
    public void setY(int y) {
        this.y=y;
    }

    @Override
    public void eat() {

    }

    @Override
    public void swim() {
        
    }

    @Override
    public void sleep() {

    }
}
