package com.nguyen.reunion.controllers;

import com.nguyen.reunion.model.Member;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class MemberController {
    @RequestMapping(value = "/member", method = GET)
    public Member getMember(){
        return new Member("Alan", "Nguyen");
    }

}
