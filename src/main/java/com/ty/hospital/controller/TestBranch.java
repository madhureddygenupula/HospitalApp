package com.ty.hospital.controller;

import com.ty.hospital.dao.BranchDao;
import com.ty.hospital.dto.Branch;

public class TestBranch {

	public static void main(String[] args) {
		
		
		Branch branch=new Branch();
		branch.setName("branch-1");
		branch.setEmail("srinivasa@mail.com");
	    branch.setPhone(4356789l);
	    
	    BranchDao dao=new BranchDao();
	    dao.createBranch(1, branch);
		
	
		
	}
}
