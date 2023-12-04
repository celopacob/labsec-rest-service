package org.company;

import java.util.OptionalInt;

import org.company.utils.LabSeq;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;


@Path("/api/labseq")
public class LabSecResource {

    @Path("/{number}")
    @GET
    public Response getLabSeqSequence(int number) {

        // Quick validation for simplicity (not negative)
        if(int.class.isInstance(number) && number >= 0) {
            int result = LabSeq.calculateLabSeq(number);
            return Response.status(Response.Status.OK).entity(result).build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST)
                .entity("Number must be positive int.")
                .build();
        }
    }
}



