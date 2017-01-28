/**
 *
 */
public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price = 1000f;
    private int quantityCPU;
    private int frequencyCPU ;

    public Computer(String manufacturer, int serialNumber, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }

    public void view (){
        System.out.println("Производитель: " + getManufacturer() + ", Серийный номер: " + getSerialNumber()+
        ", цена: " + getPrice() + ", кол-во: " + getQuantityCPU()+ ", частота " + getFrecuencyCPU());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrecuencyCPU() {
        return frequencyCPU;
    }

    public void setFrecuencyCPU(int frecuencyCPU) {
        this.frequencyCPU = frecuencyCPU;
    }
}

