package ss8_clean_code.exercise;

public class TennisGame {
    public static final int ZERO_POINT = 0;
    public static final int ONE_POINT = 1;
    public static final int TWO_POINT = 2;
    public static final int THREE_POINT = 3;
    public static final int MIN_SCORE = 4;

    public static String getScore(String firstPlayer, String secondPlayer, int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String notice = "";
        int temporaryScore = 0;
        boolean isDraw = scoreOfFirstPlayer == scoreOfSecondPlayer;
        boolean isOver4 = scoreOfFirstPlayer >= MIN_SCORE || scoreOfSecondPlayer >= MIN_SCORE;
        if (isDraw) {
            switch (scoreOfFirstPlayer) {
                case ZERO_POINT:
                    notice = "Love-All";
                    break;
                case ONE_POINT:
                    notice = "Fifteen-All";
                    break;
                case TWO_POINT:
                    notice = "Thirty-All";
                    break;
                case THREE_POINT:
                    notice = "Forty-All";
                    break;
                default:
                    notice = "Deuce";
                    break;

            }
        } else if (isOver4) {
            int minusResult = scoreOfFirstPlayer - scoreOfSecondPlayer;
            if (minusResult == 1) notice = "Advantage player1";
            else if (minusResult == -1) notice = "Advantage player2";
            else if (minusResult >= 2) notice = "Win for player1";
            else notice = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) temporaryScore = scoreOfFirstPlayer;
                else {
                    notice += "-";
                    temporaryScore = scoreOfSecondPlayer;
                }
                switch (temporaryScore) {
                    case 0:
                        notice += "Love";
                        break;
                    case 1:
                        notice += "Fifteen";
                        break;
                    case 2:
                        notice += "Thirty";
                        break;
                    case 3:
                        notice += "Forty";
                        break;
                }
            }
        }
        return notice;
    }
}
