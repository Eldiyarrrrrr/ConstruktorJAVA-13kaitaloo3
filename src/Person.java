public class Person {
    String name;
    String surname;
    int age;
    int salary;
    int pricePhone;

    public Person(String name, String surname, int age, int salary, int pricePhone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.pricePhone = pricePhone;
    }
    public static int methodMaxSalary(Person[] person){
        int maxSalary = Integer.MIN_VALUE;
        for (Person naem : person){
            if (naem.salary > maxSalary){
                maxSalary = naem.salary;

            }
        }
        System.out.print("En chon zarplat: ");
        return maxSalary;
    }
    public static int methodMinSalary(Person[] person){
        int minSalary = Integer.MAX_VALUE;
        for (Person names : person){
            if (names.salary < minSalary){
                minSalary = names.salary;
            }
        }
        System.out.print("En az zarplat: ");
        return minSalary;
    }
    public static int methodMaxPhone(Person[] person) {
        int minPhoneSum = Integer.MIN_VALUE;
        for (Person phoneNum : person){
            if (phoneNum.pricePhone > minPhoneSum){
                minPhoneSum = phoneNum.pricePhone;

            }
        }
        System.out.print("En kymbat phone: ");
        return minPhoneSum;
    }
}
