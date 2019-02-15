static int linkedlistlength(SinglyLinkedListNode head)
    {
        SinglyLinkedListNode current = head;
        int counter = 1;
        while(current.next != null)
        {
            current = current.next;
            counter++;
        }
        return counter;
    }
    
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode node1, node2;

        int node1_len = linkedlistlength(head1);
        int node2_len = linkedlistlength(head2);

        SinglyLinkedListNode longer = node1_len > node2_len ? head1 : head2;
        SinglyLinkedListNode shorter = node1_len > node2_len ? head2 : head1;

        int len_diff = Math.abs(node1_len - node2_len);
        /* To make the longer ptr start at the same position as that of the shorter one */
        while(len_diff != 0)
        {
            longer = longer.next;
            len_diff--;
        }
        /* Now, the traversing pointers start at the same zone */

        /* Now, we can traverse until we find the intersection point */

        while(longer != shorter)
        {
            longer = longer.next;
            shorter = shorter.next;
        }

        return shorter.data;
    }
