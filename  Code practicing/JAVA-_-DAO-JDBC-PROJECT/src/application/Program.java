package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("==== TEST NUMBER 1: seller findById ====");
		Seller seller = sellerDao.findByID(3);
		System.out.println(seller);
		System.out.println("\n");
		
		System.out.println("==== TEST NUMBER 2: seller findByDepartment ====");

		Department department = new Department(2,null);
		List <Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list ){
			System.out.println(obj);
		}
		System.out.println("\n");
		
		System.out.println("==== TEST NUMBER 3: seller findAll ====");
		list = sellerDao.findAll();
		for (Seller obj : list ){
			System.out.println(obj);
		}
		System.out.println("\n");
		
		System.out.println("==== TEST NUMBER 4: seller INSERT ====");
		
		Seller newSeller = new Seller (null,"Erick","erick@uol.com", new Date(),2000.00,department);
		
		sellerDao.insert(newSeller);
		
		System.out.println("Inserted!! " +  newSeller.getid());
		
		System.out.println("==== TEST NUMBER 5: seller UPDATE ====");
		seller= sellerDao.findByID(1);
		seller.setName("Luciana Amaral");
		sellerDao.update(seller);
		System.out.println("Update Completed! ");
		
		System.out.println("==== TEST NUMBER 5: seller DELETE ====");
		System.out.println("Enter one id for the delet test");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deletion completed");
		
		sc.close();
		
		
				
	}

}
