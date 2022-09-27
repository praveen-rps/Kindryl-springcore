package kindrylspringcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfiguration {
	
	@Bean(name="ad1")
	public Address getAddress() {
		return new Address(987,"T Nagar", "Chennai");
	}

}
