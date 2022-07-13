package com.company.M2ChallengeLiZheQi.controller;

import com.company.M2ChallengeLiZheQi.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
@RestController
public class MathSolutionController {
//    // Create add endpoint
    @RequestMapping(value="/add", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution createAdd(@RequestBody @Valid MathSolution mathSolution) {
//        //use .setAnswer()
        mathSolution.setAnswer(mathSolution.getOperand1() + mathSolution.getOperand2());
//
////        Double double1 = new Double(mathSolution.getOperand1());
////        Double double2 = new Double(mathSolution.getOperand2());
//
//        if (mathSolution.getOperand1() == Integer.parseInt(null)) {
//            throw new IllegalArgumentException("Missing operand 1.");
//        } else if (mathSolution.getOperand2() == Integer.parseInt(null)) {
//            throw new IllegalArgumentException("Missing operand 2.");
//        } //use NaN instead of Scanner.hasNextInt() here for checking not number
//        else if (double1 == NaN && double2 == NaN) {
//            throw new IllegalArgumentException("Operands must both be numbers.");
//        }
        return mathSolution;
    }
//
    @RequestMapping(value="/subtract", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution createSubtract(@RequestBody @Valid MathSolution mathSolution) {
        mathSolution.setAnswer(mathSolution.getOperand1() - mathSolution.getOperand2());
//
//
//        Double double1 = new Double(mathSolution.getOperand1());
//        Double double2 = new Double(mathSolution.getOperand2());
//
//        if (mathSolution.getOperand1() == Integer.parseInt(null)) {
//            throw new IllegalArgumentException("Missing operand 1.");
//        } else if (mathSolution.getOperand2() == Integer.parseInt(null)) {
//            throw new IllegalArgumentException("Missing operand 2.");
//        }
////        else if (double1 == NaN && double2 == NaN) {
////            throw new IllegalArgumentException("Operands must both be numbers.");
////        }
        return mathSolution;
    }
//
    @RequestMapping(value="/multiply", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution createMultiply(@RequestBody @Valid MathSolution mathSolution) {
        mathSolution.setAnswer(mathSolution.getOperand1() * mathSolution.getOperand2());
//
//
//        Double double1 = new Double(mathSolution.getOperand1());
//        Double double2 = new Double(mathSolution.getOperand2());
//
//        if (mathSolution.getOperand1() == Integer.parseInt(null)) {
//            throw new IllegalArgumentException("Missing operand 1.");
//        } else if (mathSolution.getOperand2() == Integer.parseInt(null)) {
//            throw new IllegalArgumentException("Missing operand 2.");
//        }
////        else if (double1 == NaN && double2 == NaN) {
////            throw new IllegalArgumentException("Operands must both be numbers.");
////        }
        return mathSolution;
    }
//
    @RequestMapping(value="/divide", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution createDivide(@RequestBody @Valid MathSolution mathSolution) {
        mathSolution.setAnswer(mathSolution.getOperand1() / mathSolution.getOperand2());
//        Double double1 = new Double(mathSolution.getOperand1());
//        Double double2 = new Double(mathSolution.getOperand2());
//
//        if (mathSolution.getOperand1() == Integer.parseInt(null)) {
//            throw new IllegalArgumentException("Missing operand 1.");
//        } else if (mathSolution.getOperand2() == Integer.parseInt(null)) {
//            throw new IllegalArgumentException("Missing operand 2.");
//        }
////        else if (double1 == NaN && double2 == NaN) {
////            throw new IllegalArgumentException("Operands must both be numbers.");
////        } // cannot divide by 0
////        else if (mathSolution.getOperand2() ==0) {
//            throw new IllegalArgumentException("Cannot divide by zero");
//        }
        return mathSolution;
    }
}
