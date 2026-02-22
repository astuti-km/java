class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int off=0;
        int res=1;
        int cm=1;
        while(cm<n){
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
            }
            nums[off+1]=nums[cm];
            off++;
            res++;
            cm++;
        }
        return res;
    }
}


class Solution {
    int countFreq(int[] arr, int target) {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
class GfG {
    static Node rotate(Node head, int k) {
        if (k == 0 || head == null)
            return head;
        for (int i = 0; i < k; ++i) {
            Node curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = head;
            curr = curr.next;
            head = head.next;
            curr.next = null;
        }
        return head;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if(node.next != null){
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = rotate(head, 6);
        printList(head);
    }
}
