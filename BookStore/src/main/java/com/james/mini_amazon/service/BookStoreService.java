package com.james.mini_amazon.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.james.mini_amazon.model.Book;
import com.james.mini_amazon.model.CusterReview;

@Service
public class BookStoreService {

	private List<Book> inventory;

	public List<Book> getAllBooks() {
		if (inventory == null) initBookStore();
		return inventory;
	}

	public Book getBookById(Long id) {
		if (inventory == null) initBookStore();
		
		for (int i = 0; i < inventory.size(); i++) {
			Book book = inventory.get(i);
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	private void initBookStore() {
		inventory = new ArrayList<>();

		Book book1 = new Book();
		book1.setId(1l);
		book1.setDepartment("book");
		book1.setName("The Ministry of Utmost Happiness");
		book1.setNumber(20);
		book1.setPrice(19.68);
		book1.setPublisher("Knopf");
		book1.setPublishYear("2017-0606");
		book1.setIsbn("1524733156");
		inventory.add(book1);

		Book book2 = new Book();
		book2.setId(2l);
		book2.setDepartment("book");
		book2.setName("Killers of the Flower Moon");
		book2.setNumber(50);
		book2.setPrice(19.68);
		book2.setPublisher("Doubleday");
		book2.setPublishYear("2017-04-18");
		book2.setIsbn("0385534248");

		CusterReview review21 = new CusterReview();
		review21.setReviewer("Rob M.");
		review21.setReview(
				"This is one of the most heartbreaking and terrifying books I have ever read. I hope that it becomes a staple of reading lists for American history classes. It is an incredibly well told story of a staggering real world evil in an America only two or three generations removed from our own. You should read it. It won't take long - it is, though it feels crass to say so, a genuine page-turner. And I at least will likely wrestle with it for a long while. Man o man.");
		review21.setScore(5);
		review21.setDate("2017-04-29");

		CusterReview review22 = new CusterReview();
		review22.setReviewer("Reading Prof");
		review22.setReview(
				"This is one of the best true crime historical accounts I've ever read. From start to finish it is compelling reading that didn't let me put the book down. A darkly fascinating subject well rendered.");
		review22.setScore(5);
		review22.setDate("2017-04-18");
		book2.setReviews(Arrays.asList(review21, review22));

		inventory.add(book2);

		Book book3 = new Book();
		book3.setId(3l);
		book3.setDepartment("book");
		book3.setName("Beartown");
		book3.setNumber(6);
		book3.setPrice(20.33);
		book3.setPublisher("Atria Books");
		book3.setPublishYear("2017-04-25");
		book3.setIsbn("1501160761");
		inventory.add(book3);

		Book book4 = new Book();
		book4.setId(4l);
		book4.setDepartment("book");
		book4.setName("Exit West");
		book4.setNumber(4);
		book4.setPrice(17.68);
		book4.setPublisher("Riverhead Books");
		book4.setPublishYear("2017-03-07");
		book4.setIsbn("0735212171");

		CusterReview review41 = new CusterReview();
		review41.setReviewer("TejasPenguin");
		review41.setReview(
				"Once in a while I come across a novel that makes me wish I were teaching again, a novel that begs for questions and discussion. This is one of those novels. Its brevity belies its complexity. Its characters -- main, minor, fleeting, and implied -- represent humanity as it is today. Its premise, while fanciful, creates the opportunity for readers to wonder if we have the courage to radically change how we view others and the world in which we all live. I read in a review that this is a hopeful novel and initially I was suspicious that a novel centering on the plight of innocent refugees fleeing violence and death could ultimately proffer a hopeful message. But hope there is despite the literal impossibility of its central plot device. The doors are a metaphor; do we have the courage to open them to those with the courage to walk through? Told in a spare but descriptive narrative, Mr. Hamid challenges his readers to open their minds to the possibilities that the future holds.");
		review41.setScore(5);
		review41.setDate("2017-03-14");

		CusterReview review42 = new CusterReview();
		review42.setReviewer("Kate Vane");
		review42.setReview(
				"I liked reading about the perilous journey of the two main characters. Some of the details made me imagine what that would be like. My main criticism of the book is that Nadia and Sayeed are never fully formed, so that the reader doesn't get attached to them. This is the only thing I've read by this author, so I don't know if that is his usual style. I recommend the book for the strong imagery and sense of place as the characters move from Mykonos to London to the San Francisco bay area.");
		review42.setScore(4);
		review42.setDate("2017-03-02");

		book4.setReviews(Arrays.asList(review41, review42));
		inventory.add(book4);
	}

}
