package junseok.snr.sns.controller;

import junseok.snr.sns.domain.member.dto.RegisterMemberCommand;
import junseok.snr.sns.domain.member.entity.Member;
import junseok.snr.sns.domain.member.service.MemberWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberWriteService memberWriteService;

    @PostMapping
    public Member register(@RequestBody RegisterMemberCommand command) {
        return memberWriteService.create(command);
    }
}
