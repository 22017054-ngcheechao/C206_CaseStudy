import java.time.LocalDate;

public class Discussion {
	private String topic;
    private String content;
    private String createdBy;
    private LocalDate createdDate;

    public Discussion(String topic, String content, String createdBy) {
        this.topic = topic;
        this.content = content;
        this.createdBy = createdBy;
        this.createdDate = LocalDate.now();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Topic: " + topic +
                "\nContent: " + content +
                "\nCreated By: " + createdBy +
                "\nCreated Date: " + createdDate + "\n";
    }

	public static void add(Discussion discussion) {
		// TODO Auto-generated method stub
		
	}

	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


}
