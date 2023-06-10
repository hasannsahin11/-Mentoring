package Examples;

public class Club {
    private String name;
    private int quote;
    protected Member[] members;
    private static int numberOfMembers = 0;

    public Club(String name, int capacity) {
        this.name = name;
        this.members = new Member[capacity];
    }
    public void addMember(Member member){
        members[numberOfMembers] = member;
        numberOfMembers++;
    }
}
