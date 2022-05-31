package lt.viko.liwaaaudi.task2.endpoint;

import lt.viko.liwaaaudi.task2.service.UserService;
import lt.viko.liwaaaudi.task_2.GetUserRequest;
import lt.viko.liwaaaudi.task_2.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {
    @Autowired
    private UserService userService;


    @PayloadRoot(namespace = "http://liwaaaudi.viko.lt/task-2",
            localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(UserService.getUsers(request.getName()));
        return response;
    }
}
