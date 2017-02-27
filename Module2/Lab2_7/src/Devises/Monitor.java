package Devises;

/**
 *
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() + ", X = " + getResolutionX() + ", Y = " + getResolutionY();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (getManufacturer() != ((Monitor) obj).getManufacturer()) {
            return false;
        }
        if (resolutionX != ((Monitor) obj).resolutionX) {
            return false;
        }
        if (resolutionY != ((Monitor) obj).resolutionY) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return getResolutionX()*100;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
}
