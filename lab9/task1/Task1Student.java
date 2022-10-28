package lab9.task1;

public class Task1Student {
    public int idNumber[];

    public Task1Student(){
        idNumber = new int[9];

        idNumber[0] = 1234;
        idNumber[1] = 342;
        idNumber[2] = 575;
        idNumber[3] = 44;
        idNumber[4] = 234;
        idNumber[5] = 6732;
        idNumber[6] = 6643;
        idNumber[7] = 21;
        idNumber[8] = 24;

    }

    public void selectionSort(){
        for(int i = 0; i < idNumber.length; i++){
            int min = idNumber[i];
            int minIndex = i;
            for(int j = i + 1; j < idNumber.length; j++)
                if(idNumber[j] < min){
                    min = idNumber[j];
                    minIndex = j;
                }
            if(i != minIndex){
                int temp = idNumber[i];
                idNumber[i] = idNumber[minIndex];
                idNumber[minIndex] = temp;
            }
        }
    }

    public void print(){
        for(int i = 0; i < idNumber.length; i++){
            System.out.println(idNumber[i]);
        }
    }
}
