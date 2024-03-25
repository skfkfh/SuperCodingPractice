package Exercise.Day1.TeamLeader;

public class ReviewerUser extends User implements ReviewerRole,CustomerRole{
    public ReviewerUser(String username) {
        super(username);
    }
}