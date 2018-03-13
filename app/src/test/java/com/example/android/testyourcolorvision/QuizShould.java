package com.example.android.testyourcolorvision;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 3/8/2018.
 */
public class QuizShould {
    @Test
    public void evaluateAllAnswersCorrect() throws Exception {
        List<QuizAnswer> quiz1Answers = new ArrayList<>();
        List<QuizAnswer> quiz2Answers = new ArrayList<>();
        List<QuizAnswer> quiz3Answers = new ArrayList<>();

        quiz1Answers.add(QuizAnswer.Dog);
        quiz1Answers.add(QuizAnswer.Eagle);
        QuizQuestion question1 = new QuizQuestion(quiz1Answers);
        question1.addUserAnswer(QuizAnswer.Eagle);
        question1.addUserAnswer(QuizAnswer.Dog);


        quiz2Answers.add(QuizAnswer.Seven);
        QuizQuestion question2 = new QuizQuestion(quiz2Answers);
        question2.addUserAnswer(QuizAnswer.Seven);

        quiz3Answers.add(QuizAnswer.Flower);
        QuizQuestion question3 = new QuizQuestion(quiz3Answers);
        question3.addUserAnswer(QuizAnswer.Flower);

        List<QuizQuestion> quizQuestions = new ArrayList<>();
        quizQuestions.add(question1);
        quizQuestions.add(question2);
        quizQuestions.add(question3);

        Quiz quiz = new Quiz(quizQuestions);
        assertEquals(100, quiz.evaluateAllQuestions(), 0);
    }

    @Test
    public void evaluateSomeAnswersInCorrect() throws Exception {
        List<QuizAnswer> quiz1Answers = new ArrayList<>();
        List<QuizAnswer> quiz2Answers = new ArrayList<>();
        List<QuizAnswer> quiz3Answers = new ArrayList<>();

        quiz1Answers.add(QuizAnswer.Dog);
        quiz1Answers.add(QuizAnswer.Eagle);
        QuizQuestion question1 = new QuizQuestion(quiz1Answers);
        question1.addUserAnswer(QuizAnswer.Eagle);


        quiz2Answers.add(QuizAnswer.Seven);
        QuizQuestion question2 = new QuizQuestion(quiz2Answers);
        question2.addUserAnswer(QuizAnswer.Seven);

        quiz3Answers.add(QuizAnswer.Flower);
        QuizQuestion question3 = new QuizQuestion(quiz3Answers);
        question3.addUserAnswer(QuizAnswer.Seven);

        List<QuizQuestion> quizQuestions = new ArrayList<>();
        quizQuestions.add(question1);
        quizQuestions.add(question2);
        quizQuestions.add(question3);

        Quiz quiz = new Quiz(quizQuestions);
        assertEquals(33, quiz.evaluateAllQuestions(), 0);
    }

}