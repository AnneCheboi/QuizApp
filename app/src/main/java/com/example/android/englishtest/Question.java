package com.example.android.englishtest;

public class Question {
    //create arrays to hold the questions
    private static String[] mQuiz ={
            "My hair is longer than ____",
            "I love to get____a hot bath and read",
            "____story in the newspaper is fake",
            "She____ to London last week"
    };


    //array that holds the multiple choices
    private String Choices[] []={
            {"hers","your","hims","she's"},
            {"on","in","at","under"},
            {"Those","These","This","The"},
            {"was go","going","go","went"}

    };

    //array that has the correct answer
    private String mCorrectAnswers[]={"hers","in","The","went"};

    //method to get Questions on the screen
    public static String getQuestion(int n){
        return mQuiz[n];
    }
    //method to get the multiple choices
    public String getChoice0(int n){
        return Choices[n][0];
    }
    public String getChoice1(int n){
        return Choices[n][1];
    }
    public String getChoice2(int n){
        return Choices[n][2];
    }
    public String getChoice3(int n){
        return Choices[n][3];
    }

    //method to get the correct answer
    public String getCorrectAnswers(int n) {
        return mCorrectAnswers[n];
    }
}


