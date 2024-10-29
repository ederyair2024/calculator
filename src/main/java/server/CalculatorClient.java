package server;

import io.quarkiverse.cxf.annotation.CXFClient;
import org.tempuri.CalculatorSoap;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


@ApplicationScoped
public class CalculatorClient {

    @Inject @CXFClient("calculator-ws-client")
    CalculatorSoap calculatorService;

    public int add(int a, int b) {

        return calculatorService.add(a, b);
    }

    public int divide(int a, int b) {
        return calculatorService.divide(a,b);
    }

    public int multiply(int a, int b) {
        return calculatorService.multiply(a, b);
    }

    public int subtract(int a, int b) {
        return calculatorService.subtract(a,b);
    }
}
