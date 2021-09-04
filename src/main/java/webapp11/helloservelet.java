package webapp11;
import java.lang.Object;
import java.lang.Class;
import java.io.IOException;

public class helloservelet extends HttpServelet {
	
	private static final long seriolVersionUID = 1L;
	
	public helloservelet() {
		super();
	}
	
	protected void doGet(HttpServeletRequest request, HttpServeletResponse response)
	            throws ServeletException, IOException {
		    response.getWriter("Hello: ");
		    request.getParameter("name");
		}
	
	protected void doPost(HttpServeletRequest request, HttpServeletResponse response)
            throws ServeletException, IOException {
       doGet(request, response);
}
}