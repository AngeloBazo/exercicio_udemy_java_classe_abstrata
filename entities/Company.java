package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {

		if (getNumberOfEmployees() < 10) {

			return getAnualIncome() / 100 * 16;

		}

		else {

			return getAnualIncome() / 100 * 14;

		}

	}

}
