package com.company.M2ChallengeLiZheQi.controller;

import com.company.M2ChallengeLiZheQi.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MonthController {
    //List
    private static List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month(1, "January"),
            new Month(2, "February"),
            new Month(3, "March"),
            new Month(4, "April"),
            new Month(5, "May"),
            new Month(6, "June"),
            new Month(7, "July"),
            new Month(8, "August"),
            new Month(9, "September"),
            new Month(10, "October"),
            new Month(11, "November"),
            new Month(12, "December")
            ));

    //GET one month route
    @RequestMapping(value="/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month getMonthByNumber(@PathVariable int monthNumber) {
        Month monthResult = null;

        for(Month month : monthList) {
            if(month.getNumber() == monthNumber) {
                monthResult = month;
                break;
            }
        }

        //if input is invalid
       if (monthNumber >= 13 || monthNumber <= 0) {
            throw new IllegalArgumentException("Month out of range, please enter a valid month number.");
       }

        return monthResult; //says need Month object

    }

    //get one random month
    @RequestMapping(value="/randomMonth", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month getRandomMonth() {
        //bound numbers 0 to 11, and add 1  to all which becomes 1 to 12
        Random rand = new Random();
        int randomNum = rand.nextInt(monthList.size()) + 1;

        Month monthResult = null;

        for(Month month : monthList) {
            if(month.getNumber() == randomNum) {
                monthResult = month;
                break;
            }
        }
        return monthResult;
    }

}
