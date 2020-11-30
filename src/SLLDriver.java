public class SLLDriver {
    public static void main(String[] args)
    {
        LittleSLL mySLL = new LittleSLL();
        mySLL.addNodetoStart(25);
        mySLL.addNodetoStart(38);
        mySLL.addNodetoStart(45);

        mySLL.showList();
        System.out.println("the list length is " + mySLL.length());

        mySLL.deleteNodeFromStart();
        mySLL.showList();
    }
}
