package com.unmuteapp4gmail.unmute;


public class GrammarQuestionLibrary {

    private String mQuestions [] = {
            "(1) ______ shall I say is calling?",
            "(2) ___ hour ago we met ___ history teacher.",
            "(3) Sentences can be broken down into:",
            "(4) Charles and ___ are attending the conference.",
            "(5)  The boy _______ threw the ball was blond.",
            "(6)  He was not thinking well __ that occasion.",
            "(7) The other boys or Henry ____ to blame.",
            "(8) The cat has ___ the canary.",
            "(9) Those are all prepositions, except:",
            "(10) Adverbs can modify:"

    };


    private String mChoices [][] = {
            {"Who", "Whom", "Whose"},
            {"an / a", "a / a", "a / an"},
            {"Periods", "Objects", "Clauses"},
            {"Me", "I", "Myself"},
            {"That", "Which", "Who"},

            {"At", "On", "When"},
            {"is", "are", "were"},
            {"Eat", "Eaten", "Ate"},
            {"Upon", "From", "So"},
            {"Nouns", "Pronouns", "Adjectives"}
    };



    private String mCorrectAnswers[] = {"Who", "an / a", "Clauses", "I", "Who", "On", "is", "Eaten", "So", "Adjectives"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
