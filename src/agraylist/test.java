package agraylist;
import java.util.ArrayList;
public class test {
public static void main(String[] args ) {
     ArrayList<String> list = new ArrayList<String>();
     list.add("hello");
     list.add("đc ch bà già ");
     list.add("đuc cóng ");
     for(int i=0;i<list.size();i++)
     {
     System.out.println(list.get(i));
     }
}
}
