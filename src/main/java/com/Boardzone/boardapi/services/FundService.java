package com.Boardzone.boardapi.services;

import com.Boardzone.boardapi.entity.FundEntity;
import java.util.List;

/**
 * Service interface for managing funds.
 * Provides methods to perform CRUD operations on FundEntity.
 * 
 * @author manon
 */
public interface FundService {
    FundEntity addFund(String title, String description,  int goal_amount, int raised_amount, int imageset_id);
    List<FundEntity> getAllFund();
    FundEntity getFund(int fund_id);
    void deleteFund(int fund_id);
    FundEntity updateFund(int fund_id, String title, String description,  int goal_amount, int raised_amount, int imageset_id);
    long findFirstAvailableId();
    boolean approveFund(int fund_id);
    boolean disapproveFund(int fund_id);

}
