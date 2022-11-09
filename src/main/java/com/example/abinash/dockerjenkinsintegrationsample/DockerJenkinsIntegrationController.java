package com.example.abinash.dockerjenkinsintegrationsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerJenkinsIntegrationController {

    @GetMapping("/")
    public String printMessage(){
        return "Congratulations you have successfully deployed your app to kubernetes.";
    }

}
