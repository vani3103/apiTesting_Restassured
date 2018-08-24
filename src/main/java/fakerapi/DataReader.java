package fakerapi;

public class DataReader {
	/*
	 * [
  {
    "id": 1,
    "title": "json-server",
    "author": "typicode"
  }
]
	 */
public String id;
public String title;
public String author;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}


}
