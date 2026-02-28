import java.util.*;
public class Ralist{
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<Integer>();

list.add(8);
list.add(5);
list.add(0);
System.out.println(list);

int element=list.get(0);
System.out.println(element);

list.add(1,4);
System.out.println(list);

list.set(3,7);
System.out.println(list);

list.remove(1);
System.out.println(list);

int size=list.size();
System.out.println(size);

for(int i=0;i<list.size();i++){
    System.out.print(list.get(i));
}
System.out.println();

Collections.sort(list);
System.out.println(list);
}
}
output
[8, 5, 0]
8
[8, 4, 5, 0]
[8, 4, 5, 7]
[8, 5, 7]
3
857
[5, 7, 8]

