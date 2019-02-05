package LakeNozama.Assets.Enemy;

import LakeNozama.Objects.Fish;

public class RuberEatFish extends Fish {

    public  RuberEatFish(int x,int y){
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
        System.out.println("Rubber eat Fish eat");

    }

    @Override
    public void swim() {
        System.out.println("rubber eat fish swim");

    }

    @Override
    public void sleep() {
        System.out.println("Rubber eat fish sleep");
    }
}
