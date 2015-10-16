package servicemixjaxrs.example;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/library")
public class App 
{	
	@GET
	@Path("/books/{bookid}")
	public String getBook(@PathParam("bookid") String bookid) {
		return "Book Id - "+bookid+" Data";
	}

	@POST
	@Path("/books")
	public String postBook(String book){
		return "Saved book - " + book;
	}
}
