package testannotationandproxy;

/**
 *
 */
public class User {
    private String name;
    private PermissionAction permission;

    public String getName() {
        return name;
    }


    public User(String name, PermissionAction permission) {
        this.name = name;
        this.permission = permission;
    }
}
