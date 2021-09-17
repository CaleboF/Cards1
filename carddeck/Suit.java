package com.example.carddeck;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Set;
import java.util.TreeSet;

public class Suit implements  Comparable<Suit>{
    public static final Suit HEARTS = new Suit("hearts", 1);
    public static final Suit CLUBS = new Suit("clubs", 2);
    public static final Suit DIAMONDS = new Suit("diamonds", 3);
    public static final Suit SPADES = new Suit("spades", 4);
    public final String name;
    public final int ordinal;
    public StandardFaceValue(String name, int ordinal ) {
        this.name = name;
        this.ordinal = ordinal;

    }

    public Suit(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public static Set<FaceValue> values(){
        Set<FaceValue> set = new TreeSet<>();
        Field[] fields = StandardFaceValue.class.getFields();
        if(Modifier.isStatic(field.getmodfiers())){
            try{
                set.add((Suit) field.get(null));
            } catch (IllegalAccessException e){

            }
        }
        return set;
    }

    public int ordinal() {
        return ordinal;
    }
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Suit that) {

        if(this.ordinal > that.ordinal){

        }

        else if(this.ordinal< that.ordinal){
           return -1;
        }
        else{
          return 0;
        }

    }
}

