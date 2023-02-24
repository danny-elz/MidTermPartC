package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Display available genres
            System.out.println("Available genres:");
            String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
            for (String genre : genres) {
                System.out.println("- " + genre);
            }

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Choose your favourite genre: ");
            String genre = scanner.nextLine();

            boolean validGenre = false;
            for (String availableGenre : genres) {
                if (availableGenre.equalsIgnoreCase(genre)) {
                    validGenre = true;
                    break;
                }
            }

            if (!validGenre) {
                System.out.println("Invalid genre selected. Please try again.");
                return;
            }


            UserProfile userProfile = new UserProfile(name, genre);
            System.out.println("User profile created: " + userProfile.getUserID() + " \nFavourite Genre:  " + userProfile.getGenre());
        }
    }


