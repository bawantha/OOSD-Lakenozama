package LakeNozama.Assets;

import LakeNozama.Objects.Flower;

public class Lotus extends Flower {
    public Lotus(int x,int y){
        super.setPetal(100);
        this.setX(x);
        this.setY(y);
    }

    @Override
    public int getPetal() {
        return this.petal;
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
}
