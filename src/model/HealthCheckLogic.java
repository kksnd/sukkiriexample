package model;

public class HealthCheckLogic {
	public void execute(Health health) {
		double height = health.getHeight();
		double weight = health.getWeight();
		
		double bmi = weight / (height/100) / (height/100);
		health.setBmi(bmi);
		
		String bodyType;
		if (bmi < 18.5) {
			bodyType = "Thin...!";
		} else if (bmi < 25) {
			bodyType = "Normal.";
		} else {
			bodyType = "Fat";
		}
		health.setBodyType(bodyType);
	}
}
