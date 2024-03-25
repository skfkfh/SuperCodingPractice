package Exercise.Day1.TeamLeader;

public abstract class User {

    protected String username;

    public User(String username) {
        this.username = username;
    }

    public void order() {
        System.out.println(this.username + "은 주문을 할 수 있습니다.");
    }

    public void payment() {
        System.out.println(this.username + "은 결제를 할 수 있습니다.");
    }

    public void writeReview() {
        System.out.println("ReviewRole을 맡아서 리뷰 작성할 수 있습니다.");
    }

    public void giveRating() {
        System.out.println("ReviewRole을 맡아서 점수 평가할 수 있습니다.");
    }


    public void manageUsers() {
        System.out.println("슈퍼유저(" + this.username + ")은 유저를 매니징 할 수 있습니다.");
    }


    public void changeSettings() {
        System.out.println("슈퍼유저(" + this.username + ")은 세팅을 변경할 수 있습니다.");
    }
}