package classes;

import entities.Campaign;
import entities.Customer;
import interfaces.CampaignSell;

public class CampaignSellManager extends CustomerCheckManager implements  CampaignSell{

	@Override
	public void sell(Campaign compaign, Customer customer) {
		if(checkPerson(customer)==false) {
			System.out.println("Böyle Bir Kullanýcý Bulunmamaktadýr!");
			return;
		}else {
			System.out.println(compaign.getDescription()+" "+customer.getFirstName()+" tarafýndan alýnmýþtýr!");
			System.out.println(compaign.getDiscoundprice()+" a kapadýn.Hadi yine iyisin köftehor!");
		}
		
	}

}
