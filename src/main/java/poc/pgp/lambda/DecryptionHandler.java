package poc.pgp.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;

public class DecryptionHandler implements RequestHandler<S3Event, Boolean> {
    @Override
    public Boolean handleRequest(S3Event input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Function" + context.getFunctionName() + " called");
        logger.log("Getting name of the bucket" + input.getRecords().get(0).getS3().getBucket().getName());

        /* To do
         1.Add respectively PGP decryption logic
         2.
         */

        return null;
    }
}
