import model.Benutzer;
import model.BenutzerRepository;
import model.Buchung;
import model.BuchungRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootApplication
public class CoworkingSpaceApplication {
	private static final Logger log = LoggerFactory.getLogger(CoworkingSpaceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CoworkingSpaceApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoUsers(BenutzerRepository userRepository, BuchungRepository repository) {
		return (args) -> {
			// save a couple of entities
/*
			log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>CommandlineRunner::demoTasksWithJwt");
			String salt = BCrypt.gensalt();

			log.info("salt : "+salt);
			Benutzer u1 = new Benutzer("admin", BCrypt.hashpw("123",salt), salt, "admin");
			Benutzer u2 = new Benutzer("member", BCrypt.hashpw("231",salt), salt, "member");
			Benutzer u3 = new Benutzer("guest", BCrypt.hashpw("321",salt), salt, "guest");

			BenutzerRepository.save(u1);
			BenutzerRepository.save(u2);
			BenutzerRepository.save(u3);
			// fetch all tasks
			log.info("Users found with findAll():");
			log.info("-------------------------------");
			for (Benutzer user : userRepository.findAll()) {
				log.info(user.toString());
			}
			log.info("");
			log.info("User and Roles persisted in DemoDataLoader");



			// save a couple of customers
			Buchung t1 = new Buchung(u1,"Dinner with my Family");
			Buchung t2 = new Buchung(u2,"movie Night with my Family");
			Buchung t3 = new Buchung(u3,"Brunch with my Students");


			repository.save(t1);
			repository.save(t2);
			repository.save(t3);


			// fetch all tasks
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Buchung task : repository.findAll()) {
				log.info(task.toString());
			}
			log.info("");

			// fetch an individual Task by ID
			repository.findById(1L).ifPresent(task -> {
				log.info("Task found with findById(1L):");
				log.info("--------------------------------");
				log.info(task.toString());
				log.info("");
			});

			log.info("tasks");
*/
			System.out.println("check");




		};
	}


}
