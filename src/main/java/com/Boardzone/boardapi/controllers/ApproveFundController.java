/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Boardzone.boardapi.controllers;

/**
 *
 * @author User
 */
import com.Boardzone.boardapi.entity.FundEntity;
import com.Boardzone.boardapi.services.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fund")
public class ApproveFundController {

    private final FundService fundService;

    @Autowired
    public ApproveFundController(FundService fundService) {
        this.fundService = fundService;
    }

    @GetMapping("/view")
    public List<FundEntity> getAllFunds() {
        return fundService.getAllFund();
    }

    @PutMapping("/approve/{id}")
    public String approveFund(@PathVariable int id) {
        boolean result = fundService.approveFund(id);
        if (result) {
            return "Fund approval for ID: " + id + " succeeded";
        } else {
            return "Fund approval failed";
        }
    }

    @DeleteMapping("/disapprove/{id}")
    public String disapproveFund(@PathVariable int id) {
        boolean result = fundService.disapproveFund(id);
        if (result) {
            return "Fund disapproval for ID: " + id + " succeeded and has been removed";
        } else {
            return "Fund disapproval failed";
        }
    }
}