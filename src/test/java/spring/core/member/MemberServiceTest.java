package spring.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.core.AppConfig;

public class MemberServiceTest {

    MemberService memberService;
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        // given
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        // when
        memberService.join(memberA);
        Member result = memberService.findMember(1L);
        // then
        Assertions.assertThat(memberA).isEqualTo(result);
    }
}