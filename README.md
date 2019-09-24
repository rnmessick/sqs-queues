# sqs-queues

<!-- Received assistance on building readme by Nick Paro -->

### Links

- [Logger Queue A](./logger-react-q1/src/app.js)
- [Logger Queue B](./logger-react-q2/src/app.js)
- [Logger Queue C](./logger-react-q3/src/app.js)
- [App](./sqsQueueMessage/src/main/java/sqsQueueMessage/App.java)
- [Send](./sqsQueueMessage/src/main/java/sqsQueueMessage/Send.java)
- [Receive](./sqsQueueMessage/src/main/java/sqsQueueMessage/Receive.java)

### Run Instructions

- To start the front end:
  - `npm start` on the logger-react-queueA application.
  - `npm start` on the logger-react-queueB application.
  - `npm start` on the logger-react-queueC application.
- To start the back end:
  - `./gradlew run --args="{QUEUE_CHOICE}"` while in the sqs sub package.
    - `1` == QueueA
    - `2` == QueueB
    - `3` == QueueC

### Collaboration / Resources

- @Bombibear
- Sapana Poudel
- Nhu Trinh
- Joachen Busch
- Brandon Hurrington
- Nick Paro
- Travis Cox
- Jack Kinne
- Marisha Hoza
- Chris Coulon
- Matt Stuhring
- Melfi Perez
- Padmapriva Ganapathi
- [AWS SQS Docs](https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/examples-sqs-message-queues.html)
- [AWS SQS Example Code](https://github.com/awsdocs/aws-doc-sdk-examples/blob/master/java/example_code/sqs/src/main/java/aws/example/sqs/UsingQueues.java)
