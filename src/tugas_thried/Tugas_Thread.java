/*
Nama : Amin Arifin
NIM  : 5160311120
 */
package tugas_thried;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author asus
 */
public class Tugas_Thread {
public String angka;

public void setName(String newName){
    angka = newName;
}
    public String getName(){
        return angka;
        
    }
 
    public static void main(String[] args) {
        ExecutorService service=Executors.newFixedThreadPool(6);
for (int i = 1; i < 6; i++){
    service.submit(new NewClass(1));
    Tugas_Thread testangka=new Tugas_Thread();
    testangka.setName("Adalah Bilangan Ganjil");
    for (int angka = 1; angka <100; angka=angka+2){
        System.out.println(angka+testangka.getName());
        
    }
}
System.out.println("=============semua task telah disubmit=========");
service.shutdown();

try{
    service.awaitTermination(1, TimeUnit.DAYS);
}catch(InterruptedException e){
    e.printStackTrace();
}
System.out.println("Thried");
    }
    
}
