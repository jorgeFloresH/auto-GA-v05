package org.umssdiplo.automationv01.core.customrestassure;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

/**
 * Manage PostMan Echo
 *
 * @author <a href="mailto:luis.marcelo.garay@gmail.com">Marcelo Garay</a>
 * @version 1.0
 */
public class PostmanEcho implements IEndPoint {

    private static PostmanEcho instance = new PostmanEcho();
    private RequestSpecification requestSpecification;

    private PostmanEcho() {
        initializeRequestSpecification();
    }

    public static PostmanEcho getInstance() {
        return instance;
    }

    @Override
    public void initializeRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(PropertyAccessor.getInstance().getBaseUri())
                .addHeader("my-sample-header", "Lorem ipsum dolor sit amet")
                .build();
    }

    @Override
    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }
}
