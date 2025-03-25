package maashesaplama;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        // maas vergisi
        if (this.salary > 1000) {
            return (this.salary * 0.03);
        } else {
            return 0;
        }
    }

    public double bonus() {
       
        if (workHours > 40) {
             this.workHours = workHours - 40;
            return (this.workHours * 30);

        }
        return 0;
    }

    public double raiseSalary() {
        this.hireYear = 2021 - hireYear;
        if (hireYear > 19) {
            return (salary * 0.15);
        } else if (hireYear > 10 && hireYear <= 19) {
            return (salary * 0.10);
        } else{
            return (salary * 0.05);
        }
    }
    
    
    @Override
    public String toString(){
        return  "Adı :"+name+"\nMaaşı :"+salary+"\nÇalısma saati :"+workHours+"\nBaşlangıç yılı :"+hireYear+"\nVergi :" + tax() +"\nBonus :" +
                bonus()+"\nMaaş Artışı :"+raiseSalary()
                +"\nVergi ve Bonuslar ile birlikte maaş :" +((this.workHours * 30)-tax()+salary)+
                "\nToplam maaş :" +((this.workHours * 30)-tax()+salary+ raiseSalary());
    } 
}
