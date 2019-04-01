class Checker implements Comparator<Player> {

    public int compare(Player a, Player b) {
        int greater=a.name.length()>b.name.length()?a.name.length():b.name.length();
        if(a.score > b.score)
            return -1;
        else if(a.score < b.score)
            return 1;
        else
        {
            int compare=a.name.compareTo(b.name);
            if(compare<0)
                return -1;
            else if(compare>0)
                return 1;
        } 
        return 0;
    }
}
