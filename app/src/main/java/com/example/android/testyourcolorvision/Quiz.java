package com.example.android.testyourcolorvision;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<QuizQuestion> questions;

    public Quiz(List<QuizQuestion> questions) throws Exception {
        if (questions == null) {
            throw new NullPointerException("qeustions can not be null");
        }
        if (questions.size() < 1) {
            throw new Exception("questions must have at least 1 question");
        }
        this.questions = questions;
    }

    public double evaluateAllQuestions() {
        int numberOfQuestions = questions.size();
        int numberOfCorrectAnswers = 0;
        for (QuizQuestion question:
             questions) {
            if (question.evaluateAnswers()){
                numberOfCorrectAnswers++;
            }
        }
        return numberOfCorrectAnswers * 100 / numberOfQuestions;
    }
}
