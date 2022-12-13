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
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.ParseOptions;


/**
 * Servlet implementation class GetIDL
 */
@WebServlet("/GetIDLServlet")
public class GetIDLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private OpenAPI openApiSpecification = null;
	private static final String X_DEPENDENCIES = "x-dependencies";
	/**
	 * Operation object.
	 */
	private Operation operation;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetIDLServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/plan");
		 
		List<String> idl = null ;
		List<String> newIDL = new ArrayList<>();
		
		PrintWriter writer = response.getWriter();
		try{
			String apiSpecification = request.getParameter("apiSpecification").trim();
			String path = request.getParameter("path").trim();
			String methodType = request.getParameter("methodType").trim();
			
			ParseOptions parseOptions = new ParseOptions();
			parseOptions.setFlatten(true);

			openApiSpecification = new OpenAPIV3Parser().read(apiSpecification, null, parseOptions);

			if (openApiSpecification == null)
				throw new Exception("API cannot be loaded from path ");
			
			operation = getOasOperation(path, methodType); 
			
			if(operation != null) 
				if(operation.getExtensions() != null) 	
					idl = ((List<String>) operation.getExtensions().get(X_DEPENDENCIES));
		 
			if(idl != null)	
				for(String str:idl) 
					newIDL.add('"'+str+'"');
			
			 writer.print(newIDL);
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response.setStatus(400);
			writer.print(e.getMessage());
			writer.flush();
		}
			writer.close();	
	}

		private Operation getOasOperation(String operationPath, String operationType) throws Exception {
			PathItem item = this.openApiSpecification.getPaths().get(operationPath);
			if (item != null) {
				try {
					switch (operationType) {
					case "GET":
						return item.getGet();
					case "DELETE":
						return item.getDelete();
					case "HEAD":
						return item.getHead();
					case "OPTIONS":
						return item.getOptions();
					case "PATCH":
						return item.getPatch();
					case "POST":
						return item.getPost();
					case "PUT":
						return item.getPut();
					default:
						return null;
					}
				} catch (Exception e) {

					return null;
				}
			} else {

				return null;
			}
}}
