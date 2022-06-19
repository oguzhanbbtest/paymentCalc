public class Employee {
   // Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee (String name, double salary ,double workHours, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear= hireYear;

    }

    void toStrings(){
        double vergi = this.salary*0.03;
        double bonus = (this.workHours-40)*30;

        System.out.println("Adi : "+this.name);
        System.out.println("Maasi : "+this.salary);
        System.out.println("Calisma Saati : "+this.workHours);
        System.out.println("Baslangıc Yili : "+this.hireYear);
        System.out.println("================================");
        System.out.println("Vergi : "+vergi );
        System.out.println("Bonus : "+bonus);
        tax();
        bonus();
        System.out.println("Vergi ve Bonus eklenince Maas : "+this.salary);
        raiseSalary();
        System.out.println("Toplam Maasi : "+this.salary);

    }

    void tax(){

        if(this.salary < 1000){

        }else {
            this.salary -= this.salary*0.03;
        }

    }

    void bonus(){
        if(this.workHours > 40){
            this.salary += (this.workHours-40)*30;
        }
    }

    void raiseSalary(){
        double maasArtisi = 0;

        if (this.hireYear < 10){
            maasArtisi = this.salary*0.05;
            this.salary += this.salary*0.05;

        }else if (9 < this.hireYear ){
            if(this.hireYear < 20){
                maasArtisi = this.salary*0.1;
                this.salary += this.salary*0.1;
            }else if (19 < this.hireYear){
                maasArtisi = this.salary*0.15;
                this.salary += this.salary*0.15;
            }
        }
        System.out.println("Maas Artisi : "+maasArtisi);
    }
}
