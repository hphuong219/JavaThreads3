public class OddThread extends Thread{
    @Override
    public void run() {
        int count  = 10;
        for (int i = 0; i < count; i++) {
            if(i%2 !=0) {
                System.out.println(getName()+" " + i);
            }
         try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    }
}
