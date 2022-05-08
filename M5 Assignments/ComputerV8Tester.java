public class ComputerV8Tester {
    public static void main(String[] args) {
        // Computers created
        ComputerV8 computer1 = new ComputerV8();
        ComputerV8 computer2 = new ComputerV8("RTX 2070 SUPER", "AMD Ryzen 7 3800X", "Trident Z Neo 2x16GB", "WD Passport 4TB", "Crucial BX500 2TB", "ASRock Phantom Gaming 4/ac", "Seasonic Gold 850W", "Cooler Master", 1200);
        ComputerV8 computer3 = new ComputerV8("RTX 3080", "AMD Ryzen 9 5950X", "Trident Z Neo 4x16GB", "WD Passport 4TB", "Sabrent Rocket NVMe 8TB", "ASRock", "Seasonic Gold 950W", "Cooler Master", 2000.0);

        // Computer1 set manually
        computer1.setGraphicsCard("GTX 970");
        computer1.setCentralProcessingUnit("AMD Athlon 64");
        computer1.setRandomAccessMemory("Crucial 2x4GB");
        computer1.setHardDrive("Toshiba 1TB");
        computer1.setSolidStateDrive("N/A");
        computer1.setMotherBoard("ASUS generic");
        computer1.setPowerSupply("ThermalTake 450W");
        computer1.setComputerCase("Cyperpower");
        computer1.setTotalCost(0);

        // Display Data
        System.out.println("Below are the specifications of the 3 computers.");
        System.out.println("------------------------------------------------");
        System.out.println("Computer1\nGraphics Card: " + computer1.getGraphicsCard() + "\nCPU: " + computer1.getCentralProcessingUnit() + "\nRAM: " + computer1.getRandomAccessMemory() + "\nHDD: " + computer1.getHardDrive() + "\nSSD: " + computer1.getSolidStateDrive() + "\nMOBO: " + computer1.getMotherBoard() + "\nPower Supply: " + computer1.getPowerSupply() + "\nCase: " + computer1.getComputerCase() + "\nTotalCost: $" + computer1.getTotalCost() + "\nCost w/out tax: $" + computer1.calcRegularCost() + "\nTax amount: $" + computer1.calcTaxCost() + "\n------------------------------------------------");
        System.out.println("Computer2\nGraphics Card: " + computer2.getGraphicsCard() + "\nCPU: " + computer2.getCentralProcessingUnit() + "\nRAM: " + computer2.getRandomAccessMemory() + "\nHDD: " + computer2.getHardDrive() + "\nSSD: " + computer2.getSolidStateDrive() + "\nMOBO: " + computer2.getMotherBoard() + "\nPower Supply: " + computer2.getPowerSupply() + "\nCase: " + computer2.getComputerCase() + "\nTotalCost: $" + computer2.getTotalCost() + "\nCost w/out tax: $" + computer2.calcRegularCost() + "\nTax amount: $" + computer2.calcTaxCost() + "\n------------------------------------------------");
        System.out.println("Computer3\nGraphics Card: " + computer3.getGraphicsCard() + "\nCPU: " + computer3.getCentralProcessingUnit() + "\nRAM: " + computer3.getRandomAccessMemory() + "\nHDD: " + computer3.getHardDrive() + "\nSSD: " + computer3.getSolidStateDrive() + "\nMOBO: " + computer3.getMotherBoard() + "\nPower Supply: " + computer3.getPowerSupply() + "\nCase: " + computer3.getComputerCase() + "\nTotalCost: $" + computer3.getTotalCost() + "\nCost w/out tax: $" + computer3.calcRegularCost() + "\nTax amount: $" + computer3.calcTaxCost() + "\n------------------------------------------------");

    }
}