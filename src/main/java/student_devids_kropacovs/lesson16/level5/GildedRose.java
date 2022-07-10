package student_devids_kropacovs.lesson16.level5;

import java.util.List;

class GildedRose {

	public void updateQuality(List<Item> items) {
		for (int i = 0; i < items.size(); i++) {
			if ((!"Aged Brie".equals(items.get(i).getName())) && !"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
				if (items.get(i).getQuality() > 0) {
					if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
						items.get(i).setQuality(items.get(i).getQuality() - 1);
					}
				}
			}
			else {
				if (items.get(i).getQuality() < 50) {
					items.get(i).setQuality(items.get(i).getQuality() + 1);

					if ("Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
						if (items.get(i).getSellIn() < 11) {
							if (items.get(i).getQuality() < 50) {
								items.get(i).setQuality(items.get(i).getQuality() + 1);
							}
						}

						if (items.get(i).getSellIn() < 6) {
							if (items.get(i).getQuality() < 50) {
								items.get(i).setQuality(items.get(i).getQuality() + 1);
							}
						}
					}
				}
			}

			if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
				items.get(i).setSellIn(items.get(i).getSellIn() - 1);
			}

			if (items.get(i).getSellIn() < 0) {
				if (!"Aged Brie".equals(items.get(i).getName())) {
					if (!"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
						if (items.get(i).getQuality() > 0) {
							if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
								items.get(i).setQuality(items.get(i).getQuality() - 1);
							}
						}
					}
					else {
						items.get(i).setQuality(items.get(i).getQuality() - items.get(i).getQuality());
					}
				}
				else {
					if (items.get(i).getQuality() < 50) {
						items.get(i).setQuality(items.get(i).getQuality() + 1);
					}
				}
			}
		}
	}

	public boolean sellInDateHasPassed(Item item){
		return item.getSellIn() < 0;
	}

	public int qualityIsZeroOrFifty(Item item){
		if(item.getQuality() <= 0){
			return 0;
		}else if(item.getQuality() >= 50){
			return 50;
		}
		return item.getQuality();
	}

	public void increaseQualityByOne(Item item){
		item.setQuality(item.getQuality() + 1);
	}

	public void decreaseQualityByOne(Item item){
		item.setQuality(item.getQuality() - 1);
	}

	public void decreaseSellInByOne(Item item){
		item.setSellIn(item.getSellIn() - 1);
	}

	public void setQualityToFifty(Item item){
		item.setQuality(50);
	}

	public void setQualityToZero(Item item){
		item.setQuality(0);
	}
	public void agedBrieItem(Item item){
		if(item.getQuality() < 50){
			increaseQualityByOne(item);
			decreaseSellInByOne(item);
		}else{
			decreaseSellInByOne(item);
		}
	}

	public void sulfurasItem(Item item){
		System.out.println("Item is not for sell!! " + "The quality of an item is " + item.getQuality());
	}

	public void backstagePassesItem(Item item){
		if(item.getSellIn() <= 10 && item.getSellIn() > 5){
			decreaseSellInByOne(item);
			increaseQualityByOne(item);
			increaseQualityByOne(item);
		}else if (item.getSellIn() <= 5 && item.getSellIn() > 0){
			decreaseSellInByOne(item);
			increaseQualityByOne(item);
			increaseQualityByOne(item);
			increaseQualityByOne(item);
		}else if (item.getSellIn() <= 0){
			setQualityToZero(item);
		}
		if(item.getQuality() > 50){
			setQualityToFifty(item);
		}
	}
}

