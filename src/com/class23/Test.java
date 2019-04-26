package com.class23;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("---Creating Employee Object---");
		Employee emp=new Employee();
		Employee.work();
		//emp.work(); not prefered way
		emp.salary=90000;
		emp.getPaid();	
		
		System.out.println("---Creating ScrumTeam Object---");
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, BurnDown Chart";
		st.ceremonies="Sprint grooming, Sprint planning, Daily Standup, Sprint Demo, Sprint Retro";
		st.workOnArtifacts();
		st.attendScrumMeetings();
		
		System.out.println("---Creating Developer Object---");
		Developer dev=new Developer();
		Developer.work();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint grooming, Sprint planning, Daily Standup, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		FrontEnd fe=new FrontEnd();
		fe.doHtml();
		
		BackEnd be=new BackEnd();
		be.doSql();
		
		System.out.println("---Creating Tester Object---");
		Tester qa=new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprint Backlog";
		qa.ceremonies="Sprint grooming, Sprint planning, Daily Standup, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
		
		ManualTester mt=new ManualTester();
		mt.testManually();
		
		AutomationTester at=new AutomationTester();
		at.codeInJava();
		
		System.out.println("---Creating Business Analyst Object---");
		BusinessAnalyst ba=new BusinessAnalyst();
		ba.salary=100000;
		ba.getPaid();
		ba.artifacts="Sprint Backlog";
		ba.ceremonies="Sprint grooming, Sprint planning, Daily Standup, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		
		System.out.println("---Creating Scrum Master Object---");
		ScrumMaster sm=new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprint grooming, Sprint planning, Daily Standup, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		
		System.out.println("---Creating Product Owner Object---");
		ProductOwner po=new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprint Backlog, Product Backlog";
		po.ceremonies="Sprint grooming, Sprint planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBackLog();
		po.talkToTheClient();
		
	}
	
}
