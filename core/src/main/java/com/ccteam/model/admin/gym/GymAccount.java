package com.ccteam.model.admin.gym;

import com.ccteam.model.admin.gym.field.*;

/**
 * Created by phuoclt on 6/15/17.
 */
public class GymAccount {

    private AccountId accountId;
    private GymAccountId gymAccountId;
    private FullName fullName;
    private Age age;
    private Picture picture;
    private CodeFinger codeFinger;
    private PhoneNumber phoneNumber;
    private StartDate startDate;
    private EndDate endDate;

    public AccountId getAccountId() {
        return accountId;
    }

    public GymAccountId getGymAccountId() {
        return gymAccountId;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Age getAge() {
        return age;
    }

    public Picture getPicture() {
        return picture;
    }

    public CodeFinger getCodeFinger() {
        return codeFinger;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public EndDate getEndDate() {
        return endDate;
    }

    public GymAccount() {

    }

    public GymAccount(AccountId accountId, GymAccountId gymAccountId, FullName fullName, Age age, Picture picture, CodeFinger codeFinger, PhoneNumber phoneNumber, StartDate startDate, EndDate endDate) {
        this.accountId = accountId;
        this.gymAccountId = gymAccountId;
        this.fullName = fullName;
        this.age = age;
        this.picture = picture;
        this.codeFinger = codeFinger;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
