public class LittleSLL {

    //variables
    private Node head;

    //construstor
    public LittleSLL()
    {
        head = null;
    }

    //populate the list
    public void addNodetoStart(int addData)
    {
        head = new Node(addData, head);
    }

    public void deleteNodeFromStart()
    {
        if(head != null)
        {
            head = head.getLink();
        }
        else
        {
            System.out.println("Delete from an empty list?");
            System.exit(0);
        }
    }
    //to display list

    public void showList()
    {
        Node position =  head;
        while (position != null)
        {
            System.out.println(position.getDate());
            position = position.getLink();
        }
    }//end method to output list

    public boolean hasNext()
    {
        Node position = head;
        if(position.getLink() != null)
        {
            return true;
        }
        return false;
    }

    public int length()
    {
        int count = 0;
        Node position = head;
        while(position != null)
        {
            count++;
            position = position.getLink();
        }
        return count;
    }

    private class  Node{
        //instance variables
        private int date;

        private Node link;

        //constructor
            public Node (int date, Node link)
            {
                this.date = date;
                this.link = link;
            }

        //getters and setters
        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            this.date = date;
        }

        public Node getLink() {
            return link;
        }

        public void setLink(Node link) {
            this.link = link;
        }

        //toString
        public String toString()
        {
            return "data: " + date + " links to " + link;
        }
        }
    }//end LittleSSL

