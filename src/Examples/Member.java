package Examples;

public class Member {
    public String id;
    private String name;
    private int annualIncome;
    private String phone;
    private static int ID = 100;


    public Member(String name, int annualIncome, String phone) {
        setName(name);
        setAnnualIncome(annualIncome);
        this.phone = phone;
        this.id = Integer.toString(ID);
        ID++;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", annualIncome=" + annualIncome +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Member.ID = ID;
    }

    public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getAnnualIncome () {
            return annualIncome;
        }

        public void setAnnualIncome ( int annualIncome){
            this.annualIncome = annualIncome;
        }

        public String getPhone () {
            return phone;
        }

        public void setPhone (String phone){
            this.phone = phone;
        }


    }

