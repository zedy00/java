
package pkg62_ogrencibilgisistemi;


public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    
    Student(String name, int classes, String stuNo, Course mat ,Course fizik ,Course kimya){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }
    
    public void addBulkExamNote(double yaziliMat,double sozluMat ,double yaziliFizik,double sozluFizik,double yaziliKimya, double sozluKimya){
        if(yaziliMat>=0 && yaziliMat<= 100){
            this.mat.genelNote = (yaziliMat*0.90)+ (sozluMat*0.10);
        }
        if(yaziliFizik >=0 && yaziliFizik <=100){
            this.fizik.genelNote = (yaziliFizik*0.80)+(sozluFizik*0.20);
        }
        if(yaziliKimya>= 0 && yaziliKimya <=100){
            this.kimya.genelNote = (yaziliKimya*0.70)+(sozluFizik*0.30);
        }
        
    }      
        public void isPass(){
            if(this.mat.genelNote == 0 || this.fizik.genelNote == 0 || this.kimya.genelNote == 0){
                System.out.println("Notlar tam olarak girilmemiş");
            }else{
                this.isPass = isCheckPass();
                printNote();
                System.out.println("Ortalama :" + this.avarage);
            }if(this.isPass){
                System.out.println("Sınıfı geçti.");
            }else{
                System.out.println("Sınıfta kaldı");
            }
        }
        
        public void calcAvarage(){
            this.avarage = (this.fizik.genelNote + this.kimya.genelNote+ this.mat.genelNote) / 3;
        }
        
        public boolean isCheckPass(){
            calcAvarage();
            return this.avarage >55;
        }
        public void printNote(){
            System.out.println("===========");
            System.out.println("Öğrenci :" + this.name);
            System.out.println("Matematik notu :" + this.mat.genelNote);
            System.out.println("Fizik notu :" + this.fizik.genelNote);
            System.out.println("Kimya notu :" + this.kimya.genelNote);
        }
}

