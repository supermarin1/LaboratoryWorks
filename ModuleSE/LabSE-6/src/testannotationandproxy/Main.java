package testannotationandproxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("John", PermissionAction.READ));
        users.add(new User("Paul", PermissionAction.READ));
        users.add(new User("Steven", PermissionAction.WRITE));
        users.add(new User("Rick", PermissionAction.WRITE));
        users.add(new User("Sam", PermissionAction.REFUSE));

        ReadWriteInterface action = new Action();

        ReadWriteInterface proxyAction =  ReadWriteProxy.newInstance(action);

        for (User user : users) {
            System.out.println(user.getName() + " tries to do smth");
            proxyAction.readFile(user);
            proxyAction.writeFile(user);
            System.out.println();
        }
    }
}
