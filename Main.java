class Main{  
    
    String name; 
    int Hnum;
    String Street;  
    String City;
    String State;
    void insert(int i, String n,String ss, String c, String s) {  
        Hnum=i;  
        name=n; 
        Street=ss;
        City=c;
        State=s;
    }  
    void display(){System.out.println(Hnum+" "+name+" "+Street+" "+City+" "+State);}
}  
//public class Person {  
public static void main(String[] args) {  
    Main p1=new Main();  
    Main p2=new Main();  
    Main p3=new Main();  
    p1.insert(101,"ajeet","abc","abc","abc");
    p2.insert(102,"abhi","abc","abc","abc");
    p3.insert(103,"raj","abc","abc","abc");
    p1.display();  
    p2.display();
    p3.display();
}  
}  
