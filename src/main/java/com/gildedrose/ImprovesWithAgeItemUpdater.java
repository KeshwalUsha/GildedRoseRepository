package com.gildedrose;

public class ImprovesWithAgeItemUpdater implements Updater {

	public void update(Item item) {
		if(item.quality < 50) {
			item.quality++;
		}
		item.sellIn--;
	}

}
