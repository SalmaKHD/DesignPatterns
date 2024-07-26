package creational.singleton;

public class Singleton {
    // eager initialization
    // private volatile static Singleton uniqueInstance = new Singleton();

   private volatile static Singleton uniqueInstance = null;
   private int data = 0;
   private Singleton(){}
   // make synchronized, so access will be limited to a single thread
   public static synchronized Singleton getInstance() {
       if(uniqueInstance == null) {
           synchronized(Singleton.class){
               if(uniqueInstance==null) {
                   uniqueInstance = new Singleton();
               }
           }
           uniqueInstance = new Singleton();
       }
       return uniqueInstance;
   }

   // add a set data here
   public void setData(int data) {
       this.data = data;
   }

   public int getData() {
       return data;
   }
}
