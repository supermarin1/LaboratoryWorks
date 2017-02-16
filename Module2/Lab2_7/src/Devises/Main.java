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

        device = addDevice(device, new Monitor());
        device = addDevice(device, new EthernetAdapter());
        device = addDevice(device, new EthernetAdapter());
        device = addDevice(device, new Monitor());
        device = addDevice(device, new Monitor());
        device = addDevice(device, new EthernetAdapter());
        device = addDevice(device, new EthernetAdapter());


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
