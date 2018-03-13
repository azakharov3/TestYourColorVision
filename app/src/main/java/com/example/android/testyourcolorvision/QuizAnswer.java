package com.example.android.testyourcolorvision;

/**
 * Created by Andrey on 3/8/2018.
 */

public enum QuizAnswer {
    Zero(0),
    One(1),
    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Six(6),
    Seven(7),
    Eight(8),
    Nine(9),

    Car(10),
    Cat(11),
    Cloud(12),
    Dog(13),
    Eagle(14),
    Flower(15),
    Girl(16),
    Kettle(17),
    Nothing(18);

    public final int Value;

    QuizAnswer(int value) {
        Value = value;
    }
}
