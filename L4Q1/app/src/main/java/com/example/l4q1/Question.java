package com.example.l4q1;

public class Question {

    public String questions[] = {
            "What is the capital of India?",
            "Which one of these is a sweet dish?",
            "How many days in a leap year?",
            "Who is June's husband",
            "What is 4+5?"
    };

    public String choices[][] = {
            {"Chennai", "Mumbai", "Delhi", "Kolkata"},
            {"Idli", "Dosa", "Laddoo", "Dal"},
            {"365", "366", "367", "368"},
            {"Luke", "Nick", "Fred", "Steven"},
            {"6", "7", "8", "9"}
    };

    public String correctAnswer[] = {
            "Delhi",
            "Laddoo",
            "366",
            "Luke",
            "9"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }

    public String getQuestionNumber(int a)
    {
        String num = "Question " + (a+1);
        return num;
    }
}
