package com.example.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDaoImpl implements MembershipDao{
    @Override
    public void addSillyAccount() {
        System.out.println(getClass() +"doing by db :adding account");
    }
}
