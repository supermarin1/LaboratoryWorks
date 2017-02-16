package Devises;

/**
 *
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    private static int count = 0;

    public Device(){
        count ++;
        this.manufacturer = "Samsung";
        this.price = count*11;
        this.serialNumber = "SM0000" + count;
    }

    @Override
    public String toString() {
        return "manufacturer = " + getManufacturer() + ", price = " + getPrice() + ", serialNumber = " + getSerialNumber();
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
        if (manufacturer != ((Device) obj).manufacturer) {
            return false;
        }
        if (price != ((Device) obj).price) {
            return false;
        }
        if (serialNumber != ((Device) obj).serialNumber) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int) price*100;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getCount() {
        return count;
    }

}
