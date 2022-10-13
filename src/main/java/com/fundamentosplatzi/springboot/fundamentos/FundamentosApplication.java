package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.beans.IBean;
import com.fundamentosplatzi.springboot.fundamentos.beans.MyBeanWithProperties;
import com.fundamentosplatzi.springboot.fundamentos.component.IComponent;
import com.fundamentosplatzi.springboot.fundamentos.entity.User;
import com.fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;
import com.fundamentosplatzi.springboot.fundamentos.repository.IUserRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private final Log LOGGER = LogFactory.getLog(FundamentosApplication.class);
	private IComponent iComponent;
	private IBean iBean;
	private MyBeanWithProperties myBeanWithProperties;
	private UserPojo userPojo;
	private IUserRepository iUserRepository;
	public FundamentosApplication(@Qualifier("componentImpl") IComponent iComponent,
								  IBean iBean, MyBeanWithProperties myBeanWithProperties,
								  UserPojo userPojo, IUserRepository iUserRepository){
		this.iComponent = iComponent;
		this.iBean = iBean;
		this.myBeanWithProperties = myBeanWithProperties;
		this.userPojo = userPojo;
		this.iUserRepository = iUserRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		saveUsersInDataBase();
	}

	private void saveUsersInDataBase(){
		User user1 = new User("Jhoan", "jhoan@domain.com", LocalDate.of(2022,10,12));
		User user2 = new User("Julie", "Julie@domain.com", LocalDate.of(2022,05,12));
		User user3 = new User("Daniela", "Daniela@domain.com", LocalDate.of(2021,01,12));
		User user4 = new User("Jorge", "jorge@domain.com", LocalDate.of(2020,01,12));
		User user5 = new User("Andrea", "andrea@domain.com", LocalDate.of(2019,01,12));
		User user6 = new User("Marta", "marta@domain.com", LocalDate.of(2018,01,12));
		User user7 = new User("Mateo", "mateo@domain.com", LocalDate.of(2017,01,12));

		List<User> list = Arrays.asList(user1, user2, user3, user4, user5, user6, user7);
		list.stream().forEach(iUserRepository::save);
	}
	public void clasesAnteriores(){
		iComponent.saludar();
		iBean.imprimir();
		System.out.println(myBeanWithProperties.function());
		System.out.println(userPojo.getEmail() + "-" + userPojo.getAge());
		LOGGER.error("Esto es un error");
	}
}
