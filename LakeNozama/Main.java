package LakeNozama;

import LakeNozama.Assets.Ally.NormalSwimmer;
import LakeNozama.Assets.Ally.SuperSwimmer;
import LakeNozama.Assets.Enemy.InnocentFish;
import LakeNozama.Assets.Enemy.KillerFish;
import LakeNozama.Assets.Enemy.RuberEatFish;
import LakeNozama.Assets.Lotus;
import LakeNozama.Objects.Fish;
import LakeNozama.Objects.Warrior;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Define arrayList
        ArrayList<Warrior> warriorArrayList = new ArrayList<>();
        ArrayList<Lotus> flowerArrayList = new ArrayList<>();
        ArrayList<Fish> fishArrayList = new ArrayList<>();

        // add data to list

        warriorArrayList.add(new SuperSwimmer(4,0));
        warriorArrayList.add(new NormalSwimmer(5,0));
        warriorArrayList.add(new SuperSwimmer(5,0));
        warriorArrayList.add(new NormalSwimmer(4,0));

        flowerArrayList.add(new Lotus(randomInt(0,11),randomInt(0,11)));
        flowerArrayList.add(new Lotus(randomInt(0,11),randomInt(0,11)));
        flowerArrayList.add(new Lotus(randomInt(0,11),randomInt(0,11)));
        flowerArrayList.add(new Lotus(randomInt(0,11),randomInt(0,11)));
        flowerArrayList.add(new Lotus(randomInt(0,11),randomInt(0,11)));

        fishArrayList.add(new InnocentFish(randomInt(0,11),randomInt(0,11)));
        fishArrayList.add(new InnocentFish(randomInt(0,11),randomInt(0,11)));
        fishArrayList.add(new KillerFish(randomInt(0,11),randomInt(0,11)));
        fishArrayList.add(new KillerFish(randomInt(0,11),randomInt(0,11)));
        fishArrayList.add(new RuberEatFish(randomInt(0,11),randomInt(0,11)));
        fishArrayList.add(new RuberEatFish(randomInt(0,11),randomInt(0,11)));


        System.out.println(fishArrayList.get(0).getX());
        System.out.println(fishArrayList.get(0).getY());

        while(!Warrior.isWin){

        }





















    }

    public static int randomInt(int lowerBound, int upperBound) {
        return (int) (Math.random() * upperBound + lowerBound);
    }

    public static void swim(){

    }

}

