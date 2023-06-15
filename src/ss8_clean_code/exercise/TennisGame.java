package ss8_clean_code.exercise;

public class TennisGame {
    public static final int ZERO_POINT = 0;
    public static final int ONE_POINT = 1;
    public static final int TWO_POINT = 2;
    public static final int THREE_POINT = 3;
    public static final int MIN_SCORE = 4;

    public static String showDrawMatch(int playerScore) {
        String notice = "";
        switch (playerScore) {
            case ZERO_POINT:
                notice += "Love-All";
                break;
            case ONE_POINT:
                notice += "Fifteen-All";
                break;
            case TWO_POINT:
                notice += "Thirty-All";
                break;
            case THREE_POINT:
                notice += "Forty-All";
                break;
            default:
                notice += "Deuce";
                break;
        }
        return notice;
    }

    public static String showResultDashBoard(int scorePlayer1, int scorePlayer2) {
        String notice = "";
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == 1) notice += "Advantage player1";
        else if (minusResult == -1) notice += "Advantage player2";
        else if (minusResult >= 2) notice += "Win for player1";
        else notice += "Win for player2";
        return notice;
    }

    public static String getScore(String firstPlayer, String secondPlayer, int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String notice = "";
        int temporaryScore = 0;
        if (scoreOfFirstPlayer == scoreOfSecondPlayer) {
            return showDrawMatch(scoreOfFirstPlayer);

        } else if (scoreOfFirstPlayer >= MIN_SCORE || scoreOfSecondPlayer >= MIN_SCORE) {
            return showResultDashBoard(scoreOfFirstPlayer, scoreOfSecondPlayer);
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
