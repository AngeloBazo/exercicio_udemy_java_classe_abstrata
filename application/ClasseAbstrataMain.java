package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.TaxPayer;
import entities.Company;

public class ClasseAbstrataMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<TaxPayer> listTaxPayer = new ArrayList<>();

		System.out.print("Enter the mumber of tax payers: ");
		int taxPayers = sc.nextInt();

		for (int i = 1; i < taxPayers + 1; i++) {
			
			System.out.println();
			System.out.println("Tax payer #" + i + " data: ");
			System.out.println();

			System.out.print("Individual or company (i/c)? ");
			char IndOrComp = sc.next().charAt(0);

			System.out.print("Name: ");
			String name = sc.next();

			System.out.print("Atual income: ");
			double anualIncome = sc.nextDouble();

			if (IndOrComp == 'i') {

				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();

				listTaxPayer.add(new Individual(name, anualIncome, healthExpenditures));

			} else {

				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();

				listTaxPayer.add(new Company(name, anualIncome, numberOfEmployees));

			}

		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Taxes paid: ");
		
		for (int i = 0; i<listTaxPayer.size(); i++) {
			
			System.out.println(listTaxPayer.get(i));
			
		}
			
		
		

	}

}
