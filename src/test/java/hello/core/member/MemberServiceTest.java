package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join() {
        //given 주어진 것
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when 테스트 할 것
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then 잘 되는지 검증
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
