package lab13.task2;

public class Person {
    private String Name;
    private String Surname;
    private String SecondName;

    public Person(String surname, String name, String secondName) {
        Surname = surname;
        Name = name;
        SecondName = secondName;
    }

    public Person(String surname) {
        Surname = surname;
    }

    public String getFIO(){
        String str = this.Surname;
        if(Name != null && !Name.equals(""))
            str = str + " " + Name;
        if(SecondName != null && !SecondName.equals(""))
            str = str + " " + SecondName;
        return str;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Итманов");
        Person p2 = new Person("Итманов", "", "");
        Person p3 = new Person("Итманов", "Александр", "Николаевич");

        System.out.println(p1.getFIO());
        System.out.println(p2.getFIO());
        System.out.println(p3.getFIO());
    }
}
