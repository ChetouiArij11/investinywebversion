package com.Investiny.Investiny.exception;
import java.util.Date;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class GlobalExceptionHandler implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception ex) {
        if (ex instanceof ResourceNotFoundException) {
            ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), "");
            return Response.status(Response.Status.NOT_FOUND).entity(errorDetails).build();
        } else {
            ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), "");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorDetails).build();
        }
    }
}
