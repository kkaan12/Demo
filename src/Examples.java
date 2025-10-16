public class Examples {
    int instanceVar = 10;

    public void printInstanceVar() {
        System.out.println("Instance variable inside method: " + this.instanceVar);
        int localVar = 5;
        System.out.println("Local variable inside method: " + localVar);
    }

    public static void main(String[] args) {
        Examples obj = new Examples();
        obj.printInstanceVar();
    }
}