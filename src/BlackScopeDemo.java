public class BlockScopeDemo {
    public static void main(String[] args) {
        int outerX=5;
        if (outerX<20){
            int innerY=15;
            System.out.println("Value of outerX inside to if block: "+outerX);
            System.out.println("Value of innerY inside to if block: "+innerY);
        }
        System.out.println("Value of outerX outside to if block : "+outerX);
    }
}
