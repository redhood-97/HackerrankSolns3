static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

            SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
            if(position == 0)
            {
                new_node.next = head;
                head = new_node;
                return head;
            }

            if(head == null)
            {
                head = new_node;
                return head;
            }

            SinglyLinkedListNode current = head;

            int position_tracker = 0;
            /* to get to one node before the position mentioned */
            while(position_tracker < position - 1)
            {
                current = current.next;
                position_tracker++;
            }
            /* we have reached one node before the position given */

            new_node.next = current.next;
            current.next = new_node;
            return head;
    }
