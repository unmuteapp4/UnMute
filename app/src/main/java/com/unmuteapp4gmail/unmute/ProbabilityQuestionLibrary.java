package com.unmuteapp4gmail.unmute;


public class ProbabilityQuestionLibrary {

    private String mQuestions [] = {
            "(1) Tickets numbered 1 to 20 are mixed up and then a ticket is drawn at random. What is the probability that the ticket drawn has a number which is a multiple of 3 or 5?",
            "(2) A bag contains 2 red, 3 green and 2 blue balls. Two balls are drawn at random. What is the probability that none of the balls drawn is blue?",
            "(3) In a box, there are 8 red, 7 blue and 6 green balls. One ball is picked up randomly. What is the probability that it is neither red nor green?",
            "(4) What is the probability of getting a sum 9 from two throws of a dice?",
            "(5) Three unbiased coins are tossed. What is the probability of getting at most two heads?",
            "(6) Two dice are thrown simultaneously. What is the probability of getting two numbers whose product is even?",
            "(7) In a class, there are 15 boys and 10 girls. Three students are selected at random. The probability that 1 girl and 2 boys are selected, is:",
            "(8) In a lottery, there are 10 prizes and 25 blanks. A lottery is drawn at random. What is the probability of getting a prize?",
            "(9) From a pack of 52 cards, two cards are drawn together at random. What is the probability of both the cards being kings?",
            "(10)Two dice are tossed. The probability that the total score is a prime number is:"


    };


    private String mChoices [][] = {
            {"9/20", "1/2", "8/15"},
            {"11/21", "5/7", "10/21"},
            {"1/3", "7/19", "9/21"},
            {"1/8", "1/9", "1/12"},
            {"3/8", "7/8", "3/4"},

            {"3/4", "3/8", "5/16"},
            {"21/46", "1/50", "3/25"},
            {"1/10", "2/5", "2/7"},
            {"35/256", "1/221", "25/57"},
            {"5/12", "1/6", "7/9"}
    };



    private String mCorrectAnswers[] = {"9/20", "10/21", "1/3", "1/9", "7/8", "3/4", "21/46", "2/7", "1/221", "5/12"};




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
