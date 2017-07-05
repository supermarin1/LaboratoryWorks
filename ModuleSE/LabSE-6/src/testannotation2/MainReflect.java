package testannotation2;

import java.util.ArrayList;
import java.util.List;

public class MainReflect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        //Create permission lists
        List<PermissionAction> readOnly = new ArrayList<>();
        readOnly.add(PermissionAction.USER_READ);

        List<PermissionAction> readWrite = new ArrayList<>();
        readWrite.add(PermissionAction.USER_READ);
        readWrite.add(PermissionAction.USER_CHANGE);

        List<PermissionAction> nothing = new ArrayList<>();
        nothing.add(PermissionAction.USER_REFUSE_ACCESS);

        //Create users with allowed actions
        User Maryna = new User("Maryna");
        Maryna.setPermissions(readWrite);

        User Yurii = new User("Yurii");
        Yurii.setPermissions(readOnly);

        User Nataliia = new User("Nataliia");
        Nataliia.setPermissions(nothing);

        Action act = new Action();

        System.out.println("Reading:");
        act.readFile(Nataliia);
        act.readFile(Maryna);
        act.readFile(Yurii);

        System.out.println();

        System.out.println("Writing:");
        act.writeFile(Nataliia);
        act.writeFile(Maryna);
        act.writeFile(Yurii);
    }
}
