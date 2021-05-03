package classes;

import entities.Campaign;
import interfaces.CampaignCRUD;


public class CampaingnManager implements CampaignCRUD{



	@Override
	public void add(Campaign compaign) {
		System.out.println("Kampanya Eklendi!");
		
	}

	@Override
	public void delete(Campaign compaign) {
		System.out.println("Kampanya Silindi!");
		
	}

	@Override
	public void update(Campaign compaign) {
		System.out.println("Kampanya Güncellendi!");
		
	}
	

}
