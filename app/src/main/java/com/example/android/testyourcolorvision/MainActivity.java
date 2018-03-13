package com.example.android.testyourcolorvision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<QuizQuestion> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void prepareQuizQuestions()
    {
        List<QuizAnswer> quizQuesion1CorrectAnswers = new ArrayList<>();
        quizQuesion1CorrectAnswers.add(QuizAnswer.One);
        quizQuesion1CorrectAnswers.add(QuizAnswer.Six);
        QuizQuestion quizQuestion1GreenRed16 = new QuizQuestion(quizQuesion1CorrectAnswers);

        List<QuizAnswer> quizQuesion2CorrectAnswers = new ArrayList<>();
        quizQuesion2CorrectAnswers.add(QuizAnswer.Nothing);
        QuizQuestion quizQuestionGreenBrownNothing = new QuizQuestion(quizQuesion2CorrectAnswers);

        List<QuizAnswer> quizQuesion3CorrectAnswers = new ArrayList<>();
        quizQuesion3CorrectAnswers.add(QuizAnswer.Five);
        QuizQuestion quizQuestionPurpleGreen5 = new QuizQuestion(quizQuesion3CorrectAnswers);

        List<QuizAnswer> quizQuesion4CorrectAnswers = new ArrayList<>();
        quizQuesion4CorrectAnswers.add(QuizAnswer.Four);
        quizQuesion4CorrectAnswers.add(QuizAnswer.Five);
        QuizQuestion quizQuestionOrangeGreen45 = new QuizQuestion(quizQuesion4CorrectAnswers);

        List<QuizAnswer> quizQuesion5CorrectAnswers = new ArrayList<>();
        quizQuesion5CorrectAnswers.add(QuizAnswer.Girl);
        QuizQuestion quizQuestionOrangeGreenGirl = new QuizQuestion(quizQuesion5CorrectAnswers);

        questions = new ArrayList<>();
        questions.add(quizQuestion1GreenRed16);
        questions.add(quizQuestionGreenBrownNothing);
        questions.add(quizQuestionPurpleGreen5);
        questions.add(quizQuestionOrangeGreen45);
        questions.add(quizQuestionOrangeGreenGirl);
    }


    public void onGetResultsTap(View view) {
        prepareQuizQuestions();

        CheckBox greenRed16option0Checkbox = findViewById(R.id.green_red_16_0);
        boolean greenRed16option0 = greenRed16option0Checkbox.isChecked();
        CheckBox greenRed16option1Checkbox = findViewById(R.id.green_red_16_1);
        boolean greenRed16option1 = greenRed16option1Checkbox.isChecked();
        CheckBox greenRed16option2Checkbox = findViewById(R.id.green_red_16_2);
        boolean greenRed16option2 = greenRed16option2Checkbox.isChecked();
        CheckBox greenRed16option5Checkbox = findViewById(R.id.green_red_16_5);
        boolean greenRed16option5 = greenRed16option5Checkbox.isChecked();
        CheckBox greenRed16option6Checkbox = findViewById(R.id.green_red_16_6);
        boolean greenRed16option6 = greenRed16option6Checkbox.isChecked();
        CheckBox greenRed16option7Checkbox = findViewById(R.id.green_red_16_7);
        boolean greenRed16option7 = greenRed16option7Checkbox.isChecked();
        CheckBox greenRed16option9Checkbox = findViewById(R.id.green_red_16_9);
        boolean greenRed16option9 = greenRed16option9Checkbox.isChecked();

        if (greenRed16option0) {
            questions.get(0).addUserAnswer(QuizAnswer.Zero);
        }
        if (greenRed16option1) {
            questions.get(0).addUserAnswer(QuizAnswer.One);
        }
        if (greenRed16option2) {
            questions.get(0).addUserAnswer(QuizAnswer.Two);
        }
        if (greenRed16option5) {
            questions.get(0).addUserAnswer(QuizAnswer.Five);
        }
        if (greenRed16option6) {
            questions.get(0).addUserAnswer(QuizAnswer.Six);
        }
        if (greenRed16option7) {
            questions.get(0).addUserAnswer(QuizAnswer.Seven);
        }
        if (greenRed16option9) {
            questions.get(0).addUserAnswer(QuizAnswer.Eight);
        }

        RadioButton greenBrown16optionCarRadioBtn = findViewById(R.id.green_brown_nothing_car);
        boolean greenBrown16optionCar = greenBrown16optionCarRadioBtn.isChecked();

        RadioButton greenBrown16optionDogRadioBtn = findViewById(R.id.green_brown_nothing_dog);
        boolean greenBrown16optionDog = greenBrown16optionDogRadioBtn.isChecked();

        RadioButton greenBrown16optionFlowerRadioBtn = findViewById(R.id.green_brown_nothing_flower);
        boolean greenBrown16optionFlower = greenBrown16optionFlowerRadioBtn.isChecked();

        RadioButton greenBrown16optionKettleRadioBtn = findViewById(R.id.green_brown_nothing_kettle);
        boolean greenBrown16optionKettle = greenBrown16optionKettleRadioBtn.isChecked();

        RadioButton greenBrown16optionNothingRadioBtn = findViewById(R.id.green_brown_nothing_nothing);
        boolean greenBrown16optionNothing = greenBrown16optionNothingRadioBtn.isChecked();

        if (greenBrown16optionCar) {
            questions.get(1).addUserAnswer(QuizAnswer.Car);
        }
        if (greenBrown16optionDog) {
            questions.get(1).addUserAnswer(QuizAnswer.Dog);
        }
        if (greenBrown16optionFlower) {
            questions.get(1).addUserAnswer(QuizAnswer.Flower);
        }
        if (greenBrown16optionKettle) {
            questions.get(1).addUserAnswer(QuizAnswer.Kettle);
        }
        if (greenBrown16optionNothing) {
            questions.get(1).addUserAnswer(QuizAnswer.Nothing);
        }

        EditText purpleGreenInputField = findViewById(R.id.purple_green_input_field);
        try {
            Integer purpleGreenInputFieldUserInput = Integer.parseInt(purpleGreenInputField.getText().toString());
            questions.get(2).addUserAnswer(QuizAnswer.values()[purpleGreenInputFieldUserInput]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            Log.d("MainActivity", "Invalid user input");
        }

        CheckBox orangeGreen45Option1CheckBox = findViewById(R.id.orange_green_45_1);
        boolean orangeGreen45Option1 = orangeGreen45Option1CheckBox.isChecked();
        CheckBox orangeGreen45Option2CheckBox = findViewById(R.id.orange_green_45_2);
        boolean orangeGreen45Option2 = orangeGreen45Option2CheckBox.isChecked();
        CheckBox orangeGreen45Option3CheckBox = findViewById(R.id.orange_green_45_3);
        boolean orangeGreen45Option3 = orangeGreen45Option3CheckBox.isChecked();
        CheckBox orangeGreen45Option4CheckBox = findViewById(R.id.orange_green_45_4);
        boolean orangeGreen45Option4 = orangeGreen45Option4CheckBox.isChecked();
        CheckBox orangeGreen45Option5CheckBox = findViewById(R.id.orange_green_45_5);
        boolean orangeGreen45Option5 = orangeGreen45Option5CheckBox.isChecked();
        CheckBox orangeGreen45Option8CheckBox = findViewById(R.id.orange_green_45_8);
        boolean orangeGreen45Option8 = orangeGreen45Option8CheckBox.isChecked();
        CheckBox orangeGreen45Option9CheckBox = findViewById(R.id.orange_green_45_9);
        boolean orangeGreen45Option9 = orangeGreen45Option9CheckBox.isChecked();
        if (orangeGreen45Option1) {
            questions.get(3).addUserAnswer(QuizAnswer.Zero);
        }
        if (orangeGreen45Option2) {
            questions.get(3).addUserAnswer(QuizAnswer.Two);
        }
        if (orangeGreen45Option3) {
            questions.get(3).addUserAnswer(QuizAnswer.Three);
        }
        if (orangeGreen45Option4) {
            questions.get(3).addUserAnswer(QuizAnswer.Four);
        }
        if (orangeGreen45Option5) {
            questions.get(3).addUserAnswer(QuizAnswer.Five);
        }
        if (orangeGreen45Option8) {
            questions.get(3).addUserAnswer(QuizAnswer.Eight);
        }
        if (orangeGreen45Option9) {
            questions.get(3).addUserAnswer(QuizAnswer.Nine);
        }

        RadioButton brownGreenGirlOptionEagleRadioBtn =  findViewById(R.id.brown_green_girl_radio_button_eagle);
        boolean brownGreenGirlOptionEagle = brownGreenGirlOptionEagleRadioBtn.isChecked();

        RadioButton brownGreenGirlOptionCloudRadioBtn =  findViewById(R.id.brown_green_girl_radio_button_cloud);
        boolean brownGreenGirlOptionCloud = brownGreenGirlOptionCloudRadioBtn.isChecked();

        RadioButton brownGreenGirlOptionCatRadioBtn =  findViewById(R.id.brown_green_girl_radio_button_cat);
        boolean brownGreenGirlOptionCat = brownGreenGirlOptionCatRadioBtn.isChecked();

        RadioButton brownGreenGirlOptionGirlRadioBtn =  findViewById(R.id.brown_green_girl_radio_button_girl);
        boolean brownGreenGirlOptionGirl = brownGreenGirlOptionGirlRadioBtn.isChecked();

        RadioButton brownGreenGirlOptionNothingRadioBtn =  findViewById(R.id.brown_green_girl_radio_button_nothing);
        boolean brownGreenGirlOptionNothing = brownGreenGirlOptionNothingRadioBtn.isChecked();

        if (brownGreenGirlOptionCat) {
            questions.get(4).addUserAnswer(QuizAnswer.Car);
        }
        if (brownGreenGirlOptionCloud) {
            questions.get(4).addUserAnswer(QuizAnswer.Cloud);
        }
        if (brownGreenGirlOptionEagle) {
            questions.get(4).addUserAnswer(QuizAnswer.Eagle);
        }
        if (brownGreenGirlOptionGirl) {
            questions.get(4).addUserAnswer(QuizAnswer.Girl);
        }
        if (brownGreenGirlOptionNothing) {
            questions.get(4).addUserAnswer(QuizAnswer.Nothing);
        }
        try {
            Quiz quiz = new Quiz(questions);
            double result = quiz.evaluateAllQuestions();
            String toastMessage = "Your result is: " + String.format("%.0f", result) + "% correct";
            Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();
        } catch (Exception e){}

    }
}
