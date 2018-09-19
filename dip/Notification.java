package dip;

public class Notification {
    private Email email;
    public Notification()
    {
        email = new Email();
    }

    public void emailDistribution ()
    {
        email.send();
    }
}
