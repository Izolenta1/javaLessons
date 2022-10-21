package lab6.task6_7_8_9;

public class Task6Test {
    public static void main(String[] args) {
        Task6Book book1 = new Task6Book("name1");
        Task6Book book2 = new Task6Book("name2");
        Task6Shop shop1 = new Task6Shop("shop1");
        Task6Shop shop2 = new Task6Shop("shop2");

        Task6Printable[] printableMas ={book1,book2,shop1,shop2};

        for(int i = 0; i < printableMas.length; i++){
            printableMas[i].print();
        }
    }
}
