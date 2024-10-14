//package com.Boardzone.boardapi.controllers;
//
//import com.Boardzone.boardapi.entity.FundEntity;
//import com.Boardzone.boardapi.services.FundService;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/fund")
//public class FundController {
//
//    private final FundService fundService;
//
//    @Autowired
//    public FundController(FundService fundService) {
//        this.fundService = fundService;
//    }
//
//    @GetMapping("/view")
//    public List<FundEntity> getAllFunds() {
//        return fundService.getAllFund();
//    }
//    
//    @GetMapping("/id/{id}")
//    public FundEntity getFundId(@PathVariable int id) { // Use Long here to match your service method
//        FundEntity fund = fundService.getFund(id); // Use correct method name
//        if (fund == null) {
//            throw new RuntimeException("No fund found with ID: " + id); // Correct the error message
//        }
//        return fund;
//    }
//    
// @PostMapping("/add")
//    public FundEntity addFund(@RequestBody FundEntity fund) {
//        fund.setFund_id(0); 
//        return fundService.addFund( // ใช้ fundService แทน FundService
//            fund.getTitle(),
//            fund.getDescription(),
//            fund.getGoal_amount(),
//            fund.getRaised_amount(),
//            fund.getImageset_id()
//        );
//    }
//
//    @PutMapping("/update/{id}")
//    public FundEntity updateFund(@PathVariable int id, @RequestBody FundEntity fund) { // Change Fund to fund
//        FundEntity updatedFund = fundService.updateFund(
//            id,
//            fund.getTitle(),
//            fund.getDescription(),
//            fund.getGoal_amount(),
//            fund.getRaised_amount(),
//            fund.getImageset_id()
//        );
//        if (updatedFund == null) {
//            throw new RuntimeException("No fund found with ID: " + id);
//        }
//        return updatedFund;
//    }
//    
//    @DeleteMapping("/delete/{id}")
//    public String deleteFund(@PathVariable int id) { // Change to Long
//        FundEntity fund = fundService.getFund(id); // Use the correct method to get the fund
//        if (fund == null) {
//            throw new RuntimeException("No fund found with ID: " + id);
//        }
//        fundService.deleteFund(id); // Correctly call deleteById
//        return "Deleted fund with ID: " + id;
//    }
//}
