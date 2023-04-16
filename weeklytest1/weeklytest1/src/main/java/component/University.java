package component;

import org.springframework.stereotype.Component;

@Component
public class University {

    public String about(){
        return "The University of Mysore was established on July 27, 1916";
    }
}