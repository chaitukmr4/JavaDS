//package com.codility;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

class VisitCounter {
    public static void main(String[] args) {
        VisitCounter visitCounter = new VisitCounter();

        Map<String, UserStats>  map1 = new HashMap<>();
        map1.put("123", new UserStats(10L));
        map1.put("234", new UserStats(10L));
        map1.put("345", new UserStats(10L));


        Map<String, UserStats>  map2 = new HashMap<>();
        map2.put("123", new UserStats(20L));
        map2.put("234", new UserStats(10L));
        map2.put("345", new UserStats(10L));


        Map<String, UserStats>  map3 = new HashMap<>();
        map3.put("123", new UserStats(20L));
        map3.put("234", new UserStats(10L));
        map3.put("345", new UserStats(10L));


        Map<String, UserStats>[] array = new HashMap[3];
        array[0] = map1;
        array[1] = map2;
        array[2] = map3;
        System.out.println(" The value iss "+visitCounter.count(array));
    }

    Map<Long, Long> count(Map<String, UserStats>... visits) {

        return Arrays.stream(visits)
                .filter(x -> !x.isEmpty())
                .flatMap(x -> x.entrySet().stream())
                .filter(x -> x.getKey() != null && x.getValue() != null && x.getValue().getVisitCount().isPresent())
                .collect(Collectors.toMap(map -> Long.parseLong(map.getKey()), map -> map.getValue().getVisitCount().get(), (ov, nv) -> ov+nv))
                .entrySet().stream().collect(Collectors.groupingBy(map -> map.getKey(), Collectors.summingLong(map -> map.getValue())));

    }
}
