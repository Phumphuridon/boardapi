package com.Boardzone.boardapi.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "fund")
public class FundEntity{
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fund_id;
    private String title;
    private String description;
    private int goal_amount;
    private int raised_amount;
    private int imageset_id;

    // Getters and Setters
    public int getFund_id() {
        return fund_id;
    }

    public void setFund_id(int fund_id) {
        this.fund_id = fund_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGoal_amount() {
        return goal_amount;
    }

    public void setGoal_amount(int goal_amount) {
        this.goal_amount = goal_amount;
    }

    public int getRaised_amount() {
        return raised_amount;
    }

    public void setRaised_amount(int raised_amount) {
        this.raised_amount = raised_amount;
    }

    public int getImageset_id() {
        return imageset_id;
    }

    public void setImageset_id(int imageset_id) {
        this.imageset_id = imageset_id;
    }
}
