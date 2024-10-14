package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.FundEntity;
import com.Boardzone.boardapi.repository.FundRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of FundService for managing FundEntity.
 * 
 * @author manon
 */
@Service
public class FundServiceImplement implements FundService {
    private FundRepository fundrepository;
    
    @Autowired
    public FundServiceImplement(FundRepository fundrepository) {
        this.fundrepository = fundrepository;
    }
    
    @Override
    public FundEntity addFund(String title, String description, int goal_amount, int raised_amount, int imageset_id) {
        FundEntity fund = new FundEntity();
        fund.setTitle(title);
        fund.setDescription(description);
        fund.setGoal_amount(goal_amount);
        fund.setRaised_amount(raised_amount);
        fund.setImageset_id(imageset_id);
        return fundrepository.save(fund);
    }

    @Override
    public List<FundEntity> getAllFund() {
        return fundrepository.findAll();
    }

    @Override
    public FundEntity getFund(int fund_id) {
        return fundrepository.findById(fund_id).orElse(null);
    }
    
    @Override
    public void deleteFund(int fund_id) {
        fundrepository.deleteById(fund_id);
    }
    
    @Override
    public FundEntity updateFund(int fund_id, String title, String description, int goal_amount, int raised_amount, int imageset_id) {
        FundEntity fund = fundrepository.findById(fund_id).orElse(null);
        if (fund != null) {
            fund.setTitle(title);
            fund.setDescription(description);
            fund.setGoal_amount(goal_amount);
            fund.setRaised_amount(raised_amount);
            fund.setImageset_id(imageset_id);
            return fundrepository.save(fund);
        }
        return null;
    }

    @Override
    public long findFirstAvailableId() {
        List<FundEntity> allBoardGames = fundrepository.findAll();
        if (allBoardGames.isEmpty()) {
            return 1;
        }
        long maxId = allBoardGames.stream().mapToLong(FundEntity::getFund_id).max().orElse(0);
        return maxId + 1;
    }
    
    @Override
    public boolean approveFund(int fund_id) {
        FundEntity fund = fundrepository.findById(fund_id).orElse(null);
        if (fund != null) {
            return true;
        }
        return false; 
    }

    @Override
    public boolean disapproveFund(int fund_id) {
        FundEntity fund = fundrepository.findById(fund_id).orElse(null);
        if (fund != null) {
            fundrepository.deleteById(fund_id);
            return true;
        }
        return false;
}
}
