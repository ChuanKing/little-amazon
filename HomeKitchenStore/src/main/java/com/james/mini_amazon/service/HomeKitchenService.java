package com.james.mini_amazon.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.james.mini_amazon.modal.CusterReview;
import com.james.mini_amazon.modal.HomeKitchen;

@Service
public class HomeKitchenService {
	private List<HomeKitchen> inventory;

	public List<HomeKitchen> getAllHomeKitchens() {
		if (inventory == null) initHomeKitchenStore();
		return inventory;
	}

	public HomeKitchen getHomeKitchenById(Long id) {
		if (inventory == null) initHomeKitchenStore();
		
		for (int i = 0; i < inventory.size(); i++) {
			HomeKitchen homeKitchen = inventory.get(i);
			if (homeKitchen.getId() == id) {
				return homeKitchen;
			}
		}
		return null;
	}

	private void initHomeKitchenStore() {
		inventory = new ArrayList<>();

		HomeKitchen homeKitchen1 = new HomeKitchen();
		homeKitchen1.setId(1l);
		homeKitchen1.setDepartment("homeKitchen");
		homeKitchen1.setName("Linon Tavern Collection 3-Piece Table Set");
		homeKitchen1.setNumber(5);
		homeKitchen1.setPrice(109.08);
		homeKitchen1.setManufacturer("Linon Tavern");
		homeKitchen1.setWeight(49.9);
		homeKitchen1.setColor("Espresso");
		inventory.add(homeKitchen1);

		HomeKitchen homeKitchen2 = new HomeKitchen();
		homeKitchen2.setId(2l);
		homeKitchen2.setDepartment("homeKitchen");
		homeKitchen2.setName("Zinus Upholstered Diamond Stitched Platform Bed with Wooden Slat Support, Queen");
		homeKitchen2.setNumber(15);
		homeKitchen2.setPrice(160.99);
		homeKitchen2.setManufacturer("Zinus");
		homeKitchen2.setWeight(80.00);
		homeKitchen2.setColor("Grey");

		CusterReview review21 = new CusterReview();
		review21.setReviewer("Ivan and Veronika");
		review21.setReview(
				"I just received my bed this morning and thought I'd leave a review because there aren't many yet.. Looking at a similar bed by Zinus, I know they had a lot of problems with the back of the bed frame being damaged, parts not matching up, and mattresses not fitting. I also took note that their product had been put on hold as they resolved the issue.");
		review21.setScore(5);
		review21.setDate("2016-10-19");

		CusterReview review22 = new CusterReview();
		review22.setReviewer("Joshua Gruber");
		review22.setReview(
				"Excellent product! Very easy to assemble. Looks great too. We purchased it for our guest bedroom and ordered a 10\" mattress. Very happy! Literally took about 20 min to put together. Great deal especially for the price. Wish they came in other colors we would upgrade our king bed!!");
		review22.setScore(5);
		review22.setDate("2017-02-24");
		homeKitchen2.setReviews(Arrays.asList(review21, review22));

		inventory.add(homeKitchen2);

		HomeKitchen homeKitchen3 = new HomeKitchen();
		homeKitchen3.setId(3l);
		homeKitchen3.setDepartment("homeKitchen");
		homeKitchen3.setName("Zinus Newport Twin Daybed / Steel Slat Support");
		homeKitchen3.setNumber(200);
		homeKitchen3.setPrice(119.99);
		homeKitchen3.setManufacturer("Zinus");
		homeKitchen3.setWeight(49.0);
		homeKitchen3.setColor("Black");
		inventory.add(homeKitchen3);

		HomeKitchen homeKitchen4 = new HomeKitchen();
		homeKitchen4.setId(4l);
		homeKitchen4.setDepartment("homeKitchen");
		homeKitchen4.setName("Ameriwood Home Dakota L-Shaped Desk with Bookshelves (Black Ebony Ash)");
		homeKitchen4.setNumber(22);
		homeKitchen4.setPrice(82.45);
		homeKitchen4.setManufacturer("Ameriwood");
		homeKitchen4.setWeight(70.00);
		homeKitchen4.setColor("Black Ebony Ash");

		CusterReview review41 = new CusterReview();
		review41.setReviewer("Absalon");
		review41.setReview(
				"For $99 this desk is great. It was very easy to assemble, finished it under an hour. The only bad is that it came with two bumps, probably due to UPS shipping and handling. Overall I would recommend to someone looking for an affordable L shaped desk.");
		review41.setScore(4);
		review41.setDate("2014-07-02");

		CusterReview review42 = new CusterReview();
		review42.setReviewer("Francisco M.");
		review42.setReview(
				"The product arrived in a great condition and fast (3 business days via UPS). I like the furniture piece overall. Here are the pro's and con's.");
		review42.setScore(4);
		review42.setDate("2015-03-07");

		homeKitchen4.setReviews(Arrays.asList(review41, review42));
		inventory.add(homeKitchen4);
	}
}
