package Devises;

/**
 *
 */
public class EthernetAdapter extends Device {
    private int speed;
    private int mac;

    public EthernetAdapter(float price, String serialNumber, int speed, int mac) {
        super("TP-LINK", price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed = " + getSpeed() + ", mac = " + getMac();
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
        if (getManufacturer() != ((EthernetAdapter) obj).getManufacturer() ) {
            return false;
        }
        if (speed != ((EthernetAdapter) obj).speed) {
            return false;
        }
        if (mac != ((EthernetAdapter) obj).mac) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return getSpeed()*100;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMac() {
        return mac;
    }

    public void setMac(int mac) {
        this.mac = mac;
    }
}
