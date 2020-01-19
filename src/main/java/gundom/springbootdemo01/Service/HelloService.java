package gundom.springbootdemo01.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHi(String name){
        return "Service:"+name;
    }

}
