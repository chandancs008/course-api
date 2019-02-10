package io.demo.springbootstarter.consumerest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import io.demo.springbootstarter.topic.Topic;

public class ConsumeTopicService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsumeTopicService.class);

	public static void main(String[] args) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Topic topic =restTemplate.getForObject("http://localhost:8081/topics/1", Topic.class);
		
		LOGGER.info("Consuming my Rest Service ID is :  "+ topic.getId()+ " Topic Name is : " + topic.getName() + " !!!" );

	}

}
