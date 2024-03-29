package sqsQueueMessage;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;

import java.util.List;

public class Receive {

    public static void receive(String queueName) {
        final String QUEUE_NAME = "queueName";
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();

        String queueUrl = sqs.getQueueUrl(QUEUE_NAME).getQueueUrl();

        // receive messages from the queue
        List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();
        for (Message m : messages) {
            System.out.println(m);
        }

        // delete messages from the queue
        for (Message m : messages) {
            sqs.deleteMessage(queueUrl, m.getReceiptHandle());
        }
    }
}
