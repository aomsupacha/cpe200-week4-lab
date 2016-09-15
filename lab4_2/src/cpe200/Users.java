package cpe200;
import java.util.ArrayList;
/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList = new ArrayList<User>();
    public void addUser(User user)
    {
        userList.add(user);
    }
    public void addUser(String userName, String password)
    {
    }
    public void deleteUser(User user)
    {
        userList.remove(user);
    }
    public boolean exists(User user) {
        for (int i = 0; i < userList.size(); i++) {
            if (user == userList.get(i)) {
                return true;
            }
        }
        return false;
    }
    public boolean usernameExists(String username)
    {
        for(int i = 0 ; i < userList.size();i++){
            if(username == userList.get(i).getUserName()){
                return true;
            }
        }
        return false;
    }
    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for(int i = 0 ; i < userList.size();i++){
            if(userName == userList.get(i).getUserName()){
                return userList.get(i);
            }
        }
        return null;
    }
    public int count()
    {
        return userList.size();
    }
    public User[] getUserArray()
    {
        User[] a = new User[userList.size()];
        for(int i = 0 ; i < userList.size();i++){
            a[i] =userList.get(i);
        }
        return a;
    }
}