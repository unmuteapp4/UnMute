package com.unmuteapp4gmail.unmute;


public class LogicQuestionLibrary {

    private String mQuestions [] = {
            "(1) Which of the following propositions is tautology?",
            "(2)  Which of the proposition is p^ (~ p v q) is",
            "(3)  Which of the following is/are tautology?",
            "(4)  Logical expression ( A^ B) → ( C' ^ A) → ( A ≡ 1) is",
            "(5)  Identify the valid conclusion from the premises Pv Q, Q → R, P → M, ˥M",
            "(6) Let a, b, c, d be propositions. Assume that the equivalence a ↔ (b v ˥b) and b ↔ c hold. Then truth value of the formula ( a ^ b) → ((a ^ c) v d) is always",
            "(7)  Which of the following is a declarative statement?",
            "(8) P → (Q → R) is equivalent to",
            "(9) Which of the following are tautologies?",
            "(10) If F1, F2 and F3 are propositional formulae such that F1 ^ F2 → F3 and F1 ^ F2→F3 are both tautologies, then which of the following is TRUE?"


    };


    private String mChoices [][] = {
            {"(p v q) -> q", "p v (q -> p)", "p v (p -> q)"},
            {"Tautology", "Contradiction", "Logically equivalent to p^q"},
            {"a v b -> b ^ c", "a ^ b -> b v c", "a v b -> (b -> c)"},
            {"Contradiction", "Valid", "Neither"},
            {"b ^ (p ^ r)", "r ^ (p v q)", "q ^ (p v r)"},

            {"True", "False", "Same as the truth value of a"},
            {"It's right", "He says", "I love you"},
            {"(p ^ q) -> r", "(p v q) -> r", "Neither"},
            {"((p v q) ^ q) <-> q", "((p v q) ^ 7 p) -> q", "Both"},
            {"f1 and f2 are tautologies", "conjunction f1 ^ f2 is not satisfiable", "Neither"}
    };



    private String mCorrectAnswers[] = {"p v (p -> q)", "Logically equivalent to p^q", "a ^ b -> b v c", "Neither", "q ^ (p v r)", "True", "He says", "(p ^ q) -> r", "Both", "conjunction f1 ^ f2 is not satisfiable"};




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
