package com.unmuteapp4gmail.unmute;


public class ArithmaticQuestionLibrary {

    private String mQuestions [] = {
            "(1) 2.75 + .003 + .158 = ?",
            "(2) 7.86 × 4.6 = ?",
            "(3) 7/20 = ?",
            "(4) Which of the following is the least?",
            "(5) All of the following are ways to write 25 percent of N EXCEPT",
            "(6) Which of the following is closest to 27.8 × 9.6?",
            "(7) A soccer team played 160 games and won 65 percent of them. How many games did it win?",
            "(8) Three people who work full-time are to work together on a project, but their total time on the project is to be equivalent to that of only one person working full-time. If one of the people is budgeted for one-half of his time to the project and a second person for one-third of her time, what part of the third worker’s time should be budgeted to this project?",
            "(9) 32 is 40 percent of what number?",
            "(10) 313 – 225 = ?"


    };


    private String mChoices [][] = {
            {"4.36", "2.911", "0.436"},
            {"36.156", "36.216", "351.56"},
            {"0.035", "0.858", "0.35"},
            {"0.105", "0.501", "0.015"},
            {"0.25N", "1/4N", "25N"},

            {"280", "300", "2800"},
            {"94", "104", "114"},
            {"13.3%", "35.2%", "16.7%"},
            {"12.8", "128", "80"},
            {"112", "115", "88"}
    };



    private String mCorrectAnswers[] = {"2.911", "36.156", "0.35", "0.015", "25N", "280", "104", "16.7%", "80", "88"};




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
