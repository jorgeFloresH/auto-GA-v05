package org.umssdiplo.automationv01.core.customrestassure;

import io.restassured.specification.RequestSpecification;

import java.security.NoSuchAlgorithmException;

/**
 * Class to manage the IEndPoint
 *
 * @author <a href="mailto:luis.marcelo.garay@gmail.com">Marcelo Garay</a>
 * @version 1.0
 */
public interface IEndPoint {
    void initializeRequestSpecification();

    RequestSpecification getRequestSpecification() throws CloneNotSupportedException, NoSuchAlgorithmException;
}
