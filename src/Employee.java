public class Employee {
    private String name;
    private int age;
    private double salary;
    private boolean active;
    private String[] skills;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("nama tidak boleh kosong!");
        } else {
            this.name = name;
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("salary harus lebih dari 0!");
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Gaji: " + salary);
        System.out.println("Aktif: " + active);
        System.out.print("Skills: ");
        if (skills != null) {
            for (String skill : skills) {
                System.out.print(skill + " ");
            }
            System.out.println();
        } else {
            System.out.println("Tidak ada skills");
        }
    }
}

// class Main{
//     public static void main(String[] args) {
//         Employee emp1 = new Employee();

//         emp1.setName("");
//         emp1.setAge(30);
//         emp1.setSalary(-2000000);
//         emp1.setActive(false);
//         emp1.setSkills(new String[]{"Java", "PHP", "JS"});

//         emp1.tampilkanInfo();

//         emp1.setAge(20);

//         System.out.println("Umur: " + emp1.getAge());
//     }
// }