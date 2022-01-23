import java.io.*;
import java.util.*;



public class Main {

    final static String customerFilename = "C:/Users/mosia/OneDrive/Desktop/CSE 310/Java/JavaPractice/customer.txt";
    final static String meterFilename = "C:/Users/mosia/OneDrive/Desktop/CSE 310/Java/JavaPractice/meters.txt";

    public static void main(String[] args)
    {
        ArrayList<Customer> customerList = ArrayListFromFile();

		Map<String, Double> meterMap = HashMapFromFile();

		for (Customer customer : customerList) {
			double cost = customer.calculateCost(meterMap.get(customer.getMeterAddress()));
			System.out.println(customer.emailMessage(cost, "December 5th - January 5th"));

			// SendEmail sender = new SendEmail();
			// sender.sendEmail(customer.emailMessage(cost, "December 5th - January 5th"), customerEmail);
		}
    }

    static ArrayList<Customer> ArrayListFromFile()
    {
        ArrayList<Customer> customerList = new ArrayList<>();
        BufferedReader bReader = null;

        try {
            File file = new File(customerFilename);

            bReader = new BufferedReader(new FileReader(file));

            String fLine = null;

            while ((fLine = bReader.readLine()) != null) {
                String[] items = fLine.split(":");

                long customerID = Long.parseLong(items[0]);
                String meterAddress = items[1].trim();
				String customerName = items[2];
				String email;
				if(items[3].contains("@") && items[3].contains(".")) {
					email = items[3];
				}
				else {
					throw new RuntimeException(String.format("Email is incorrect for customer %d", customerID));
				}
				long phoneNumber = Long.parseLong(items[4]);
				
				Customer customer = new Customer(customerID, meterAddress, customerName, email, phoneNumber);

				customerList.add(customer);
            }
        }
		catch (Exception e) {
		e.printStackTrace();
		}
		finally {

			// Always close the BufferedReader
			if (bReader != null) {
				try {
					bReader.close();
				}
				catch (Exception e) {
				};
			}
		}
		return customerList;
	}

	static Map<String, Double> HashMapFromFile()
	{

		Map<String, Double> map = new HashMap<>();
		BufferedReader bReader = null;

		try {

			// create file object
			File file = new File(meterFilename);

			// create BufferedReader object from the File
			bReader = new BufferedReader(new FileReader(file));

			String line = null;

			// read file line by line
			while ((line = bReader.readLine()) != null) {

				// split the line by :
				String[] items = line.split(":");

				// first part is name, second is number
				String name = items[0].trim();
				Double number = Double.parseDouble(items[1]);

				// put name, number in HashMap if they are
				// not empty
				if (!name.equals("") && !number.equals(null))
					map.put(name, number);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {

			// Always close the BufferedReader
			if (bReader != null) {
				try {
					bReader.close();
				}
				catch (Exception e) {
				};
			}
		}

		return map;
	}
}




