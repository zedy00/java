package pkg46_odev_switch_case_ile._bankamatik;

import java.util.Scanner;


public class _bankamatik {

    
    public static void main(String[] args) {
        String userName , password ;
        
        Scanner input = new Scanner(System.in);
        
        int right = 3;
        int balance = 1500;
        int select ;
        int price;
        
        
        while(right>0){
            System.out.println("Kullanıcı adınız :");
            userName = input.nextLine();
            
            System.out.println("Sifreniz :");
            password = input.nextLine();
            
            if(userName.equals("patika")&& password.equals("dev123")){
                System.out.println("Merhaba hoşgeldiniz");
            }
            do{
                System.out.println("1-Para yatırma\n"+
                        "2-Para Çekme\n"+
                        "3-Bakiye sorgula\n" +
                        "4-çıkış yap");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçin");
            
                select = input.nextInt();
                switch(select){
                    case 1:
                        System.out.println("Para miktarı :");
                        price = input.nextInt();
                        balance = price + balance;
                        break;
                    case 2:
                        System.out.println("Para miktarı :");
                        price = input.nextInt();
                        if(price>balance){
                            System.out.println("Bakiye yetersiz");
                        }else{
                            balance -= price;
                        }
                        break;
                    case 3: 
                        System.out.println("Bakiyeniz : "+ balance);
                        break;
                }
                
            }while(select != 4);
            System.out.println("işlem başarılı");
        }
        
        
        System.out.println();
    }
    
}
