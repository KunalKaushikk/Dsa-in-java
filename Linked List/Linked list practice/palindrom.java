import java.util.*;

class linkedlist {
    int value;
    linkedlist next;

    linkedlist() {
    }

    linkedlist(int value) {
        this.value = value;
    }

    linkedlist(int value, linkedlist next) {
        this.value = value;
        this.next = next;
    }
}

public class palindrom {
        // We'll divide linked list in 2 parts and reverse one
        // LinkedList<Integer> ll1 = new LinkedList<>();
        // ll1.add(1);
        // ll1.add(2);
        // ll1.add(2);
        // ll1.add(1);
        public  boolean isPalindrom(linkedlist head) {
            if(head==null||head.next==null){
                return false;
            }
        }
        linkedlist findMiddle(head);//return head of 1st half

        reverse(findMiddle.next){
            return secondHalfStart=reverse(findMiddle.next);
        }
    }
}
