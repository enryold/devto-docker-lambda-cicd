package me.enryold.docker.lambda;

import java.io.InputStream;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class Lambda implements RequestHandler<InputStream, String> {

    @Override
    public String handleRequest(InputStream input, Context context) {
       
        LambdaLogger logger = context.getLogger();
        logger.log("It works!");
        return null;

    }
}