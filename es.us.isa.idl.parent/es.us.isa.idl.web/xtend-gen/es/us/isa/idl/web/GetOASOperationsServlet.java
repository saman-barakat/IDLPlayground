package es.us.isa.idl.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.ParseOptions;
/**
 * Servlet implementation class OASOperationsServlet
 */
@WebServlet("/GetOASOperationsServlet")
public class GetOASOperationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private OpenAPI openApiSpecification = null;
 
 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetOASOperationsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/plan");
		 
		PrintWriter writer = response.getWriter();
		try{
			String apiSpecification = request.getParameter("apiSpecification");
		
		ParseOptions parseOptions = new ParseOptions();
		parseOptions.setFlatten(true);

		openApiSpecification = new OpenAPIV3Parser().read(apiSpecification, null, parseOptions);

		if (openApiSpecification == null)
			throw new Exception("API cannot be loaded from path ");
		
 
 List<String> operations = new ArrayList<>();
 
 
 openApiSpecification.getPaths().forEach((operationPath, pathItem) -> {
	 
	 if(pathItem.getGet() != null) 
		 operations.add("GET:" +operationPath);
	 
	 if(pathItem.getDelete() != null) 
		 operations.add("DELETE:" +operationPath);
	 
	 if(pathItem.getHead() != null) 
		 operations.add("HEAD:" + operationPath);
	 
	 if(pathItem.getOptions() != null) 
		 operations.add("OPTIONS:" + operationPath);
	 
	 if(pathItem.getPatch() != null) 
		 operations.add("PATCH:" + operationPath);
	 
	 if(pathItem.getPost() != null) 
		 operations.add("POST:" + operationPath);
	 
	 if(pathItem.getPut() != null) 
		 operations.add("PUT:" + operationPath); 
 }
);

 writer.print(operations.toString());
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		response.setStatus(400);
		writer.print(e.getMessage());
		writer.flush();
	}
		writer.close();	 
	}

}
