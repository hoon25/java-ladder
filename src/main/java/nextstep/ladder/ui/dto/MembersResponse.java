package nextstep.ladder.ui.dto;

import nextstep.ladder.domain.JoinMembers;

public class MembersResponse {
    private final String member;

    public MembersResponse(String member) {
        this.member = member;
    }

    public static MembersResponse from(JoinMembers members) {
        StringBuilder stringBuilder = members.getMembers().stream()
                .collect(
                        StringBuilder::new,
                        (sb, s) -> sb.append(String.format("%1$6s", s.getName())),
                        StringBuilder::append
                );
        stringBuilder.deleteCharAt(0);
        return new MembersResponse(stringBuilder.toString());
    }

    public String getResponse() {
        return member;
    }
}
