class Node {
    constructor(val) {
        this.data = val;
        this.next = null;
    }
}
function reverse(head) {
    let prev = null;
    let curr = head;
    let next;

    while (curr !== null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
function trimLeadingZeros(head) {
    while (head !== null && head.data === 0) {
        head = head.next;
    }
    return head;
}
function addTwoLists(num1, num2) {
    let res = null;
    let curr = null;
    let carry = 0;
    
    num1 = trimLeadingZeros(num1);
    num2 = trimLeadingZeros(num2);
    
    num1 = reverse(num1);
    num2 = reverse(num2);
    while (num1 !== null || num2 !== null || carry !== 0) {
        let sum = carry;
        
        if (num1 !== null) {
            sum += num1.data;
            num1 = num1.next;
        }

        if (num2 !== null) {
            sum += num2.data;
            num2 = num2.next;
        }

        let newNode = new Node(sum % 10);

        carry = Math.floor(sum / 10);
        if (res === null) {
            res = newNode;
            curr = newNode;
        } 
        else {
            curr.next = newNode;
            curr = curr.next;
        }
    }

    return reverse(res);
}

function printList(head) {
    let curr = head;
    let result = '';
    while (curr !== null) {
        result += curr.data;
        if(curr.next !== null){
            result += " -> ";
        }
        curr = curr.next;
    }
    console.log(result.trim());
}
let num1 = new Node(1);
num1.next = new Node(2);
num1.next.next = new Node(3);

let num2 = new Node(9);
num2.next = new Node(9);
num2.next.next = new Node(9);

let sum = addTwoLists(num1, num2);
printList(sum);

class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

function cloneLinkedList(head) {
    
    const mp = new Map();
    let curr = head;
    while (curr !== null) {
        mp.set(curr, new Node(curr.data));
        curr = curr.next;
    }
    
    curr = head;
    while (curr !== null) {
        const newNode = mp.get(curr);
        newNode.next = mp.get(curr.next) || null;
        newNode.random = mp.get(curr.random) || null;
        curr = curr.next;
    }
  
    return mp.get(head) || null;
}

function printList(head) {
    let result = "";
    while (head !== null) {
        result += head.data + "(";
        result += head.random ? head.random.data : "null";
        result += ")";

        if (head.next !== null) {
            result += " -> ";
        }
        head = head.next;
    }
    console.log(result);
}
const head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(3);
head.next.next.next = new Node(4);
head.next.next.next.next = new Node(5);

head.random = head.next.next;
head.next.random = head;
head.next.next.random = head.next.next.next.next;
head.next.next.next.random = head.next.next;
head.next.next.next.next.random = head.next;
console.log("Original linked list:");
printList(head);

const clonedList = cloneLinkedList(head);

console.log("Cloned linked list:");
printList(clonedList);

public class Rfact {
    static int  printFact(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact=printFact(n-1);
        return n*fact;
    }
    public static void main(String[] args) {
        int n=5;
        int ans = printFact(n);
        System.out.println(ans);
    }
}

public class Rfibo {
    static void printFibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        printFibo(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=7;
        printFibo(a,b,n-2);
    }
}


public class sum1 {
    static void printSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
            sum+=i;
            printSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        printSum(1,5,0);
    }
}


public class printNum {
    static void countNum(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        countNum(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        countNum(n);
    }
}

public class printNum {
    static void countNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        countNum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        countNum(n);
    }
}

