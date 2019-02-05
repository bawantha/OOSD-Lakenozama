package LakeNozama.Objects;
abstract public class Flower extends Grid {
    public int petal;

    abstract public int getPetal();

    public void setPetal(int petal) {
        this.petal = petal;
    }
}
