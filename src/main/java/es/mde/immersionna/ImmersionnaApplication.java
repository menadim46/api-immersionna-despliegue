package es.mde.immersionna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class ImmersionnaApplication {
  
	  private static final Logger log = (Logger) LoggerFactory.getLogger(ImmersionnaApplication.class);

	public static void main(String[] args) {
		 ConfigurableApplicationContext context =
			        SpringApplication.run(ImmersionnaApplication.class,args);

			    System.err.println("Está funcionando la aplicación");
			    log.debug("Está funcionando la aplicación");
	}
}
