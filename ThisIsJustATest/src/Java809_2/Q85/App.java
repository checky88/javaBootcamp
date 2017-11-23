package Java809_2.Q85;

/**
 * Created by KellyR on 10/11/2017.
 */
class App {

    public void doRegister(String name, int age) throws UserException, AgeOutOfLimitException {
        if (name.length() < 6) {
            throw new UserException();
        } else if (age >= 60) {
            throw new AgeOutOfLimitException();
        } else {
            System.out.println("User is registered.");
        }
    }

    public static void main(String[] args) throws UserException {
        App t = new App();
        t.doRegister("Mathew", 60);
    }
}