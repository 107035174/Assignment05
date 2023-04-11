package Prob5;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processingSpeed;

    Computer(String manufacturer, String processor, int ramSize, double processingSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processingSpeed = processingSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessingSpeed() {
        return processingSpeed;
    }

    public double computePower() {
        return ramSize * processingSpeed;
    }

    public String toString() {
        return "Manufacturer: " + manufacturer + " | CPU: " + processor + " | RAM: " + ramSize + "GB | Processing speed: " + processingSpeed + "GHz";
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Computer n = (Computer) o;
        return this.manufacturer.equals(n.manufacturer) && this.processor.equals(n.processor) && this.ramSize == n.ramSize && this.processingSpeed == n.processingSpeed;
    }


}
