package com.example.android.testyourcolorvision;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class QuizQuestionShould {
    QuizQuestion quizQuestion;


    @Before
    public void setup(){
        ArrayList<QuizAnswer> correctAnswers = new ArrayList<>();
        correctAnswers.add(QuizAnswer.Flower);
        correctAnswers.add(QuizAnswer.Eagle);
        quizQuestion = new QuizQuestion(correctAnswers);
    }

    @Test
    public void evaluateTrueIfAnswersCorrect() throws Exception {
        // Arrange
        quizQuestion.addUserAnswer(QuizAnswer.Eagle);
        quizQuestion.addUserAnswer(QuizAnswer.Flower);

        // Act
        boolean questionResult = quizQuestion.evaluateAnswers();

        // Assert
        assertTrue(questionResult);
    }

    @Test
    public void evaluateFalseIfSomeAnswersIncorrect() throws Exception {
        // Arrange
        quizQuestion.addUserAnswer(QuizAnswer.Eagle);
        quizQuestion.addUserAnswer(QuizAnswer.Seven);

        // Act
        boolean questionResult = quizQuestion.evaluateAnswers();

        // Assert
        assertFalse(questionResult);
    }

    @Test
    public void evaluateFalseUserDidNotProvideAllTheAnswers() throws Exception {
        // Arrange
        quizQuestion.addUserAnswer(QuizAnswer.Eagle);

        // Act
        boolean questionResult = quizQuestion.evaluateAnswers();

        // Assert
        assertFalse(questionResult);
    }

    @Test
    public void evaluateToFalseIfUserProvidedMoreAnswers() throws Exception {
        quizQuestion.addUserAnswer(QuizAnswer.Eagle);
        quizQuestion.addUserAnswer(QuizAnswer.Flower);
        quizQuestion.addUserAnswer(QuizAnswer.Seven);

        // Act
        boolean questionResult = quizQuestion.evaluateAnswers();

        // Assert
        assertFalse(questionResult);
    }
}