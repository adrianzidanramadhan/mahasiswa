public class Main{
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        // emp1.setName("");
        // emp1.setAge(30);
        // emp1.setSalary(-2000000);
        // emp1.setActive(false);
        // emp1.setSkills(new String[]{"Java", "PHP", "JS"});

        // emp1.tampilkanInfo();

        emp1.setAge(20);

        System.out.println("Umur: " + emp1.getAge());
        System.out.println("Skills: " + String.join(", ", emp1.getSkills()));
    }
}