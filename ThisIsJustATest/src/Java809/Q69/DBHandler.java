package Java809.Q69;

/**
 * Created by KellyR on 06/11/2017.
 */
public class DBHandler {
    DBConfiguration configureDB(String uname, String password) {
        // insert code here

        return new DBConfiguration();
    }

    public static void main(String[] args) {
        DBHandler r = new DBHandler();
        DBConfiguration dbConf = r.configureDB("manager", "manager");
    }
}