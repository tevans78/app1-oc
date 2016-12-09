package wasdev.sample.servlet;


import javax.enterprise.context.RequestScoped;

@RequestScoped
public class TestService {
	public String getString() {
		return "ploum";
	}
}
