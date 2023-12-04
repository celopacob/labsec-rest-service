package org.company;

import org.company.utils.LabSeq;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;


@Path("/api/labseq")
public class LabSecResource {

    @Path("/{number}")
    @GET
    public int getLabSeqSequence(int number) {
        return LabSeq.calculateLabSeq(number);
    }
}



