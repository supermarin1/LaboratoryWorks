package testannotationandproxy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 *
 */
public class ReadWriteProxy implements InvocationHandler{
    Object obj;

    public ReadWriteProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //taking method annotation
        MyPermission ann = Action.class.getDeclaredMethod(method.getName(),User.class).getAnnotation(MyPermission.class);
        PermissionAction perm = ann.value();

        //taking user permission

        for (Object arg : args) {
            Field field =  arg.getClass().getDeclaredField("permission");
            field.setAccessible(true);
            PermissionAction userPerm = (PermissionAction) field.get(arg);
            field.setAccessible(false);

            //checking allowance
            System.out.println("Checking allowance for " + method.getName());

            if (perm.equals(userPerm)){
                method.invoke(obj,args);
            } else {
                System.out.println("You are not allowed");
            }
        }
        return null;
    }

    static ReadWriteInterface newInstance (Object objAction){
        return  (ReadWriteInterface) Proxy.newProxyInstance(objAction.getClass().getClassLoader(),
                objAction.getClass().getInterfaces(),
                new ReadWriteProxy(objAction));
    }
}
