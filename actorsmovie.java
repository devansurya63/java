package javaprogram;
import java.util.*;
public class actorsmovie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter actor name");
		String actor=sc.nextLine();
		switch(actor)
		{
         case "vijay":
 			System.out.println("Enter movie name ");
 			String movie=sc.nextLine();
			switch(movie)
			{
			case "bigil":
			System.out.println("bigil is an block buster movie");
			break;
			case "beast" :
			System.out.println("beast is an block buster movie");
			break;
			case "varisu":
			System.out.println("varisu is an flop  movie");
			break;
			case "thupakii" :
			System.out.println("thupakii is an block buster movie");
			break;
			case "kuruvi" :
			System.out.println("kuruvi is an block buster movie");
			break;
			}
			break;
            case "sivaji":
	 		System.out.println("Enter movies name ");
	 		String movies=sc.nextLine();
			switch(movies)
				{
				case "darbar":
				System.out.println("bigil is an block buster movie");
				break;
				case "ranga" :
				System.out.println("beast is an  flop movie");
				break;
				case "jailer":
				System.out.println("varisu is an block buster  movie");
				break;
				case "sivaji" :
				System.out.println("thupakii is an  flop movie");
				break;
				case "2.0" :
				System.out.println("2.0 is an  flop movie");
				break;
				}
			break;
             case "kamal":
		 		System.out.println("Enter movie name (vikram,indian,nayagan,guna,maruthanayakam)");
		 		String moviess=sc.nextLine();
				switch(moviess)
					{
					case "vikram":
					System.out.println("vikram is an block buster movie");
					break;
					case "indian" :
					System.out.println("indian is an  flop movie");
					break;
					case "nayagan":
					System.out.println("nayagan is an block buster  movie");
					break;
					case "guna" :
					System.out.println("guna is an  flop movie");
					break;
					case "maruthanayakam" :
					System.out.println("maruthanayakan is an  flop movie");
					break;

			
			}
		
	}
}
}

