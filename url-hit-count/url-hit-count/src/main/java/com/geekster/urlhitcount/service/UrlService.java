package com.geekster.urlhitcount.service;

import com.geekster.urlhitcount.model.Visit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlService {

    static Map<String,Integer> map=new HashMap<>();

    public UrlService() {
    }

    public static Map<String, Integer> getMap() {
        return map;
    }

    public static void setMap(Map<String, Integer> map) {
        UrlService.map = map;
    }

    public Visit getVisits(String username){
        //business logic

//        int count=1;
//        if(map.containsKey(username)){
//            count=map.get(username);
//            map.put(username,++count);
//        }else{
//            map.put(username,1);
//        }

        int count=map.getOrDefault(username,0)+1;
        map.put(username,count);

        return new Visit(username,count);
    }
}
