package classes;

import entities.Campaign;
import entities.Customer;
import interfaces.CampaignSell;

public class CampaignSellManager extends CustomerCheckManager implements  CampaignSell{

	@Override
	public void sell(Campaign compaign, Customer customer) {
		if(checkPerson(customer)==false) {
			System.out.println("B�yle Bir Kullan�c� Bulunmamaktad�r!");
			return;
		}else {
			System.out.println(compaign.getDescription()+" "+customer.getFirstName()+" taraf�ndan al�nm��t�r!");
			System.out.println(compaign.getDiscoundprice()+" a kapad�n.Hadi yine iyisin k�ftehor!");
		}
		
	}

}
