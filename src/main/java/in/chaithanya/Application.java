package in.chaithanya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.chaithanya.entityManager.Player;
import in.chaithanya.repositoryManager.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
        PlayerRepository playerRepository=context.getBean(PlayerRepository.class);
		
		Player p1=new Player();
		p1.setPlayerId(12);
		p1.setPlayerName("chaithanya");
		p1.setPlayerAge(25);
		p1.setLocation("Vijayawada");
		playerRepository.save(p1);
		
		System.out.println("data is printed...");
		
	}

}
