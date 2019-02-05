package LakeNozama.Assets.Enemy;

import LakeNozama.Objects.Fish;

public class InnocentFish extends Fish {
    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public void setX(int x){
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
    public InnocentFish(int x, int y) {
        this.setX(x);
        this.setX(y);

    }

    @Override
    public void eat() {
        System.out.println("innocent  fish eat");
    }

    @Override
    public void swim() {
        System.out.println("innocent fish swim");

    }

    @Override
    public void sleep() {
        System.out.println("innocent fish sleep");

    }
}
