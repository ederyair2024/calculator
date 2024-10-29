package server;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/consultar-servicio")
public class CalculatorResource {


    @Inject
    CalculatorClient calculatorWsClient;

    @GET
    @Path("/suma")
    @Produces(MediaType.APPLICATION_JSON)
    public int suma(@QueryParam("num1") int numUno, @QueryParam("num2") int numDos) {

        return calculatorWsClient.add(numUno,numDos);

    }

    @GET
    @Path("/division")
    @Produces(MediaType.APPLICATION_JSON)
    public int divide(@QueryParam("num1") int numUno, @QueryParam("num2") int numDos) {

        if(numDos > 0 ){
           return  calculatorWsClient.divide(numUno,numDos);
        }
        return 0;

    }

    @GET
    @Path("/multiplicacion")
    @Produces(MediaType.APPLICATION_JSON)
    public int multiplica(@QueryParam("num1") int numUno, @QueryParam("num2") int numDos) {

        return calculatorWsClient.multiply(numUno,numDos);

    }

    @GET
    @Path("/resta")
    @Produces(MediaType.APPLICATION_JSON)
    public int resta(@QueryParam("num1") int numUno, @QueryParam("num2") int numDos) {

        return calculatorWsClient.subtract(numUno,numDos);

    }

}
