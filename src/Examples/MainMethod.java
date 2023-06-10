package Examples;

public class MainMethod {
    public static void main(String[] args) {
        Member member1 = new Member("Jason", 150000,"3127570363");
        Member member2 = new Member("Alfred", 150000,"3127575563");
        System.out.println(member2.getId());

        Club club  = new Club("Golf", 100);
        club.addMember(member1);
        club.addMember(member2);

        for (int i = 0; i < 2; i++) {
            System.out.println(club.members[i].getName());
            System.out.println(club.members[i].getId());
        }
    }
}



// Member member2 = new Member("Anthony",140000,"6302201047");
        // System.out.println(member2.getName());
