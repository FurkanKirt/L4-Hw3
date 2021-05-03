package interfaces;

import entities.Campaign;


public interface CampaignCRUD {
	void add(Campaign compaign);
	void delete(Campaign compaign);
	void update(Campaign compaign);
	
}
