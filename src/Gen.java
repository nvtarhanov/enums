public class Gen<T, V>{
    T ob1;
    V ob2;

    Gen(T o1, V o2) {
        this.ob1 = o1;
        this.ob2 = o2;
    }

    void  showTipes(){
        System.out.println("T " + ob1.getClass().getName());
        System.out.println("V " + ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }

}
class SimpleGen{
    public static void main(String args[]){
       Gen<Integer,String> tgObj = new Gen<Integer, String>(88,"test");

       tgObj.showTipes();

       int v = tgObj.getOb1();
        System.out.println(v);
       String str = tgObj.getOb2();
        System.out.println(str);

    }
}