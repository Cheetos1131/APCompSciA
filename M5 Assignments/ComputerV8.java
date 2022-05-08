/*
 * Purpose:To use OOP to create a class that can be accessed in a tester class using a variety of methods.
 * @author: Iker Perez-Calderon
 * @version: 1/9/2022
 */
import java.lang.Math;

public class ComputerV8 {
    // Variables
    private String g;
    private String c;
    private String r;
    private String h;
    private String s;
    private String m;
    private String p; 
    private String cc; 
    private double co;

    // Constructors

    public ComputerV8() {

    }

    public ComputerV8(String gpu, String cpu, String ram, String hdd, String ssd, String mobo, String powerSupply, String computerCase, int totalCost) {
        g = gpu;
        c = cpu;
        r = ram;
        h = hdd;
        s = ssd;
        m = mobo;
        p = powerSupply;
        cc = computerCase;
        co = totalCost;
    }

    public ComputerV8(String gpu, String cpu, String ram, String hdd, String ssd, String mobo, String powerSupply, String computerCase, double totalCost) {
        g = gpu;
        c = cpu;
        r = ram;
        h = hdd;
        s = ssd;
        m = mobo;
        p = powerSupply;
        cc = computerCase;
        co = totalCost;
    }

    // Getter methods

    public String getGraphicsCard() {
        return g;
    }

    public String getCentralProcessingUnit() {
       return c;
    }

    public String getRandomAccessMemory() {
        return r;
    }

    public String getHardDrive() {
        return h;
    }

    public String getSolidStateDrive() {
        return s;
    }

    public String getMotherBoard() {
        return m;
    }

    public String getPowerSupply() {
        return p;
    }

    public String getComputerCase() {
        return cc;
    }

    public double getTotalCost() {
        return co;
    }

    // Setter methods

    public void setGraphicsCard(String gpu) {
        g = gpu;
    }

    public void setCentralProcessingUnit(String cpu) {
        c = cpu;
    }

    public void setRandomAccessMemory(String ram) {
        r = ram;
    }

    public void setHardDrive(String hdd) {
        h = hdd;
    }

    public void setSolidStateDrive(String ssd) {
        s = ssd;
    }

    public void setMotherBoard(String mobo) {
        m = mobo;
    }

    public void setPowerSupply(String powerSupply) {
        p = powerSupply;
    }

    public void setComputerCase(String computerCase) {
        cc = computerCase;
    }

    public void setTotalCost(int totalCost) {
        co = totalCost;
    }

    public void setTotalCost(double totalCost) {
        co = totalCost;
    }

    // Overloaded methods

    public double calcRegularCost() {
        double taxPortion = co * 0.07;
        return (co - taxPortion);
    }

    public double calcTaxCost() {
        double tax = co * 0.07;
        return (double)(Math.round(tax * 100) / 100);
    }

}