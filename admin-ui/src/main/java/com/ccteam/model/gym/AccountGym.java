package com.ccteam.model.gym;

import com.ccteam.model.admin.gym.GymAccount;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by phuoclt on 6/15/17.
 */
public class AccountGym implements Serializable {

    int accountId;
    int gymAccountId;
    String fullName;
    String age;
    String picture;
    String codeFinger;
    String phoneNumber;
    LocalDate startDate;
    LocalDate endDate;

    public AccountGym(GymAccount gymAccount) {
        this.accountId = gymAccount.getAccountId().getValue();
        this.gymAccountId = gymAccount.getGymAccountId().getValue();
        this.fullName = gymAccount.getFullName().getValue();
        this.age = gymAccount.getAge().getValue();
        this.picture = gymAccount.getPicture().getValue();
        this.codeFinger = gymAccount.getCodeFinger().getValue();
        this.phoneNumber = gymAccount.getPhoneNumber().getValue();
        this.startDate = gymAccount.getStartDate().getValue();
        this.endDate = gymAccount.getEndDate().getValue();
    }

    public int getAccountId() {
        return accountId;
    }

    public int getGymAccountId() {
        return gymAccountId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAge() {
        return age;
    }

    public String getPicture() {
        return picture;
    }

    public String getCodeFinger() {
        return codeFinger;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
