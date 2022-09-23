package lab4;

public class Task4Test {
    public static void main(String[] args) {
        Task4Processor processorObj = new Task4Processor(12424, Task4ENUM.ASUS);
        Task4Monitor monitorObj = new Task4Monitor(13134, Task4ENUM.INTEL);
        Task4Memory memoryObj = new Task4Memory(3134, Task4ENUM.NVIDIA);

        System.out.println(processorObj.toString());
        System.out.println(monitorObj.toString());
        System.out.println(memoryObj.toString());
    }
}
