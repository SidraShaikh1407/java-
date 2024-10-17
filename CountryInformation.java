package skll_oop_B3_odd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryInformation {
	private static Map<String, CountryIn> countries = new HashMap<>();
	private static String[] continents = { "Africa", "Asia", "Europe", "North America", "South America", "Australia",
			"Antarctica" };

	public static void addCountryIn(String name, String capital, String continent, double area, double population,
			double gdp) {
		countries.put(name.toLowerCase(), new CountryIn(name, capital, continent, area, population, gdp));
	}

	static {
		// Adding some countries to the map with area (in sq km), population (in
		// millions), and GDP (in billion USD)
		addCountryIn("Afghanistan", "Kabul", "Asia", 652230, 38.93, 20.68);
		addCountryIn("Albania", "Tirana", "Europe", 28748, 2.87, 15.28);
		addCountryIn("Algeria", "Algiers", "Africa", 2381741, 44.18, 167.56);
		addCountryIn("Andorra", "Andorra la Vella", "Europe", 468, 0.077, 3.15);
		addCountryIn("Angola", "Luanda", "Africa", 1246700, 32.87, 66.49);
		addCountryIn("Antigua and Barbuda", "Saint John's", "North America", 442, 0.097, 1.77);
		addCountryIn("Argentina", "Buenos Aires", "South America", 2780400, 45.38, 449.66);
		addCountryIn("Armenia", "Yerevan", "Asia", 29743, 2.96, 13.67);
		addCountryIn("Australia", "Canberra", "Australia", 7692024, 25.69, 1450.00);
		addCountryIn("Austria", "Vienna", "Europe", 83879, 8.9, 480.00);
		addCountryIn("Azerbaijan", "Baku", "Asia", 86600, 10.12, 54.63);
		addCountryIn("Bahamas", "Nassau", "North America", 13943, 0.393, 11.2);
		addCountryIn("Bahrain", "Manama", "Asia", 760, 1.64, 41.74);
		addCountryIn("Bangladesh", "Dhaka", "Asia", 147570, 164.69, 324.24);
		addCountryIn("Barbados", "Bridgetown", "North America", 430, 0.287, 5.21);
		addCountryIn("Belarus", "Minsk", "Europe", 207600, 9.4, 63.08);
		addCountryIn("Belgium", "Brussels", "Europe", 30528, 11.56, 543.63);
		addCountryIn("Belize", "Belmopan", "North America", 22966, 0.43, 2.01);
		addCountryIn("Benin", "Porto-Novo", "Africa", 114763, 12.12, 14.39);
		addCountryIn("Bhutan", "Thimphu", "Asia", 38394, 0.754, 2.53);
		addCountryIn("Bolivia", "Sucre", "South America", 1098581, 11.67, 40.29);
		addCountryIn("Bosnia and Herzegovina", "Sarajevo", "Europe", 51197, 3.28, 21.47);
		addCountryIn("Botswana", "Gaborone", "Africa", 581730, 2.35, 17.61);
		addCountryIn("Brazil", "Brasilia", "South America", 8515767, 212.56, 1493.00);
		addCountryIn("Brunei", "Bandar Seri Begawan", "Asia", 5765, 0.441, 13.47);
		addCountryIn("Bulgaria", "Sofia", "Europe", 110879, 6.92, 77.9);
		addCountryIn("Burkina Faso", "Ouagadougou", "Africa", 272967, 21.51, 18.27);
		addCountryIn("Burundi", "Gitega", "Africa", 27834, 12.59, 3.17);
		addCountryIn("Cabo Verde", "Praia", "Africa", 4033, 0.555, 2.0);
		addCountryIn("Cambodia", "Phnom Penh", "Asia", 181035, 16.72, 26.7);
		addCountryIn("Cameroon", "Yaounde", "Africa", 475442, 27.2, 45.99);
		addCountryIn("Canada", "Ottawa", "North America", 9984670, 38.01, 2012.99);
		addCountryIn("Central African Republic", "Bangui", "Africa", 622984, 4.83, 2.38);
		addCountryIn("Chad", "N'Djamena", "Africa", 1284000, 17.18, 10.27);
		addCountryIn("Chile", "Santiago", "South America", 756102, 19.12, 317.07);
		addCountryIn("China", "Beijing", "Asia", 9596961, 1444.0, 17734.06);
		addCountryIn("Colombia", "Bogota", "South America", 1141748, 50.88, 367.43);
		addCountryIn("Comoros", "Moroni", "Africa", 2235, 0.869, 1.31);
		addCountryIn("Congo (Congo-Brazzaville)", "Brazzaville", "Africa", 342000, 5.66, 11.81);
		addCountryIn("Congo, Democratic Republic of the", "Kinshasa", "Africa", 2344858, 89.56, 49.87);
		addCountryIn("Costa Rica", "San Jose", "North America", 51100, 5.09, 65.63);
		addCountryIn("Croatia", "Zagreb", "Europe", 56594, 4.05, 69.36);
		addCountryIn("Cuba", "Havana", "North America", 109884, 11.33, 100.02);
		addCountryIn("Cyprus", "Nicosia", "Europe", 9251, 1.21, 28.97);
		addCountryIn("Czech Republic", "Prague", "Europe", 78867, 10.69, 281.57);
		addCountryIn("Denmark", "Copenhagen", "Europe", 43094, 5.83, 398.32);
		addCountryIn("Djibouti", "Djibouti", "Africa", 23200, 1.03, 3.68);
		addCountryIn("Dominica", "Roseau", "North America", 751, 0.072, 0.60);
		addCountryIn("Dominican Republic", "Santo Domingo", "North America", 48671, 10.85, 94.24);
		addCountryIn("Ecuador", "Quito", "South America", 283561, 17.64, 106.03);
		addCountryIn("Egypt", "Cairo", "Africa", 1010408, 104.12, 404.14);
		addCountryIn("El Salvador", "San Salvador", "North America", 21041, 6.52, 28.74);
		addCountryIn("Equatorial Guinea", "Malabo", "Africa", 28051, 1.45, 12.27);
		addCountryIn("Eritrea", "Asmara", "Africa", 117600, 3.6, 2.25);
		addCountryIn("Estonia", "Tallinn", "Europe", 45227, 1.33, 41.49);
		addCountryIn("Eswatini", "Mbabane", "Africa", 17364, 1.18, 4.97);
		addCountryIn("Ethiopia", "Addis Ababa", "Africa", 1104300, 118.98, 111.26);
		addCountryIn("Fiji", "Suva", "Australia", 18274, 0.896, 5.37);
		addCountryIn("Finland", "Helsinki", "Europe", 338455, 5.53, 289.24);
		addCountryIn("France", "Paris", "Europe", 551695, 67.08, 2935.00);
		addCountryIn("Gabon", "Libreville", "Africa", 267668, 2.34, 17.34);
		addCountryIn("Gambia", "Banjul", "Africa", 11295, 2.42, 2.12);
		addCountryIn("Georgia", "Tbilisi", "Asia", 69700, 3.71, 19);
		addCountryIn("Germany", "Berlin", "Europe", 357022, 83.13, 4211.64);
		addCountryIn("Ghana", "Accra", "Africa", 238533, 31.07, 77.59);
		addCountryIn("Greece", "Athens", "Europe", 131957, 10.42, 216.16);
		addCountryIn("Grenada", "St. George's", "North America", 344, 0.113, 1.26);
		addCountryIn("Guatemala", "Guatemala City", "North America", 108889, 18.25, 85.99);
		addCountryIn("Guinea", "Conakry", "Africa", 245857, 13.13, 15.67);
		addCountryIn("Guinea-Bissau", "Bissau", "Africa", 36125, 2.02, 1.59);
		addCountryIn("Guyana", "Georgetown", "South America", 214969, 0.79, 8.25);
		addCountryIn("Haiti", "Port-au-Prince", "North America", 27750, 11.4, 14.22);
		addCountryIn("Honduras", "Tegucigalpa", "North America", 112492, 10.07, 27.03);
		addCountryIn("Hungary", "Budapest", "Europe", 93028, 9.63, 183.45);
		addCountryIn("Iceland", "Reykjavik", "Europe", 103000, 0.343, 27.06);
		addCountryIn("India", "New Delhi", "Asia", 3287263, 1393.4, 3288.64);
		addCountryIn("Indonesia", "Jakarta", "Asia", 1904569, 276.36, 1161.03);
		addCountryIn("Iran", "Tehran", "Asia", 1648195, 85.03, 675.65);
		addCountryIn("Iraq", "Baghdad", "Asia", 438317, 40.22, 192.12);
		addCountryIn("Ireland", "Dublin", "Europe", 70273, 5.01, 499.97);
		addCountryIn("Israel", "Jerusalem", "Asia", 22072, 9.35, 467.81);
		addCountryIn("Italy", "Rome", "Europe", 301340, 59.55, 2115.37);
		addCountryIn("Jamaica", "Kingston", "North America", 10991, 2.96, 15.63);
		addCountryIn("Japan", "Tokyo", "Asia", 377975, 125.7, 4381.73);
		addCountryIn("Jordan", "Amman", "Asia", 89342, 10.27, 47.36);
		addCountryIn("Kazakhstan", "Nur-Sultan", "Asia", 2724900, 19.09, 197.43);
		addCountryIn("Kenya", "Nairobi", "Africa", 580367, 54.99, 110.35);
		addCountryIn("Kiribati", "South Tarawa", "Australia", 811, 0.119, 0.197);
		addCountryIn("Kuwait", "Kuwait City", "Asia", 17818, 4.27, 143.09);
		addCountryIn("Kyrgyzstan", "Bishkek", "Asia", 199951, 6.63, 8.45);
		addCountryIn("Laos", "Vientiane", "Asia", 236800, 7.38, 20.87);
		addCountryIn("Latvia", "Riga", "Europe", 64589, 1.85, 38.62);
		addCountryIn("Lebanon", "Beirut", "Asia", 10452, 5.39, 18.94);
		addCountryIn("Lesotho", "Maseru", "Africa", 30355, 2.14, 2.61);
		addCountryIn("Liberia", "Monrovia", "Africa", 111369, 5.18, 3.29);
		addCountryIn("Libya", "Tripoli", "Africa", 1759540, 7.07, 40.09);
		addCountryIn("Liechtenstein", "Vaduz", "Europe", 160, 0.038, 6.91);
		addCountryIn("Lithuania", "Vilnius", "Europe", 65300, 2.79, 65.87);
		addCountryIn("Luxembourg", "Luxembourg", "Europe", 2586, 0.634, 89.19);
		addCountryIn("Madagascar", "Antananarivo", "Africa", 587041, 28.92, 13.75);
		addCountryIn("Malawi", "Lilongwe", "Africa", 118484, 19.13, 12.63);
		addCountryIn("Malaysia", "Kuala Lumpur", "Asia", 330803, 32.74, 372.77);
		addCountryIn("Maldives", "Male", "Asia", 298, 0.521, 5.97);
		addCountryIn("Mali", "Bamako", "Africa", 1240192, 20.25, 19.93);
		addCountryIn("Malta", "Valletta", "Europe", 316, 0.514, 16.27);
		addCountryIn("Marshall Islands", "Majuro", "Australia", 181, 0.059, 0.22);
		addCountryIn("Mauritania", "Nouakchott", "Africa", 1030700, 4.5, 8.89);
		addCountryIn("Mauritius", "Port Louis", "Africa", 2040, 1.27, 12.24);
		addCountryIn("Mexico", "Mexico City", "North America", 1964375, 128.93, 1284.92);
		addCountryIn("Micronesia", "Palikir", "Australia", 702, 0.115, 0.402);
		addCountryIn("Moldova", "Chisinau", "Europe", 33843, 2.62, 13.75);
		addCountryIn("Monaco", "Monaco", "Europe", 2, 0.039, 7.18);
		addCountryIn("Mongolia", "Ulaanbaatar", "Asia", 1564116, 3.35, 16.93);
		addCountryIn("Montenegro", "Podgorica", "Europe", 13812, 0.622, 5.66);
		addCountryIn("Morocco", "Rabat", "Africa", 710850, 37.34, 142.87);
		addCountryIn("Mozambique", "Maputo", "Africa", 801590, 31.26, 16.10);
		addCountryIn("Myanmar", "Naypyidaw", "Asia", 676578, 54.41, 69.27);
		addCountryIn("Namibia", "Windhoek", "Africa", 825615, 2.54, 12.56);
		addCountryIn("Nauru", "Yaren District", "Australia", 21, 0.011, 0.133);
		addCountryIn("Nepal", "Kathmandu", "Asia", 147516, 29.14, 36.29);
		addCountryIn("Netherlands", "Amsterdam", "Europe", 41543, 17.53, 1025.71);
		addCountryIn("New Zealand", "Wellington", "Australia", 268838, 5.12, 253.87);
		addCountryIn("Nicaragua", "Managua", "North America", 130373, 6.85, 13.81);
		addCountryIn("Niger", "Niamey", "Africa", 1267000, 25.13, 14.96);
		addCountryIn("Nigeria", "Abuja", "Africa", 923768, 213.4, 441.50);
		addCountryIn("North Korea", "Pyongyang", "Asia", 120540, 25.78, 18.0);
		addCountryIn("North Macedonia", "Skopje", "Europe", 25713, 2.08, 14.06);
		addCountryIn("Norway", "Oslo", "Europe", 323802, 5.42, 482.57);
		addCountryIn("Oman", "Muscat", "Asia", 309500, 4.52, 84.17);
		addCountryIn("Pakistan", "Islamabad", "Asia", 881912, 231.4, 376.49);
		addCountryIn("Palau", "Ngerulmud", "Australia", 459, 0.018, 0.293);
		addCountryIn("Palestine", "East Jerusalem", "Asia", 6220, 5.23, 14.6);
		addCountryIn("Panama", "Panama City", "North America", 75417, 4.38, 70.52);
		addCountryIn("Papua New Guinea", "Port Moresby", "Australia", 462840, 9.12, 24.43);
		addCountryIn("Paraguay", "Asuncion", "South America", 406752, 7.13, 40.25);
		addCountryIn("Peru", "Lima", "South America", 1285216, 33.72, 223.83);
		addCountryIn("Philippines", "Manila", "Asia", 300000, 111.05, 433.21);
		addCountryIn("Poland", "Warsaw", "Europe", 312696, 38.38, 737.47);
		addCountryIn("Portugal", "Lisbon", "Europe", 92090, 10.31, 253.29);
		addCountryIn("Qatar", "Doha", "Asia", 11586, 2.93, 179.93);
		addCountryIn("Romania", "Bucharest", "Europe", 238397, 19.13, 309.85);
		addCountryIn("Russia", "Moscow", "Europe/Asia", 17098242, 144.1, 1710.92);
		addCountryIn("Rwanda", "Kigali", "Africa", 26338, 13.37, 11.26);
		addCountryIn("Saint Kitts and Nevis", "Basseterre", "North America", 261, 0.053, 1.03);
		addCountryIn("Saint Lucia", "Castries", "North America", 616, 0.184, 2.13);
		addCountryIn("Saint Vincent and the Grenadines", "Kingstown", "North America", 389, 0.111, 0.86);
		addCountryIn("Samoa", "Apia", "Australia", 2842, 0.202, 0.86);
		addCountryIn("San Marino", "San Marino", "Europe", 61, 0.034, 2.04);
		addCountryIn("Sao Tome and Principe", "Sao Tome", "Africa", 964, 0.223, 0.49);
		addCountryIn("Saudi Arabia", "Riyadh", "Asia", 2149690, 35.95, 833.54);
		addCountryIn("Senegal", "Dakar", "Africa", 196722, 17.2, 27.11);
		addCountryIn("Serbia", "Belgrade", "Europe", 77474, 6.74, 65.32);
		addCountryIn("Seychelles", "Victoria", "Africa", 459, 0.098, 1.57);
		addCountryIn("Sierra Leone", "Freetown", "Africa", 71740, 8.36, 4.1);
		addCountryIn("Singapore", "Singapore", "Asia", 710, 5.45, 396.99);
		addCountryIn("Slovakia", "Bratislava", "Europe", 49035, 5.43, 127.06);
		addCountryIn("Slovenia", "Ljubljana", "Europe", 20273, 2.08, 69.64);
		addCountryIn("Solomon Islands", "Honiara", "Australia", 28896, 0.707, 1.55);
		addCountryIn("Somalia", "Mogadishu", "Africa", 637657, 16.36, 5.23);
		addCountryIn("South Africa", "Pretoria", "Africa", 1221037, 60.14, 419.95);
		addCountryIn("South Korea", "Seoul", "Asia", 100210, 51.74, 1804.71);
		addCountryIn("South Sudan", "Juba", "Africa", 619745, 11.38, 3.82);
		addCountryIn("Spain", "Madrid", "Europe", 505992, 47.35, 1716.44);
		addCountryIn("Sri Lanka", "Sri Jayawardenepura Kotte", "Asia", 65610, 21.68, 82.7);
		addCountryIn("Sudan", "Khartoum", "Africa", 1886068, 44.91, 31.47);
		addCountryIn("Suriname", "Paramaribo", "South America", 163820, 0.598, 3.43);
		addCountryIn("Sweden", "Stockholm", "Europe", 450295, 10.42, 625.92);
		addCountryIn("Switzerland", "Bern", "Europe", 41284, 8.73, 878.94);
		addCountryIn("Syria", "Damascus", "Asia", 185180, 21.32, 15.81);
		addCountryIn("Taiwan", "Taipei", "Asia", 36193, 23.89, 773.55);
		addCountryIn("Tajikistan", "Dushanbe", "Asia", 143100, 9.75, 9.29);
		addCountryIn("Tanzania", "Dodoma", "Africa", 945087, 61.5, 71.37);
		addCountryIn("Thailand", "Bangkok", "Asia", 513120, 69.95, 543.55);
		addCountryIn("Timor Leste", "Dili", "Asia", 14874, 1.34, 2.34);
		addCountryIn("Togo", "Lome", "Africa", 56785, 8.88, 7.67);
		addCountryIn("Tonga", "Nuku'alofa", "Australia", 747, 0.105, 0.517);
		addCountryIn("Trinidad and Tobago", "Port of Spain", "North America", 5130, 1.4, 22.79);
		addCountryIn("Tunisia", "Tunis", "Africa", 163610, 12.04, 47.61);
		addCountryIn("Turkey", "Ankara", "Asia/Europe", 783356, 85.34, 943.21);
		addCountryIn("Turkmenistan", "Ashgabat", "Asia", 488100, 6.35, 45.23);
		addCountryIn("Tuvalu", "Funafuti", "Australia", 26, 0.011, 0.049);
		addCountryIn("Uganda", "Kampala", "Africa", 241038, 47.12, 44.43);
		addCountryIn("Ukraine", "Kyiv", "Europe", 603628, 39.32, 161.15);
		addCountryIn("United Arab Emirates", "Abu Dhabi", "Asia", 83600, 9.89, 421.14);
		addCountryIn("United Kingdom", "London", "Europe", 243610, 67.33, 3324.29);
		addCountryIn("United States", "Washington, D.C.", "North America", 9833517, 331.45, 268);
		addCountryIn("Uruguay", "Montevideo", "South America", 176215, 3.49, 82.46);
		addCountryIn("Uzbekistan", "Tashkent", "Asia", 447400, 34.24, 80.39);
		addCountryIn("Vanuatu", "Port Vila", "Australia", 12189, 0.307, 0.96);
		addCountryIn("Vatican City", "Vatican City", "Europe", 0.44, 0.001, 0.795);
		addCountryIn("Venezuela", "Caracas", "South America", 916445, 29.07, 190.12);
		addCountryIn("Vietnam", "Hanoi", "Asia", 331212, 98.17, 366.14);
		addCountryIn("Yemen", "Sana'a", "Asia", 527968, 32.98, 25.98);
		addCountryIn("Zambia", "Lusaka", "Africa", 752612, 19.47, 28.05);
		addCountryIn("Zimbabwe", "Harare", "Africa", 390757, 15.89, 21.04);

	}

	public static void displayCountriesByContinent(String continent) {
		System.out.println("Countries in " + continent + ":");
		int count = 0;
		for (CountryIn country : countries.values()) {
			if (country.getContinent().equalsIgnoreCase(continent)) {
				System.out.println("- " + country.getName());
				count++;
			}
		}
		System.out.println("Total number of countries in " + continent + ": " + count);
	}

	public static void displayCountryDetails(String countryName) {
		CountryIn country = countries.get(countryName.toLowerCase());
		if (country != null) {
			System.out.println("\nDetails for " + country.getName() + ":");
			System.out.println("Capital: " + country.getCapital());
			System.out.println("Continent: " + country.getContinent());
			System.out.println("Area: " + country.getArea() + " sq km");
			System.out.println("Population: " + country.getPopulation() + " million");
			System.out.println("GDP: " + country.getGdp() + " billion USD");
			System.out.println(" ");
		} else {
			System.out.println("Country not found.");
		}
	}

	public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 String userInput;
 System.out.println("Welcome to Country Overview!!");
 while (true) {
 System.out.println("Choose a continent from the list:");
 for (int i = 0; i < continents.length; i++) {
 System.out.println((i + 1) + ". " + continents[i]);
 }
 int choice;
 do {
 System.out.print("Enter the number of continent you want to know more about: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // consume newline
 if (choice < 1 || choice > continents.length) {
 System.out.println("Invalid choice, please try again.");
 }
 } while (choice < 1 || choice > continents.length);
 String selectedContinent = continents[choice - 1];
 displayCountriesByContinent(selectedContinent);
 System.out.println(" ");
 
 while (true) {
 System.out.print("Enter country name, 'change' to select a new continent, or 'exit' to quit: ");
 userInput = scanner.nextLine().trim();
 if (userInput.equalsIgnoreCase("exit")) {
 System.out.println(" ");
 System.out.println("Exiting the program...");
 scanner.close();
 return;
 } else if (userInput.equalsIgnoreCase("change")) {
 System.out.println("Returning to continent selection...");
 break; // Break out of the country selection loop to reselect the continent
 } else {
 displayCountryDetails(userInput);
 }
 }
 }
 }
}

class CountryIn {
	private String name;
	private String capital;
	private String continent;
	private double area; // in square kilometers
	private double population; // in millions
	private double gdp; // in billion USD

	public CountryIn(String name, String capital, String continent, double area, double population, double gdp) {
		this.name = name;
		this.capital = capital;
		this.continent = continent;
		this.area = area;
		this.population = population;
		this.gdp = gdp;
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public String getContinent() {
		return continent;
	}

	public double getArea() {
		return area;
	}

	public double getPopulation() {
 return population;
 }

public double getGdp() {
 return gdp;
}
}