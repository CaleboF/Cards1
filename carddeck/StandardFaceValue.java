package com.example.carddeck;

import jdk.internal.jimage.ImageReaderFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Set;
import java.util.TreeSet;

public class StandardFaceValue implements FaceValue, Comparable<StandardFaceValue> {

    public static final FaceValue ACE = new StandardFaceValue("ace", 1);
    public static final FaceValue TWO = new StandardFaceValue("two", 2);
    public static final FaceValue THREE = new StandardFaceValue("three", 3);
    public static final FaceValue FOUR = new StandardFaceValue("four", 4);
    public static final FaceValue FIVE = new StandardFaceValue("five", 5);
    public static final FaceValue SIX = new StandardFaceValue("six", 6);
    public static final FaceValue SEVEN = new StandardFaceValue("seven", 7);
    public static final FaceValue EIGHT = new StandardFaceValue("eight", 8);
    public static final FaceValue NINE = new StandardFaceValue("nine", 9);
    public static final FaceValue TEN = new StandardFaceValue("ten", 10);
    public static final FaceValue JACK = new StandardFaceValue("jack", 11);
    public static final FaceValue QUEEN = new StandardFaceValue("queen", 12);
    public static final FaceValue KING = new StandardFaceValue("king", 13);
    private static ImageReaderFactory field;

    private final String name;
    private final int ordinal;


    public StandardFaceValue(String name, int ordinal ) {
        this.name = name;
        this.ordinal = ordinal;

    }
    public static Set<FaceValue> values(){
        Set<FaceValue> set = new TreeSet<>();
        Field[] fields = StandardFaceValue.class.getFields();
        if(Modifier.isStatic(field.getmodfiers())){
            try{
                set.add((StandardFaceValue) field.get(null));
            } catch (IllegalAccessException e){

            }
        }
    return set;
    }


    @Override
    public int ordinal() {
        return ordinal;
    }
    public int compareTo(Suit that) {

        if (this.ordinal > that.ordinal) {

        } else if (this.ordinal < that.ordinal) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compareTo(StandardFaceValue o) {
        return 0;
    }
}
