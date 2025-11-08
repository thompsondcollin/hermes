package com.hermes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crypto")
public class CryptoController {

    @GetMapping("/ping")
    public String ping() {
        return "Hermes service is running ✅";
    }
}

