import java.io.IOException;

class Parent{
    void msg() throws ArithmeticException{
        System.out.println("parent");}
}

class TestException extends Parent{
    void msg(){
        System.out.println("TestException");
    }
    public static void main(String args[]){
        Parent p=new TestException();
        p.msg();
    }
}  