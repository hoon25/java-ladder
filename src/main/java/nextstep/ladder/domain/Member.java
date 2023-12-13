package nextstep.ladder.domain;

public class Member {
    public static final int MAX_NAME_LENGTH = 5;
    public static final int MIN_NAME_LENGTH = 0;

    private final String name;

    public Member(String name) {
        validateNameLength(name);
        this.name = name;
    }

    private static void validateNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH || name.length() <= MIN_NAME_LENGTH) {
            throw new IllegalArgumentException("등록한 이름: " + name + ", 이름은 1~5글자로 등록되어야합니다.");
        }
    }

    public String getName() {
        return name;
    }
}