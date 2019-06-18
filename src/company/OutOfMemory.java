package company;

public class OutOfMemory {
    public static void main(String[] args) {
        for (int i = 0; true; i++) {
            new Thread(){
                public void run(){
                    try{
                        Thread.sleep(1000000);
                    }catch (InterruptedException e){}
                }
            }.start();
            System.out.println("created : "+i);
        }
    }
}
