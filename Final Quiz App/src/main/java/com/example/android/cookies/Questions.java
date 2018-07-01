package com.example.android.cookies;

public class Questions {
    public String mQuestion[] = {

            "Which chess piece can only move diagonally?",
            "Which country has won the FIFA Men's World Cup the Most",
            "What is the diameter of the Earth",
            "What is the seventh planet from the Sun?",
            "What is another word for lexicon?",
            "Which is the worlds longest River?",
            "Which athlete holds the World record for the Men's 100M race?",
            "How many continents are the in the world?",
            "Name the three primary colors",

    };
    private String mChoices[][] = {

            {"Bishop", "Pope", "King", "Queen"},
            {"Brazil", "Italy", "Germany", "England"},
            {"6000KM", "7000KM", "8000KM", "9000KM"},
            {"Pluto", "Saturn", "Uranus", "Jupiter"},
            {"Diary", "Dictionary", "Book", "Story"},
            {"Amazon", "Niger", "Dead Sea", "Limpopo"},
            {"Justin Gatlin", "Tyson Gay", "Maurice Greene", "Usain Bolt"},
            {"6", "7", "8", "9"},
            {"Red, Blue, Green", "Green, Blue, White", "Black, White, Yellow", "Red, Blue, Yellow"},

    };

    private String mCorrectAnswers[] = {"Bishop", "Brazil", "8000KM", "Uranus", "Dictionary", "Amazon", "Usain Bolt", "7", "Red, Blue, Green"};

    public String getQuestion(int a) {
        String Question = mQuestion[a];
        return Question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
