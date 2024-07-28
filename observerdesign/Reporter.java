package observerdesign;

public class Reporter extends ScoreSubject {
    String scoreLine;

    public void setScoreLine(String scoreStr) {
        scoreLine = scoreStr;
        notifyObservers();
    }

    public String getScoreLine() {
        return scoreLine;
    }
}
