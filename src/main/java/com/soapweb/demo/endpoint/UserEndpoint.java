package com.soapweb.demo.endpoint;


import com.soapweb.GetUserRequest;
import com.soapweb.GetUserResponse;
import com.soapweb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    @Autowired
    private UserService userService;

    @PayloadRoot(localPart = "getUserRequest", namespace = "http://.com/soapweb.demo")
    @ResponsePayload
    public  GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {

        GetUserResponse userResponse = new GetUserResponse();
        userResponse.setUser(userService.getUser(request.getName()));
        return userResponse;
     }
}
