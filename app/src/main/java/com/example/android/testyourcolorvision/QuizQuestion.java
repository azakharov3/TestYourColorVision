package com.example.android.testyourcolorvision;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 3/8/2018.
 */

public class QuizQuestion {
    private final List<QuizAnswer> correctAnswers;
    private List<QuizAnswer> usersAnswers;

    public QuizQuestion(List<QuizAnswer> correctAnswers){
        this.correctAnswers = correctAnswers;
        usersAnswers = new ArrayList<QuizAnswer>();
    }

    public void addUserAnswer(QuizAnswer answer){
        usersAnswers.add(answer);
    }

    public boolean evaluateAnswers() {
        if (correctAnswers.size() == usersAnswers.size()) {
            for (QuizAnswer usersAnswer: usersAnswers) {
                if (!correctAnswers.contains(usersAnswer)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }


}
