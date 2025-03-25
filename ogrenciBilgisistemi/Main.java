
package ogrencibilgisistemi;


public class Main {

   
    public static void main(String[] args) {
       
        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya", "KMY101","KMY");
        
        
        Teacher t1 = new Teacher("Mahmut Hoca","90550000000","MAT");
        Teacher t2 = new Teacher("Fatma ayşe","905500000001","FZK");
        Teacher t3 = new Teacher("Ali Veli","90550000000002","KMY");
        
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        
        Student s1 = new Student("İnek şaban",4,"1401144015",mat ,fizik,kimya);
        
        s1.addBulkExamNote(50,20,40,20,70,40);
        s1.isPass();
        
        Student s2 = new Student("Güdük necmi",4,"2211133",mat,fizik,kimya);
        
        s2.addBulkExamNote(50,10,40,80,70,20);
        s2.isPass();
        
        Student s3 = new Student("Hayta ismail",4,"221121312",mat,fizik,kimya);
        
        s3.addBulkExamNote(50,20,60,20,90,15);
        s3.isPass();
    }
    
}
