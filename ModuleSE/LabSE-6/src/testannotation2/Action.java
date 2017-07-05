package testannotation2;

import java.lang.reflect.*;
import java.util.List;

import static testannotation2.PermissionAction.*;

 class Action {

    @MyPermission()
     void readFile(User user) throws NoSuchFieldException, IllegalAccessException {
        if (checkPermission(user, "readFile")) {
            System.out.println(getUserName(user) + " is allowed to read the file");
        } else {
            System.out.println(getUserName(user) + " is NOT allowed to read the file");
        }
    }

    @MyPermission(value = USER_CHANGE)
     void writeFile(User user) throws NoSuchFieldException, IllegalAccessException {
        if (checkPermission(user, "writeFile")) {
            System.out.println(getUserName(user) + " is allowed to write the file");
        } else {
            System.out.println(getUserName(user) + " is NOT allowed to write the file");
        }
    }

    private boolean checkPermission(User user, String methodName) {
        boolean isAllowed = false;
        try {
            List<PermissionAction> perm = user.getPermissions();
            MyPermission ann = Action.class.getDeclaredMethod(methodName, User.class).getAnnotation(MyPermission.class);
            PermissionAction annPerm = ann.value();

            if (perm.contains(annPerm)) {
                isAllowed = true;
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return isAllowed;
    }

    private String getUserName(User user) throws NoSuchFieldException, IllegalAccessException {
        Field nameField = user.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        String userName = (String) nameField.get(user);
        nameField.setAccessible(false);
        return userName;
    }
}


