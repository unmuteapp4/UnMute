package com.unmuteapp4gmail.unmute;


public class SentenceQuestionLibrary {

    private String mQuestions [] = {
            "Directions for questions 1–5: Select the best version of the underlined part of the sentence. The first choice is the same as the original sentence. If you think the original sentence is best, choose the first answer.\n"+
                    "1) Stamp collecting being a hobby that is sometimes used in the schools to teach economics and social studies.",
            "2) Knocked sideways, the statue looked as if it would fall.",
            "3) To walk, biking, and driving are Pat’s favorite ways of getting around.",
            "4) When you cross the street in the middle of the block, this is an example of jaywalking.",
            "5) Walking by the corner the other day, a child, I noticed, was watching for the light to change.",
            "Directions for questions 6–10: Rewrite the sentence in your head following the directions given below. Keep in mind that your new sentence should be well written and should have essentially the same meaning as the original sentence.6) It is easy to carry solid objects without spilling them, but the same cannot be said of liquids.Rewrite, beginning with Unlike liquids, The next words will be",
            "7) Although the sandpiper is easily frightened by noise and light, it will bravely resist any\n" +
                    "force that threatens its nest.\n"+"Rewrite, beginning with The sandpiper is easily frightened by noise and light,\n" +
                    "The next words will be",
            "8) If he had enough strength, Todd would move the boulder.\n" +
                    "Rewrite, beginning with Todd cannot move the boulder.\n"+"The next words will be",
            "9) The band began to play, and then the real party started.\n" +
                    "Rewrite, beginning with The real party started.\n"+"The next words will be",
            "10)  Chris heard no unusual noises when he listened in the park.\n" +
                    "Rewrite, beginning with Listening in the park,\n" +
                    "The next words will be"


    };


    private String mChoices [][] = {
            {"is a hobby because it is", "which is a hobby", "is a hobby"},
            {"Knocked sideways, the statue looked", "The statue was knocked sideways, looked", "The statue looked knocked sideways"},
            {"To walk, biking, and driving", "Walking, biking, and driving", "To walk, biking, and to drive"},
            {"When you cross the street in the middle of the block, this", "You cross the street in the middle of the block, this", "Crossing the street in the middle of the block"},
            {"a child, I noticed, was watching", "I noticed a child watching", "a child was watching, I noticed,"},

            {"it is easy to", "we can easily", "solid objects can easily be"},
            {"but it will bravely resist", "nevertheless bravely resisting", "and it will bravely resist"},
            {"when lacking", "because he", "although there"},
            {"after the band began", "and the band began", "although the band began"},
            {"then Chris heard no unusual noises", "and hearing no unusual noises", "Chris heard no unusual noises"}
    };



    private String mCorrectAnswers[] = {"is a hobby", "Knocked sideways, the statue looked", "Walking, biking, and driving", "Crossing the street in the middle of the block", "I noticed a child watching", "solid objects can easily be", "but it will bravely resist", "because he", "after the band began", "Chris heard no unusual noises"};




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
