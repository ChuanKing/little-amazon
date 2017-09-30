package com.james.mini_amazon.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.james.mini_amazon.modal.CusterReview;
import com.james.mini_amazon.modal.Electronic;

@Service
public class ElectronicStoreService {
	private List<Electronic> inventory;

	public List<Electronic> getAllElectronics() {
		if (inventory == null) initElectronicStore();
		return inventory;
	}

	public Electronic getElectronicById(Long id) {
		if (inventory == null) initElectronicStore();
		
		for (int i = 0; i < inventory.size(); i++) {
			Electronic electronic = inventory.get(i);
			if (electronic.getId() == id) {
				return electronic;
			}
		}
		return null;
	}

	private void initElectronicStore() {
		inventory = new ArrayList<>();

		Electronic electronic1 = new Electronic();
		electronic1.setId(1l);
		electronic1.setDepartment("electronic");
		electronic1.setName("Samsung Galaxy J3 Mission 5\" Prepaid Carrier Locked - 16 GB - Black ");
		electronic1.setNumber(100);
		electronic1.setPrice(119.90);
		electronic1.setWifi(true);
		electronic1.setSystem("Android");
		electronic1.setColor("Black");
		inventory.add(electronic1);

		Electronic electronic2 = new Electronic();
		electronic2.setId(2l);
		electronic2.setDepartment("electronic");
		electronic2.setName("Echo Dot");
		electronic2.setNumber(45);
		electronic2.setPrice(49.99);
		electronic2.setWifi(true);
		electronic2.setSystem("Fire OS");
		electronic2.setColor("Black");

		CusterReview review21 = new CusterReview();
		review21.setReviewer("Roy Estaris");
		review21.setReview(
				"My brother Robert who has been bed ridden and paralyzed with Multiple Sclerosis from his neck down for more than 30 years now has a new friend named Alexa! He was in tears with happiness when Alexa played 70's music, played Jeopardy, answered all his questions and wakes him up every morning. Thank you Amazon for giving my brother a new bedside companion.");
		review21.setScore(5);
		review21.setDate("2016-12-01");

		CusterReview review22 = new CusterReview();
		review22.setReviewer("tony dong");
		review22.setReview(
				"Pros Access to thousands of Alexa “Skills” Audio-out port and Bluetooth speaker support At $50, it's $85 cheaper than the full-size Echo");
		review22.setScore(5);
		review22.setDate("2017-08-08");
		electronic2.setReviews(Arrays.asList(review21, review22));

		inventory.add(electronic2);

		Electronic electronic3 = new Electronic();
		electronic3.setId(3l);
		electronic3.setDepartment("electronic");
		electronic3.setName("Habor Wireless Mouse, 2.4G Computer Mice Portable Optical Cordless Mouse with USB Receiver, 5 Adjustable DPI Levels, 6 Buttons Wireless Gaming Mouse for Laptop, PC, Macbook - Black");
		electronic3.setNumber(500);
		electronic3.setPrice(8.99);
		electronic3.setWifi(false);
		electronic3.setSystem(null);
		electronic3.setColor("Black");
		inventory.add(electronic3);

		Electronic electronic4 = new Electronic();
		electronic4.setId(4l);
		electronic4.setDepartment("electronic");
		electronic4.setName("Microsoft Surface Book (Intel Core i5, 8GB RAM, 128GB) with Windows 10 Anniversary Update");
		electronic4.setNumber(21);
		electronic4.setPrice(1199.00);
		electronic4.setWifi(true);
		electronic4.setSystem("Windows");
		electronic4.setColor("Gray");

		CusterReview review41 = new CusterReview();
		review41.setReviewer("Ibrahim Alloub");
		review41.setReview(
				" did extensive research about the surfacebook and I read so many negative reviews about the software and the bugs, but I was so impressed by the idea of the product so I ended up buying it.");
		review41.setScore(4);
		review41.setDate("2016-04-05");

		CusterReview review42 = new CusterReview();
		review42.setReviewer("BONES");
		review42.setReview(
				"Just scanning through the reviews, it seems there are some very different experiences here. What is clear, though, is that all of those who are disappointed were first-day buyers so I'd look at the one star reviews as a cautionary tale about the perils of being an early adopter. I was a bit lucky, in that I live in Australia and the release was delayed until Microsoft's new flagship store opened in Sydney a couple of weeks ago. I also had another delay when I broke mine. Apparently you should not try to repartition PCIe drives. Oops. So I took it back to the store and they reinitialised everything and applied the latest updates. The service was excellent and it means my experience is of a Surface Book with the latest Windows 10 updates, which seems to make all the difference.");
		review42.setScore(5);
		review42.setDate("2015-11-28");

		electronic4.setReviews(Arrays.asList(review41, review42));
		inventory.add(electronic4);
	}
}
