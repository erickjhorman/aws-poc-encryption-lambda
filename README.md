#### S3 event lambda function

1. Create a bucket with the following name ***poc-lambda-decryption-file***
2. Create a Rol with the following name Lambda-s3-event and permissions 
     - AmazonS3ReadOnlyAccess
     - AWSLambdaBasicExecutionRole
3. Create a lambda function with the following name ***poc-pgp-decryption***
4. Upload any file in your bucket and to trigger the function.