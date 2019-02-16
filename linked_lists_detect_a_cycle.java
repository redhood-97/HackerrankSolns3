boolean hasCycle(Node head) {
    
    Node fast = head;
    Node slow = head;
    boolean result = false;
    
    if(head == null)
        return false;
    
    /* check if it's a cycle at all */
    while(fast != null || fast.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;
        /* Now, check if there's any ending part of the list */
        if(fast == null || fast.next == null)
        {
            result = false;
            break;
        }
        else if(slow == fast)
        {
            result = true;
            break;
        }
    }
    
    return result;    
}
