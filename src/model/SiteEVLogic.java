package model;

public class SiteEVLogic {
	public void like(SiteEV site) {
		site.setLike(site.getLike() + 1);
	}
	public void dislike(SiteEV site) {
		site.setDislike(site.getDislike() + 1);
	}
}
