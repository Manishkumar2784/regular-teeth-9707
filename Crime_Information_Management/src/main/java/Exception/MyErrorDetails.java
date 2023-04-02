package Exception;

import java.time.LocalDate;

public class MyErrorDetails {

private LocalDate localDate;
	
	private String Message;
	private String Description;
	public MyErrorDetails() {
		// TODO Auto-generated constructor stub
	}
	public MyErrorDetails(LocalDate localDate, String message, String description) {
		super();
		this.localDate = localDate;
		Message = message;
		Description = description;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "MyErrorDetails [localDate=" + localDate + ", Message=" + Message + ", Description=" + Description + "]";
	}

}
