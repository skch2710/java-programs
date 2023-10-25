package pagecalc;

public class PageCalculate {
	
	public static int totalPages(int totalElements,int pageSize) {
		return (int) Math.ceil((double) totalElements / pageSize);
	}

	public static void main(String[] args) {
		int pageNumber = 4;   
		int pageSize = 10;
		int totalElements = 44;

		int totalPages = (int) Math.ceil((double) totalElements / pageSize);
		int totalPages1 = (totalElements + pageSize - 1) / pageSize;

		boolean isLastPage = (pageNumber == totalPages);

		System.out.println("Total Pages: " + totalPages(totalElements,pageSize));
		System.out.println("Total Pages1: " + totalPages1);
		System.out.println("Is Last Page for Page " + pageNumber + ": " + isLastPage);

	}

}
