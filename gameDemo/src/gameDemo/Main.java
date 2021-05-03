package gameDemo;

import java.sql.Date;

import classes.CampaignSellManager;
import classes.CustomerManager;
import entities.Campaign;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1=new Customer("100lesh","team","gökhan","k","12345678905","g@gmail.com",new Date (1999,9,15));
		Customer customer2=new Customer("savascý","team","ugur","k","12345677855","f@gmail.com",new Date (1991,11,16));
		
		Campaign campaign1=new Campaign();
		campaign1.setId(1);
		campaign1.setPrice(1500);
		campaign1.setDiscoundRate(30);
		campaign1.setDescription("special night cars");
		
		Campaign campaign2=new Campaign();
		campaign2.setId(2);
		campaign2.setPrice(1000);
		campaign2.setDiscoundRate(15);
		campaign2.setDescription("special city cars");
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(customer1);
		System.out.println("--------------");
		customerManager.add(customer2);
		System.out.println("--------------");
		
		CampaignSellManager campaignSellManager=new CampaignSellManager();
		campaignSellManager.sell(campaign1, customer1);
		System.out.println("--------------");
		campaignSellManager.sell(campaign2, customer2);
		

	}

}
