class Pen{
    String colour;
    String types;
    public void write(){
        System.out.println("Writing something.");
    }
    public void printColour(){
        System.out.println(this.colour);
        
    }public void types(){
        System.out.println(this.types);
    }
   
}
public class OOPS {
    public static void main(String args[]){
        Pen p=new Pen();
        p.colour="Blue";
        p.types="Ballpoint";

        Pen p2=new Pen();
        p2.colour="Black";
        p2.types="Gel";

        p.printColour();
        p2.printColour();
        p.types();
        p2.types();

        p.write();
        
    }
}
output
Blue
Black
Ballpoint
Gel
Writing something.

public class Rquick {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
   public static void quickSort(int[] arr,int low,int high){
    if(low<high){ 
        int pidx=partition(arr,low,high);
        quickSort(arr,low,pidx-1);
        quickSort(arr,pidx+1,high);
    }
   } 
   public static void main(String args[]){
    int arr[]={6,3,9,5,2,8};
    int n=arr.length;
    quickSort(arr,0,n-1);
    for(int i=0;i<n;i++){ 
    System.out.print(arr[i]+" ");
   }
   System.out.println();
}
}
output
2 3 5 6 8 9

class Pen{
    String colour;
    String types;
    public void write(){
        System.out.println("Writing something.");
    }
    public void printColourfg(){
        System.out.println(this.colour);
        System.out.println(this.types);
    }
}
public class OOPS {
    public static void main(String args[]){
        Pen p=new Pen();
        p.colour="Blue";
        p.types="Ballpoint";

        Pen p2=new Pen();
        p2.colour="Black";
        p2.types="Gel";
         p.write();
        p.printColourfg();
        p2.printColourfg();   
    }
}
output
Writing something.
Blue
Ballpoint
Black
Gel

class Student {
    String name;
    int roll;
    public void displayinfo(){
        System.out.println(name);
    }
    public void displayinfo(int age){
        System.out.println(age);
    }
    public void displayinfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
}
public class OOPS1 {
    public static void main(String args[]){
        Student s1=new Student();
        s1.displayinfo("Aman",24);
    }
}
output
Aman
24

