package com.app;

import java.time.LocalDate;

import com.dao.PaymentDao;
import com.dao.PaymentDaoFactory;
import com.entity.Cheque;
import com.entity.CreditCard;
import com.entity.Payment;

public class App {
	public static void main(String[] args) {
		Payment payment1 =new Payment();
		payment1.setPayDate(LocalDate.now());
		payment1.setPayAmt(10000);
		
		CreditCard card1=new CreditCard();
		card1.setPayDate(LocalDate.now());
		card1.setPayAmt(100000);
		card1.setCardNum(123456);
		card1.setCardType("VISA");
		
		Cheque chq=new Cheque();
		chq.setPayDate(LocalDate.now());
		chq.setPayAmt(20000);
		chq.setChequeNo(87654123);
		chq.setChequeType("Open");
		
		PaymentDao paymentDao=PaymentDaoFactory.getPaymentDao();
		paymentDao.save(card1);
		paymentDao.save(chq);
		
		
		System.out.println("-----------");
	}

}
