public class ComputerV3 {
    public void computer(String input1, String input2, String input3) {
        graphicsCard(input1);
        centralProcessingUnit(input2);
        randomAccessMemory(input3);    
    }

    public void graphicsCard(String gpu) {
        System.out.print(gpu);
    }

    public void centralProcessingUnit(String cpu) {
        System.out.print("\t" + cpu);
    }

    public void randomAccessMemory(String ram) {
        System.out.print("\t" + ram);
    }
}