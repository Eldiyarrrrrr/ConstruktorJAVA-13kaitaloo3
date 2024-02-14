public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("bek" , "avazbekov" , 18 , 50000 , 35000);
        Person person2 = new Person("beka" , "kalybek uulu" , 18 , 90000 , 34000);
        Person person3 = new Person("kuba" , "jumabekov" , 18 , 20000 , 100000);
        Person person4 = new Person("umar" , "esenov" , 18 , 230000 , 5000);
        Person person5 = new Person("jigit" , "amanov" , 18 , 500000 , 15000);


        Person[] person = {person1,person2,person3,person4,person5};

        System.out.println(Person.methodMaxSalary(person));
        System.out.println(Person.methodMinSalary(person));
        System.out.println(Person.methodMaxPhone(person));


    }
}