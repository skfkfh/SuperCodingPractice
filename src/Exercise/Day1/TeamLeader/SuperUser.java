package Exercise.Day1.TeamLeader;

public class SuperUser extends User implements AdminRole,ReviewerRole,CustomerRole{

    public SuperUser(String username) {
        super(username);
    }
}