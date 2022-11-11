public class Ques4 {
    static int a = 20;
    Ques4() {
        a++;
    }
    void m1() {
        a++;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Ques4 obj = new Ques4();
        Ques4 obj2 = new Ques4();
        Ques4 obj3 = new Ques4();
        obj3.m1();
    }
}