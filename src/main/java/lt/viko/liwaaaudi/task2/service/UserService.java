package lt.viko.liwaaaudi.task2.service;

import lt.viko.liwaaaudi.task_2.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void init() {
        System.out.println("UserService initialized");

        User liwaa = new User();
        liwaa.setName("Liwaa");
        liwaa.setEmpId(111);
        liwaa.setSalary(10000);

        User john = new User();
        john.setName("John");
        john.setEmpId(112);
        john.setSalary(10000);

        User carl = new User();
        carl.setName("Carl");
        carl.setEmpId(113);
        carl.setSalary(10000);

        users.put(liwaa.getName(), liwaa);
        users.put(john.getName(), liwaa);
        users.put(carl.getName(), liwaa);
    }

    public static User getUsers(String name) {
        return users.get(name);
    }
}
