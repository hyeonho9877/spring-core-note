package spring.core;

import spring.core.member.Grade;
import spring.core.member.Member;
import spring.core.member.MemberService;
import spring.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);
        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = "+memberA.getName());
        System.out.println("find Member = "+findMember.getName());
    }
}
