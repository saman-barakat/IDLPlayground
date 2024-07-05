# Use the official Tomcat 9 image as the base image
FROM tomcat:9

# Copy the compiled WAR file from the target directory to the Tomcat webapps directory
COPY target/es.us.isa.idl.web-1.0.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080 for Tomcat
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
