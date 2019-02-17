    public static class MyQueue<T> 
    {
        Stack<T> s1 = new Stack<T>();
        Stack<T> s2 = new Stack<T>();

        public void enqueue(T value) 
        {     
                 s1.push(value);
        }

        public T peek() 
        {
                 if(s2.isEmpty())
                    while(!s1.isEmpty())
                        s2.push(s1.pop());
                 return s2.peek();
        }

        public T dequeue() 
        {
                if(s2.isEmpty())
                    while(!s1.isEmpty())
                        s2.push(s1.pop());
                return s2.pop();
        }
    }

