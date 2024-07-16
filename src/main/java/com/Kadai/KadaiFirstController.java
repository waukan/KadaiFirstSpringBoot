package com.Kadai;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{day}")
    public String dispDayOfWeek(@PathVariable String day) {
        LocalDate ld = LocalDate.parse(day, DateTimeFormatter.ofPattern("yyyyMMdd"));
        DayOfWeek w = ld.getDayOfWeek();
        String dow = w.toString();
        return dow;
    }

    @GetMapping("/plus/{x}/{y}")
    public int calcPlus(@PathVariable int x, @PathVariable int y) {
        int res = 0;
        res = x + y;
        return res;
    }

    @GetMapping("/minus/{x}/{y}")
    public int calcMinus(@PathVariable int x, @PathVariable int y) {
        int res = 0;
        res = x - y;
        return res;
    }

    @GetMapping("/times/{x}/{y}")
    public int calcTimes(@PathVariable int x, @PathVariable int y) {
        int res = 0;
        res = x * y;
        return res;
    }

    @GetMapping("/divide/{x}/{y}")
    public int calcDivide(@PathVariable int x, @PathVariable int y) {
        int res = 0;
        res = x / y;
        return res;
    }

}
