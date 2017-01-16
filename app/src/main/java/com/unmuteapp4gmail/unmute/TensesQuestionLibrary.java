package com.unmuteapp4gmail.unmute;

public class TensesQuestionLibrary{

    private String mQuestions [] = {
            "(1) Hardly had the minister finished his speech when gunshots ---- (storm) the stadium.",
            "(2) Everybody will be at the office at about 08:30 tomorrow as the meeting ---- (start) at nine o'clock.",
            "(3) That candidate who we had interviewed before we ---- (speak) to all the others is still my favorite.",
            "(4) While climbing onto the mountain top, I ---- (encounter) a strange animal which I'd never seen before.",
            "(5) The chairman was sure that his plan would work out fine as no other member ---- (oppose) it up to that time.",
            "(6)  I wasn't surprised to hear that Monica ---- (have) an accident as she is a very reckless driver.",
            "(7) Since the very first day when the Umbrella Company embarked upon such a dangerous and risky lab-research, very strange incidents ---- (take place) within the research complex.",
            "(8)  Urbanization has always been a problem which causes several environmental challenges ever since the rate of migration ---- (increase) after the industrial revolution.",
            "(9) When I ---- (come) home this evening, my parents had gone out for a walk.",
            "(10) By the time the troops ---- (arrive), the war will have ended."


    };


    private String mChoices [][] = {
            {"Stormed", "Had Stormed", "Will be Storming"},
            {"Was Started", "Starts", "Will Start"},
            {"Will speak", "Had Spoken", "Spoke"},
            {"Had encountered", "Encounter", "Encountered"},
            {"Had Opposed", "Will oppose", "Oppose"},

            {"Will", "Had", "Has"},
            {"Will take place", "Has been taking place", "Took Place"},
            {"Will be increasing", "Increased", "Will have increased"},
            {"Was Coming", "Will be Coming", "Came"},
            {"Had Arrived", "Will Arrive", "Arrived"}
    };



    private String mCorrectAnswers[] = {"Stormed", "Starts", "Spoke", "Encountered", "Had Opposed", "Had", "Took Place", "Increased", "Came", "Had Arrived"};




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

