package testannotationandproxy;

/**
 *
 */
public class Action implements ReadWriteInterface {

    @MyPermission (value = PermissionAction.READ)
    public void readFile(User user){
        System.out.println("You are allowed to read the file");
    }

    @MyPermission(value = PermissionAction.WRITE)
    public void writeFile(User user){
        System.out.println("You are allowed to write the file");

    }
}
