package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class User {
    public String userName;
    public String password;
    private static final String idREGEXUser = "([A-Za-z]+[a-zA-Z0-9]+)";

    public User() {
    }

    public boolean setUserName(String name) {
        if(name.length()<8){
            return false;
        }

        this.userName = name;

        Pattern p = Pattern.compile(idREGEXUser);

        Matcher m = p.matcher(this.userName);

        if(m.matches()){
            return true;
        }
        return false;

    }

    public boolean setPassword(String name) {

        if(name.length()<12){
            return false;
        }

        this.password = name;

        Pattern p1 = Pattern.compile("[a-z]");
        Matcher m1 = p1.matcher(name);
        Pattern p2 = Pattern.compile("[A-Z]");
        Matcher m2 = p2.matcher(name);
        Pattern p3 = Pattern.compile("[0-9]");
        Matcher m3 = p3.matcher(name);
        if(m1.find()&&m2.find()&&m3.find()){
            return true;
        }
        return false;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}