/*package www.com.automatizacion.utils.reporting;



import org.eclipse.jetty.ee10.servlet.DefaultServlet;
import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.ee10.servlet.ServletHolder;
import org.eclipse.jetty.server.Server;


import java.io.File;

public class SimpleServer {
    public static void main(String[] args) throws Exception {
        // Puerto del servidor
        Server server = new Server(8080);

        // Ruta del reporte
        String reportPath = "target/site/serenity";
        File baseDir = new File(reportPath);
        if (!baseDir.exists()) {
            System.out.println("El directorio del reporte no existe: " + reportPath);
            return;
        }

        // Crear contexto
        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");

        // Configurar el servlet por defecto
        ServletHolder defaultServlet = new ServletHolder("default", DefaultServlet.class);
        defaultServlet.setInitParameter("dirAllowed", "true");
        defaultServlet.setInitParameter("welcomeServlets", "true");
        defaultServlet.setInitParameter("resourceBase", baseDir.getAbsolutePath());

        context.addServlet(defaultServlet, "/");

        // Asignar handler
        server.setHandler(context);

        // Iniciar
        server.start();
        System.out.println("Servidor iniciado en: http://localhost:8080");
        server.join();
    }
}*/
