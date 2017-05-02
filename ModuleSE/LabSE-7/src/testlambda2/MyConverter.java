package testlambda2;

/**
 * Created by Maringa on 02.05.2017.
 */
@FunctionalInterface
interface MyConverter {
    String convertStr(String str);

   static boolean isNull(String str){
       return str == null;
   }
}
