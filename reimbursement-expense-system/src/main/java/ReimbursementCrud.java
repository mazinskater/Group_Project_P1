import java.util.List;

import io.javalin.Javalin;
import model.ReimbursementPojo;
import service.ReimbursementService;
import service.ReimbursementServiceImpl;

public class ReimbursementCrud {
	
	public static void main(String[] args) {
		
<<<<<<< HEAD
		ReimbursementService reimbursementService = new ReimbursementServiceImpl();
		
		Javalin server = Javalin.create((config) -> config.enableCorsForAllOrigins()); // this line creates the Jetty Server
		server.start(7474);
		
		server.get("/reimbursement", (ctx)->{
			List<ReimbursementPojo> allRequests = reimbursementService.viewAllRequests();
			ctx.json(allRequests);
		});
		
		
		server.post("/reimbursement", (ctx) -> {
			
			ReimbursementPojo newReimbursementPojo = ctx.bodyAsClass(ReimbursementPojo.class);
			
			
			ReimbursementPojo returnBookPojo = reimbursementService.submitRequest(newReimbursementPojo);
			
			
			ctx.json(returnBookPojo);
		});
=======
>>>>>>> a467545 (viewAllReimbursement now functional)
	}

}
