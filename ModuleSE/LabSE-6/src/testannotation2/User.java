package testannotation2;

import java.util.List;

public class User {
    private String name;
    private List<PermissionAction> permissions;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User name='" + name + '\'' +
                '}';
    }

    protected List<PermissionAction> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionAction> permissions) {
        this.permissions = permissions;
    }

}
