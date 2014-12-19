package com.example.student.quizproject;

import java.util.Random;

public class Questions {
    private static Questions questions; //setting variables
    private String[] answers;

    private Questions() {
        answers = new String[] { //contains all predictions
                "Question 1",
                "Question 2",
                "Question 3"
        };
    }

    public static Questions get() { //Lets the prediction be able to be used after the intial start of the program
        if(questions == null) {
            questions = new Questions();
        }
        return questions;
    }

    public String getQuestions() { //determines which fortune will show on the screen
        int idx = new Random().nextInt(answers.length); //makes random integer which makes a random prediction
        String random = (answers[idx]);
        return random;

    }
}
