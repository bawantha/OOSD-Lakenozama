package LakeNozama.Assets.Enemy;

import LakeNozama.Objects.Fish;


public class KillerFish extends Fish {
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
        System.out.println("kill the swimmer and eat");

    }

    @Override
    public void swim() {
        System.out.println("killer fish swim");

    }

    @Override
    public void sleep() {
        System.out.println("killer fish sleep");

    }
    public KillerFish(int x,int y){
        this.setX(x);
        this.setY(y);
    }
}
