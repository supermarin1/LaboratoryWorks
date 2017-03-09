package parseshape1;

import java.util.Comparator;

/**
 *
 */
public class ShapeColorComparator implements Comparator <Shape> {


    @Override
    public int compare(Shape o1, Shape o2) {
        int result = 0;
        if (o1.getShapeColor().compareTo(o2.getShapeColor()) > 0) {
            result = 1;
        } else if (o1.getShapeColor().compareTo(o2.getShapeColor()) == 0) {
            result = 0;
        } else if (o1.getShapeColor().compareTo(o2.getShapeColor()) < 0) {
            result = -1;
        }
        return result;
    }

}
