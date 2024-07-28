package observerdesign;

public class Registrant implements Observer {
    @Override
    public void update(ScoreSubject observable) {
        System.out.println("live result: " +
                ((Reporter) observable).getScoreLine());
    }

}
