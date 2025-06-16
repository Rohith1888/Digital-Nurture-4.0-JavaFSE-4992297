public class App {
    public static void main(String[] args) throws Exception {
        Logger instance1 = Logger.getInstance();
        Logger instance2 = Logger.getInstance();
        

        if(instance1 == instance2){
            System.out.println("Both are Same Instances");
        }else{
            System.out.println("These are two different instances");
        }
    }
}
