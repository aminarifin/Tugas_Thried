/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_thried;

/**
 *
 * @author asus
 */
public class NewClass implements Runnable{
    private int id;
    
    public NewClass(int id){
        this.id=id;
        
    }
    @Override
    public void run() {
        System.out.println("Thread:"+id+"");
        try{
                Thread.sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
        System.out.println("Thread:"+id+"");
    }
    
}
