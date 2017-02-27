package Devises;

import Devises.Device;
import Devises.EthernetAdapter;
import Devises.Monitor;

import java.util.Arrays;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Device[] device = new Device[0];

        device = addDevice(device, new Monitor("ASUS", 1100, "SN101010", 1288, 860));
        device = addDevice(device, new EthernetAdapter(580, "TP-124578", 512, 20000));
        device = addDevice(device, new EthernetAdapter(680, "TP-124585", 1024, 205000));
        device = addDevice(device, new Monitor("DELL", 1500, "DN111122", 1600, 900));
        device = addDevice(device, new Monitor("DELL", 1500, "DN111123", 1600, 900));
        device = addDevice(device, new EthernetAdapter(280, "TP-120000", 128, 2000));
        device = addDevice(device, new EthernetAdapter(420, "TP-124000", 256, 3500));


        for (Device item : device) {
            System.out.println(item.getClass().getSimpleName() + ": " + item.toString());
        }
        System.out.println();
        System.out.println("The are " + device[device.length - 1].getCount() + " devices");
    }

    private static Device[] addDevice(Device[] device, Device newDevice) {
        Device[] newDeviceArray = Arrays.copyOf(device, device.length + 1);
        newDeviceArray[newDeviceArray.length - 1] = newDevice;
        return newDeviceArray;
    }
}
