public class Test {

    int id;
    Test(int id){
        this.id=id;
        System.out.println("Object " + id + "created");
    }

    protected  void finalize(){
        System.out.println("Object " + id + "is garbage collected");
    }

    public static void main(String[] args) {
        Test t1 = new Test(1);
        Test t2 = new Test(2);

        t1=null;
        t2=null;

        System.gc();

        System.out.println("End of main()");

    }


}
