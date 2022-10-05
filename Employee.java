package Employee;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax =0.03;
        if (salary<1000){
            return 0;
        } else {
            return salary*tax;
        }
    }

    public int bonus(){
        int bonus =30;
        int hour =40;
        int week =4;   // Varsayılan olarak 1 ayı 4 hafta aldım.
        if (workHours>hour){
            return (workHours-hour)*bonus*week;
        } else {
            return 0;
        }
    }

    public double raiseSalary(){
        int year = 2021;
        int experiment = year-hireYear;
        if (experiment<10 && experiment>0){
            return (salary*0.05)-tax()+bonus();
        } else if (experiment>9 && experiment<20){
            return (salary*0.1)-tax()+bonus();
        } else if (experiment>19) {
            return (salary*0.15)-tax()+bonus();
        } else {
            return salary-tax()+bonus();
        }
    }

    public String toString(){
        return "Çalışan adı soyadı :"+name+"\nİşe giriş yılı : "+hireYear+"\nHaftalık çalışma saati :"+workHours+"\nŞimdiki maaşı :"+raiseSalary();


    }
}
