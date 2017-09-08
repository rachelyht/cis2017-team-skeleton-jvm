package com.cs.cis.teamnode.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController {

    @RequestMapping("/ping")
    String pong() {
        return "pong"
    }
}
